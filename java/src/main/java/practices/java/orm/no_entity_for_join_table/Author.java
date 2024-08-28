package practices.java.orm.no_entity_for_join_table;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
class Author {

  @Id
  String uid;
  String fullName;
}
