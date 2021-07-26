public class IsGreaterThan implements Function {
    public final int value;

    public IsGreaterThan(final int value) {
        this.value = value;
    }

    public boolean doCheck(final int element) {
        return element > value;
    }
}
