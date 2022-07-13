package zeelmaekers.jeroen.springxvue.services;

import zeelmaekers.jeroen.springxvue.dtos.author.AuthorInput;
import zeelmaekers.jeroen.springxvue.entities.Author;

public interface AuthorService {

   // Query
   Iterable<Author> getAllAuthors();
   Author getAuthorById(Long id) throws Exception;

   // Mutation
   Author addAuthor(AuthorInput authorInput);

}
