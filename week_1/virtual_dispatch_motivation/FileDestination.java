public class FileDestination implements OutputDestination {
    private final FileOutputStream stream;

    public FileDestination(final String destinationFile) {
        final File file = new File(destinationFile);
        stream = new FileOutputStream(file);
    }

    public void writeThing(final int thing) {
        stream.writeln(thing);
    }

    public void close() {
        stream.close();
    }
}
