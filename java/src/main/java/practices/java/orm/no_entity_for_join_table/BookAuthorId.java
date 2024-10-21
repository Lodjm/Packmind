package practices.java.orm.no_entity_for_join_table;

import jakarta.persistence.Embeddable;

@Embeddable
class BookAuthorId {

  String isbn;
  String authorUid;
}
