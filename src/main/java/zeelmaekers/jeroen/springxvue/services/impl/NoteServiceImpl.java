package zeelmaekers.jeroen.springxvue.services.impl;

import org.springframework.stereotype.Service;
import zeelmaekers.jeroen.springxvue.entities.Author;
import zeelmaekers.jeroen.springxvue.entities.Note;
import zeelmaekers.jeroen.springxvue.repositories.NoteRepository;
import zeelmaekers.jeroen.springxvue.services.AuthorService;
import zeelmaekers.jeroen.springxvue.services.NoteService;

@Service
public record NoteServiceImpl(NoteRepository noteRepository, AuthorService authorService) implements NoteService {

    @Override
    public Iterable<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @Override
    public Iterable<Note> notesByAuthorId(Long authorId) {
        return noteRepository.findByAuthorId(authorId);
    }

    @Override
    public Note noteById(Long noteId) throws Exception {
        return noteRepository.findById(noteId).orElseThrow(() -> new Exception("Can not find note with id:" + noteId));
    }

    @Override
    public Note addNote(Long authorId, String content) throws Exception {
        Author author = authorService.getAuthorById(authorId);
        Note note = Note.builder()
                .author(author)
                .content(content)
                .build();
        return noteRepository.save(note);
    }

    @Override
    public Note updateNote(Long noteId, String content) throws Exception {
        Note note = noteById(noteId);
        note.setContent(content);
        return noteRepository.save(note);
    }

    @Override
    public Boolean deleteNote(Long noteId) {
        noteRepository.deleteById(noteId);
        return true;
    }
}
