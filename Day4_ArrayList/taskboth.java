package Day4_ArrayList;

import java.util.ArrayList;
import java.util.HashMap;

public class taskboth {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        // System.out.println(nums.get(0));
        int sum = 0;
        for (Integer num : nums) {
            sum += num;

        }
        System.out.println("sum: " + sum);

        // HashMap
        HashMap<String, Integer> student_marks = new HashMap<>();
        student_marks.put("Madhava", 80);
        student_marks.put("Zoro", 87);
        student_marks.put("Nami", 95);
        student_marks.put("Zoro2", 83);

        for (String key : student_marks.keySet()) {
            System.out.println(key + " " + student_marks.get(key));

        }

    }

}
