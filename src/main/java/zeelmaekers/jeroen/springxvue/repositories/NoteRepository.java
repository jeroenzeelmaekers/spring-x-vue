package zeelmaekers.jeroen.springxvue.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zeelmaekers.jeroen.springxvue.entities.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

    Iterable<Note> findByAuthorId(Long authorId);

}
