import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fDigit = scan.nextInt();
        int sDigit = scan.nextInt();
        int lDigit = scan.nextInt();
        int sum = 0;
        for (int i = 0; i <= fDigit; i++) {
            if (i / 10 == 0) {
                if (i >= sDigit && i <= lDigit)
                    sum += i;
            } else {
                int num = i;
                int dSum = 0;
                while (num!= 0) {
                    int digit = num % 10;
                    dSum += digit;
                    num /= 10;
                }
                if (dSum >= sDigit && dSum <= lDigit) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);

    }
}
