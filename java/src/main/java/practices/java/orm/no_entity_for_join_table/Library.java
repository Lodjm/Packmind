package practices.java.orm.no_entity_for_join_table;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;

public class Library {

  AuthorsRepository authors;

  @Transactional
  List<Book> search(String authorFullName) {
    List<Author> matchingAuthors = authors.findByFullName(authorFullName);
    List<Book> searchResults = new ArrayList<>();
    for(Author author : matchingAuthors) {
      searchResults.addAll(author.books);
    }
    return searchResults;
  }

}
