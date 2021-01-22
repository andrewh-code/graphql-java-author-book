package graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.model.Book;
import org.springframework.stereotype.Component;

/**
 * Created by hoand on 2021-01-16.
 */
@Component
public class BookResolver implements GraphQLQueryResolver{

    /**
         * query{
         getBook(isbn: "1234556"){
         title
         isbn
         }

     }
     * @param isbn
     * @return
     */
    public Book getBook(String isbn){
        return new Book("Learning graphql", "1234556");
    }
}
