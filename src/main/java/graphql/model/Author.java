package graphql.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

/**
 * Created by hoand on 2021-01-18.
 */
@Entity
public class Author {

    @Id
    private String id;
    private String name;
    @ManyToMany
    private List<Book> books;

    public Author(){}

    public Author(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsbn() {
        return name;
    }

    public void setIsbn(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
