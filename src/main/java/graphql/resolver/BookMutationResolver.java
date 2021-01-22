package graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import graphql.GraphQLException;
import graphql.model.Author;
import graphql.model.Book;
import graphql.model.BookInput;
import graphql.repository.AuthorRepository;
import graphql.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Optional;

/**
 * Created by hoand on 2021-01-18.
 */
@Component
public class BookMutationResolver implements GraphQLMutationResolver{

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    /**
     * mutation{
     createBook(book: {
     title: "hello world",
     isbn: "1234"
     }) {
     title
     isbn
     }

     }
     *
     * @param bookInput
     * @return
     */
    public Book createBook(BookInput bookInput) {
        // save to database
        Book newBook = new Book(bookInput.getTitle(), bookInput.getIsbn());
        return bookRepository.save(newBook);

    }

    public Book addAuthor(String authorId, String isbn){

        Optional<Author> author = authorRepository.findById(authorId);
        Optional<Book> book = bookRepository.findById(isbn);

        if (author.isPresent() && book.isPresent()){
            book.get().setAuthors(Collections.singletonList(author.get()));
            return book.get();
        }
        throw new GraphQLException("unable to add author to book");


    }
}
