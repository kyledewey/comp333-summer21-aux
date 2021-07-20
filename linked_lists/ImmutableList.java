public interface ImmutableList {
    public boolean equals(final Object other);
    // public int length();
    // public int sum(); // empty list sum is defined as 0
    // public ImmutableList append(final ImmutableList other);
    // public boolean contains(final int value);
    public String toString();
    public int hashCode();

    public boolean isEmpty();

    public ImmutableList addAmount(final int amount);
    // [1, 2, 3].addAmount(2) --> [3, 4, 5]
    // [1, 2, 3].addAmount(0) --> [1, 2, 3]
    // [4, 1, 7].addAmount(5) --> [9, 6, 12]
    
} // ImmutableList
