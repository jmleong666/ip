public class DukeOutOfBoundsException extends DukeException {
    DukeOutOfBoundsException(String input) {
        super(input);
    }

    @Override
    public String toString() {
        return "ERROR: Duke can't find the task in the list -> " + input;
    }
}
