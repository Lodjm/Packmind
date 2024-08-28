package practices.java.orm.no_entity_for_join_table;

import jakarta.data.repository.BasicRepository;
import jakarta.data.repository.Repository;

@Repository
interface BooksRepository extends BasicRepository<Book, String> {

}
