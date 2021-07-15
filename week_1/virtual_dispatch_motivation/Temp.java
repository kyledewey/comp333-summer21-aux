public class Temp {
    // returns null if there is no destination file
    public static String getDestinationFile(String[] args) {
        // do something
    }

    public static void writeThing(boolean userWantsConsole,
                                  String destinationFile,
                                  int thing) {
        if (userWantsConsole) {
            System.out.println(thing);
        } else {
            File file = new File(destinationFile);
            FileOutputStream stream = new FileOutputStream(file);
            stream.writeln(thing);
            stream.close();
        }
    }
    
    public static int doComputation(boolean userWantsConsole,
                                    String destinationFile) {
        // do part #1 / 10 of computation

        // print result of #1 / 10
        int tempResult = ...;
        writeThing(userWantsConsole, destinationFile, tempResult);
        
        // continue to do rest of computation
    }
    
    public static void main(String[] args) {
        boolean userWantsConsole = doesUserWantConsole(args);
        String destinationFile = getDestinationFile(args);

        int result = doComputation(userWantsConsole, destinationFile);

        writeThing(userWantsConsole, destinationFile, tempResult);
    } // main
} // Temp
