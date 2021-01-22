package graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import graphql.model.Author;
import graphql.model.AuthorInput;
import graphql.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by hoand on 2021-01-18.
 */
@Component
public class AuthorMutationResolver implements GraphQLMutationResolver{

    @Autowired
    private AuthorRepository authorRepository;

    public Author createAuthor(AuthorInput authorInput){
        // just create a blank author for now
        Author newAuthor = new Author(authorInput.getName());

        // create Id for author
        newAuthor.setId(UUID.randomUUID().toString());
        return authorRepository.save(newAuthor);
    }
}
