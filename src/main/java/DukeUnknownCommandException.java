public class DukeUnknownCommandException extends DukeException {
    DukeUnknownCommandException(String input) {
        super(input);
    }

    @Override
    public String toString() {
        return "ERROR: Duke can't recognise your command -> " + input;
    }
}
