package zeelmaekers.jeroen.springxvue.services;

import zeelmaekers.jeroen.springxvue.entities.Note;

public interface NoteService {

    // Query
    Iterable<Note> getAllNotes();

    Iterable<Note> notesByAuthorId(Long authorId);

    Note noteById(Long noteId) throws Exception;

    // Mutation
    Note addNote(Long authorId, String content) throws Exception;

    Note updateNote(Long noteId, String content) throws Exception;

    Boolean deleteNote(Long noteId);

}
