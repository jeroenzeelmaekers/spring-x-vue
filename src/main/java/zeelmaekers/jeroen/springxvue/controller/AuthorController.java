package zeelmaekers.jeroen.springxvue.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import zeelmaekers.jeroen.springxvue.dtos.author.AuthorInput;
import zeelmaekers.jeroen.springxvue.entities.Author;
import zeelmaekers.jeroen.springxvue.services.AuthorService;

@Controller
public record AuthorController(AuthorService authorService) {

    @QueryMapping
    private Iterable<Author> authors() {
        return authorService.getAllAuthors();
    }

    @QueryMapping
    private Author authorById(@Argument Long id) {
        try {
            return authorService.getAuthorById(id);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @MutationMapping
    private Author addAuthor(@Argument AuthorInput author) {
        try {
            return authorService.addAuthor(author);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
