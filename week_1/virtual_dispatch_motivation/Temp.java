public class Temp {
    // returns null if there is no destination file
    public static String getDestinationFile(String[] args) {
        // do something
    }
    public static void main(String[] args) {
        boolean userWantsConsole = doesUserWantConsole(args);

        int result = doComputation();

        if (userWantsConsole) {
            System.out.println(result);
        } else {
            String destinationFile = getDestinationFile(args);
            File file = new File(destinationFile);
            FileOutputStream stream = new FileOutputStream(file);
            stream.writeln(result);
            stream.close();
        }
    } // main
} // Temp
