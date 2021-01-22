package graphql.repository;

import graphql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hoand on 2021-01-18.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, String>{


}
