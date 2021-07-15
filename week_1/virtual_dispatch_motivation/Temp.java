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
    
    public static void main(String[] args) {
        boolean userWantsConsole = doesUserWantConsole(args);
        String destinationFile = getDestinationFile(args);
        OutputDestination destination =
            new OutputDestination(userWantsConsole,
                                  destinationFile);
        
        int result = doComputation(destination);

        // writeThing(userWantsConsole, destinationFile, result);
        destination.writeThing(result);
    } // main
} // Temp
