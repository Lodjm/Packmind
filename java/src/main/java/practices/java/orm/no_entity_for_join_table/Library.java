package practices.java.orm.no_entity_for_join_table;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;

public class Library {

  AuthorsRepository authors;
  BooksRepository books;
  BookAuthorsRepository bookAuthors;

  @Transactional
  List<Book> search(String authorFullName) {
    List<Author> matchingAuthors = authors.findByFullName(authorFullName);
    List<Book> searchResults = new ArrayList<>();
    for(Author author : matchingAuthors) {
      bookAuthors.findById_AuthorUid(author.uid)
          .forEach(bookAuthor -> books.findById(bookAuthor.id.isbn).ifPresent(searchResults::add));
    }
    return searchResults;
  }

}
