public class DukeException {
    protected String input;
    
    DukeException(String input) {
        this.input = input;
    }
    
    @Override
    public String toString() {
        return "ERROR: Duke doesn't know what went wrong, but Duke knows something went wrong -> " + input;
    }
}
