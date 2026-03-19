
public class loops {

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            System.out.println(i);
        }

        int i = 0;
        while (i < 6) {
            System.out.println(i);
            i++;
        }

// Even or odd
        int num = 11;
        if (num % 2 == 0) {
            System.out.println("is even");
        } else {
            System.out.println("Odd");
        }
//sum of n numbers from 1
int n = 5;
int sum = 0;

for (int j = 1; j <= n; j++){
  sum += j;
}
System.out.println(sum);
    }
}
