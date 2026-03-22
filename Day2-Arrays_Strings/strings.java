
public class strings {

    public static void main(String[] args) {

        //1.Reverse Stringbrav
        String name = "madhava";
        String reverseName = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverseName += name.charAt(i);
        }
        System.out.println(reverseName);

        // 2.Palindrome Check:
        String teacher = "sir";
        String palindrome = "";
        for (int i = teacher.length() - 1; i >= 0; i--) {

            palindrome += teacher.charAt(i);

        }
        if (palindrome.equals(teacher)) {
            System.out.println("Given String is Palindrome");

        } else {
            System.out.println("Not a Palindrome");
        }

        // 3.Count Vowels
        String course = "javaFullStack";
        int count = 0;

        for (int i = 0; i < course.length(); i++) {
            char cha = Character.toLowerCase(course.charAt(i));

            if (cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u') {
                count++;
            }
        }

        System.out.println(count);
    }

}
