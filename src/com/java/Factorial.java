import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        long n= scan.nextLong();
        if(n==1){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }

    }
}
