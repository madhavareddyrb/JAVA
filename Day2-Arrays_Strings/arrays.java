
import java.util.Arrays;

public class arrays {

    public static void main(String[] args) {
        int[] numbers = {10, 50, 30, 40};
        for (int i = 0; i < numbers.length; i++) {

            System.err.println(numbers[i]);
        }

        //1. Find Maximum
        int max = numbers[0];
        for (int m = 0; m < numbers.length; m++) {
            if (numbers[m] > max) {
                max = numbers[m];
            }
        }
        System.out.println(max);

        // 2. Sum of Array
        int sum = 0;
        for (int s = 0; s < numbers.length; s++) {
            sum += numbers[s];
        }
        System.out.println(sum);

        // 3. Reverse Array
        // int[] reverseArray = {};
        for (int r = numbers.length - 1; r >= 0; r--) {
            // reverseArray.push(numbers[r]);
            System.out.println("revere arra");
            System.out.println(numbers[r]);



        }

        
    }

}
