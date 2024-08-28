package practices.java.orm.no_entity_for_join_table;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "BOOK_AUTHORS")
class BookAuthor {

  @EmbeddedId
  BookAuthorId id;

}
