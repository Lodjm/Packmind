package practices.java.orm.no_entity_for_join_table;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.List;

@Entity
class Author {

  @Id
  String uid;
  String fullName;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(
      name = "BOOK_AUTHORS",
      joinColumns = @JoinColumn(name = "authorUid"),
      inverseJoinColumns = @JoinColumn(name = "isbn")
  )
  List<Book> books;
}
