import java.util.*;
import java.util.stream.*;

public class Example6 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sumArray(arr);
        System.out.println("Сумма элементов массива: " + sum);
    }

    public static int sumArray(int[] arr) {
        int sum = Arrays.stream(arr).parallel().sum();
        return sum;
    }
}
