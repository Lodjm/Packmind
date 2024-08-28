package practices.java.orm.no_entity_for_join_table;

import jakarta.data.repository.DataRepository;
import jakarta.data.repository.Find;
import jakarta.data.repository.Repository;
import java.util.List;

@Repository
interface BookAuthorsRepository extends DataRepository<BookAuthor, BookAuthorId> {

  @Find
  List<BookAuthor> findById_AuthorUid(String id_authorUid);
}
