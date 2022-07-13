package zeelmaekers.jeroen.springxvue.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import zeelmaekers.jeroen.springxvue.entities.Note;
import zeelmaekers.jeroen.springxvue.services.NoteService;

@Controller
public record NoteController(NoteService noteService) {

    @QueryMapping
    private Iterable<Note> notes() {
        return noteService.getAllNotes();
    }

    @QueryMapping
    private Note getNoteById(@Argument Long noteId) {
        try {
            return noteService.noteById(noteId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @QueryMapping
    private Iterable<Note> getNotesByAuthorId(@Argument Long authorId) {
        return noteService.notesByAuthorId(authorId);
    }


    @MutationMapping
    private Note addNote(@Argument Long authorId, @Argument String content) {
        try {
            return noteService.addNote(authorId, content);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @MutationMapping
    private Note updateNote(@Argument Long noteId, @Argument String content) {
        try {
            return noteService.updateNote(noteId, content);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @MutationMapping
    private Boolean deleteNote(@Argument Long noteId) {
        return noteService.deleteNote(noteId);
    }

}
