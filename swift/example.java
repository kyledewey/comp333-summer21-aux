public class ReturnValue {
    public final int x;
    public final boolean b;

    public ReturnValue(final int x, final boolean b) {
        this.x = x;
        this.b = b;
    }
}

public static ReturnValue returnsTwoThings() {
    int x = 17;
    boolean b = true;
    return new ReturnValue(x, b);
}

public static void main(String[] args) {
    ReturnValue value = returnsTwoThings();
    System.out.println(value.x);
    System.out.println(value.b);
}
