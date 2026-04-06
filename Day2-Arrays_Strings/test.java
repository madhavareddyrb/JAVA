
import java.util.Arrays;


public class test {

    public static void main(String[] args) {
        // 1.Find smallest number in array
        int[] numbers = {10, 20, 30, 40, 60, 7, 21, 25};
        int smallestNumber = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (smallestNumber > numbers[i]) {
                smallestNumber = numbers[i];
            }
        }
        System.out.println(smallestNumber);

        // 2.Count even & odd numbers in array
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);

        //3.Check if string is palindrome (without using extra string)
        // Count words in a sentence
        String sentence = "i am learning java for backend and ";
        String[] words = sentence.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            count++;
        }
        System.out.println(count);


        //5.Remove duplicates from array (basic logic)

        int[] arr = {11,11,22,33,44,55,66,22,33};
        int[] removeDuplicates = {};
        // int[] arrSort = Arrays.sort(arr);
        // System.out.println(arrSort);
        for (int i = 0; i < arr.length; i++){
            for (int j = 1; j< arr.length; i++){
                if(arr[i] != arr[j]){
                    removeDuplicates.push(arr[i]);
                }
            }

        }


    }
}
