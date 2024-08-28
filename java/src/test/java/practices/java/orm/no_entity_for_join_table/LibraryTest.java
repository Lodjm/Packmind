package practices.java.orm.no_entity_for_join_table;

import static java.util.UUID.randomUUID;
import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryTest {

  private SessionFactory sessionFactory;

  private final Library library = new Library();

  @BeforeEach
  void setUp() throws SQLException {
    initDB();

    Configuration hibernateConfig = configureHibernate();
    sessionFactory = hibernateConfig.buildSessionFactory();

    StatelessSession statelessSession = sessionFactory.withStatelessOptions()
        .openStatelessSession();

    library.authors = new AuthorsRepository_(statelessSession);
  }

  @AfterEach
  void tearDown() throws SQLException {
    if (sessionFactory != null) {
      sessionFactory.close();
    }
    try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:test", "sa", "")) {
      conn.createStatement().execute("SHUTDOWN");
    }
  }

  @Test
  void dorraWroteOneBook() {
    List<Book> dorrasBooks = library.search("Dorra Bartaguiz");

    assertThat(dorrasBooks).hasSize(1);
  }

  @Test
  void cyrilleWroteTwoBooks() {
    List<Book> cyrillesBooks = library.search("Cyrille Martraire");

    assertThat(cyrillesBooks).hasSize(2);
  }

  private static Configuration configureHibernate() {
    Configuration hibernateConfig = new Configuration();
    hibernateConfig.setProperty("jakarta.persistence.jdbc.url",
        "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1");
    hibernateConfig.setProperty("jakarta.persistence.jdbc.user", "sa");
    hibernateConfig.setProperty("jakarta.persistence.jdbc.pass", "");
    hibernateConfig.setProperty("hibernate.show_sql", true);
    hibernateConfig.addAnnotatedClass(Author.class);
    hibernateConfig.addAnnotatedClass(Book.class);
    return hibernateConfig;
  }

  private static void initDB() throws SQLException {
    try (Connection conn = DriverManager.getConnection("jdbc:h2:mem:test;DB_CLOSE_DELAY=-1", "sa",
        "")) {
      Statement statement = conn.createStatement();
      statement.execute(
          """
          CREATE TABLE AUTHOR(
            uid CHAR(36) PRIMARY KEY,
            fullName VARCHAR(100)
          );
          
          CREATE TABLE BOOK(
            isbn CHAR(13) PRIMARY KEY,
            title VARCHAR(200)
          );
          
          CREATE TABLE BOOK_AUTHORS(
            authorUid CHAR(36),
            isbn CHAR(13),
            PRIMARY KEY (authorUid, isbn),
            FOREIGN KEY(authorUid) REFERENCES AUTHOR(uid),
            FOREIGN KEY(isbn) REFERENCES BOOK(isbn)
          );
          
          INSERT INTO AUTHOR VALUES
            ('%1$s', 'Cyrille Martraire'),
            ('%2$s', 'Arnaud Thiéfaine'),
            ('%3$s', 'Dorra Bartaguiz'),
            ('%4$s', 'Fabien Hiegel'),
            ('%5$s', 'Houssam Fakih');
          
          INSERT INTO BOOK VALUES('9782100825202', 'Software Craft');
          INSERT INTO BOOK_AUTHORS VALUES
            ('%1$s', '9782100825202'),
            ('%2$s', '9782100825202'),
            ('%3$s', '9782100825202'),
            ('%4$s', '9782100825202'),
            ('%5$s', '9782100825202');
          
          INSERT INTO BOOK VALUES ('9780134689326', 'Living Documentation: Continuous Knowledge Sharing by Design');
          INSERT INTO BOOK_AUTHORS VALUES ('%1$s', '9780134689326');
          """.formatted(randomUUID(), randomUUID(), randomUUID(), randomUUID(), randomUUID())
      );
      statement.close();
    }
  }
}