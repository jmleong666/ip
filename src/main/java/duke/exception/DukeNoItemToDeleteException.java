package duke.exception;

/**
 * Exception for handling delete commands with no specified index.
 */
public class DukeNoItemToDeleteException extends DukeException {
    public DukeNoItemToDeleteException(String input) {
        super(input);
    }

    /**
     * Returns the error message containing the user input which caused the error.
     *
     * @return String of error message.
     */
    @Override
    public String toString() {
        return "ERROR: Duke doesn't know what to delete -> " + input;
    }
}
