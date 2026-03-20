
public class task {

    public static void main(String[] args) {
// 1.Print Number from 1 to 10
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

// 2.Check if a number is positive, negative, or zero
        int positiveNegativeZero = -1;
        if (positiveNegativeZero > 0) {
            System.out.println("Positive");
        } else if (positiveNegativeZero < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

// 3.Find largest of 3 numbers      
        int num1 = 50;
        int num2 = 20;
        int num3 = 30;

        if (num1 > num2 & num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 & num2 > num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
//4. Print multiplication table of 5

        int multiplicationNum = 5;
        for (int i = 1; i < 11; i++) {
            System.out.println(i * multiplicationNum);
        }
//5. Reverse a number (e.g., 123 → 321)
        int beforReverse = 123;
        int reverseNum = 0;
        int rem;
        while (beforReverse > 0) {
            rem = beforReverse % 10;
            reverseNum = (reverseNum * 10) + rem;
            beforReverse = beforReverse / 10;
        }
        System.out.println(reverseNum);

// prime number
        int primeNum = 15;
        boolean isPrime = true;
        if (primeNum <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= primeNum; i++) {
                if (primeNum % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

}
