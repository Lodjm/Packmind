package practices.java.orm.no_entity_for_join_table;

import jakarta.data.repository.DataRepository;
import jakarta.data.repository.Find;
import jakarta.data.repository.Repository;
import java.util.List;

@Repository
interface AuthorsRepository extends DataRepository<Author, String> {

  @Find
  List<Author> findByFullName(String fullName);
}
