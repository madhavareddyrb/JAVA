package Day4_ArrayList;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListTaskG {
    public static int max(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int i : list) {
            // if (i > max) max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1); nums.add(2); nums.add(3); nums.add(5);

        int sum = 0;
        for (Integer num : nums) { sum += num; }
        
        System.out.println("sum: " + sum);
        // This now works because the method is defined below!
        System.out.println("max: " + max(nums)); 

        // ... rest of your HashMap code ...
    }

    // You were missing this part:
    
}