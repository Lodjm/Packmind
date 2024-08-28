package practices.java.orm.no_entity_for_join_table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
class Book {

  @Id
  String isbn;
  String title;
}
