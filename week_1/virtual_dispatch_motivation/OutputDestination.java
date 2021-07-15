public class OutputDestination {
    public final boolean userWantsConsole;
    public final String destinationFile;
    
    public OutputDestination(final boolean userWantsConsole,
                             final String destinationFile) {
        this.userWantsConsole = userWantsConsole;
        this.destinationFile = destinationFile;
    }

    public void writeThing(int thing) {
        if (userWantsConsole) {
            System.out.println(thing);
        } else {
            File file = new File(destinationFile);
            FileOutputStream stream = new FileOutputStream(file);
            stream.writeln(thing);
            stream.close();
        }
    }
}
