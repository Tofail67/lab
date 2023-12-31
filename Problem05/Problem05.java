package problem05;
public class Problem05 {
    public static <T extends Comparable<T>> boolean isSorted(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                return false; 
            }
        }
        return true; 
    }
}

