public class Temp {
    // returns null if there is no destination file
    public static String getDestinationFile(String[] args) {
        // do something
    }
    
    public static int doComputation(OutputDestination destination) {
        // do part #1 / 10 of computation

        // print result of #1 / 10
        int tempResult = ...;
        //writeThing(userWantsConsole, destinationFile, tempResult);
        destination.writeThing(tempResult);
        
        // continue to do rest of computation
    }

    public static OutputDestination makeDestination(final String[] args) {
        boolean userWantsConsole = doesUserWantConsole(args);
        if (userWantsConsole) {
            return new TerminalDestination();
        } else {
            String destinationFile = getDestinationFile(args);
            return new FileDestination(destinationFile);
        }
    } // makeDestination
    
    public static void main(String[] args) {
        OutputDestination destination = makeDestination(args);
        
        int result = doComputation(destination);

        // writeThing(userWantsConsole, destinationFile, result);
        destination.writeThing(result);
    } // main
} // Temp
