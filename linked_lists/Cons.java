public class Cons implements ImmutableList {
    // ---BEGIN INSTANCE VARIABLES---
    public final int head;
    public final ImmutableList tail;
    // ---END INSTANCE VARIABLES---

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    } // Cons
    
    public boolean equals(final Object other) {
        if (other instanceof Cons) {
            final Cons otherCons = (Cons)other;
            return head == otherCons.head && tail.equals(otherCons.tail);
        } else {
            return false;
        }
    } // equals
    
    public String toString() {
        return "Cons(" + head + ", " + tail.toString() + ")";
    } // toString

    public int hashCode() {
        //return sum();
        return 0;
    } // hashCode

    public boolean contains(final int value) {
        return true;
    }

    public boolean isEmpty() {
        return false;
    }

    // Shorter - also works
    // public ImmutableList addAmount(final int amount) {
    //     return new Cons(head + amount, tail.addAmount(amount));
    // }
    
    // [1, ...].addAmount(5) ---> [6, ...']
    public ImmutableList addAmount(final int amount) {
        // head: 1
        // tail: ...
        // amount: 5
        // this: [1, ...]
        
        final int newValue = head + amount;
        final ImmutableList rest = tail.addAmount(amount);

        // newValue: 6
        // rest: ...'
        // return value: [6, ...']
        return new Cons(newValue, rest);
    }
} // Cons
