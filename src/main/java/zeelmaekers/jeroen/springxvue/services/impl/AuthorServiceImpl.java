package zeelmaekers.jeroen.springxvue.services.impl;

import org.springframework.stereotype.Service;
import zeelmaekers.jeroen.springxvue.dtos.author.AuthorInput;
import zeelmaekers.jeroen.springxvue.entities.Author;
import zeelmaekers.jeroen.springxvue.repositories.AuthorRepository;
import zeelmaekers.jeroen.springxvue.services.AuthorService;

@Service
public record AuthorServiceImpl(AuthorRepository authorRepository) implements AuthorService {

    @Override
    public Iterable<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author getAuthorById(Long id) throws Exception {
        return authorRepository
                .findById(id)
                .orElseThrow(() -> new Exception("No author found with id:" + id));
    }

    @Override
    public Author addAuthor(AuthorInput authorInput) {
        Author author = Author.builder()
                .firstName(authorInput.firstName())
                .lastName(authorInput.lastName())
                .email(authorInput.email())
                .build();
        return authorRepository.save(author);
    }
}
