import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t= scan.nextInt();
        while(t-->0){
            int num= scan.nextInt();
            if (num==0){
                System.out.println(0);
                continue;
            }
            while (num !=0){
                int d=num%10;
                System.out.print(d+" ");
                num/=10;
            }
            System.out.println();
        }

    }
}
