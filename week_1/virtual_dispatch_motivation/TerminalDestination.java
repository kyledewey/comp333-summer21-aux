public class TerminalDestination implements OutputDestination {
    public void writeThing(final int thing) {
        System.out.println(thing);
    }

    public void close() {}
}
