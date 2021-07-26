public class Main {
    public static void printSome(final int[] arr, Function f) {
        for (int index = 0; index < arr.length; index++) {
            final int curElement = arr[index];
            if (f.doCheck(curElement)) {
                System.out.println(curElement);
            }
        }
    }

    public static void printAll(final int[] arr) {
        printArr(arr, ReturnsTrue.CONSTANT);
    }

    public static void printAllGreaterThan(final int[] arr, final int value) {
        printArr(arr, new IsGreaterThan(value));
    }
}
