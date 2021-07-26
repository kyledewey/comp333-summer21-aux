public class ReturnsTrue implements Function {
    public static final ReturnsTrue CONSTANT =
        new ReturnsTrue();
    
    //public ReturnsTrue() {}
    
    public boolean doCheck(final int value) {
        return true;
    }
}
