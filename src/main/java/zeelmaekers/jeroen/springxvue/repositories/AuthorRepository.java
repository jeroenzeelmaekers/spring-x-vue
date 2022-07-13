package zeelmaekers.jeroen.springxvue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zeelmaekers.jeroen.springxvue.entities.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
