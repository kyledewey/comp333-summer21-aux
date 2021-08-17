public class Increment {
    public final int x;

    public Increment(final int x) {
        this.x = x;
    }

    public Increment increment() {
        return new Increment(x + 1);
    }

    public static void main(String[] args) {
        Increment x = new Increment(12);
        Increment y = x.increment();
        System.out.println(y.x);
    }
}

