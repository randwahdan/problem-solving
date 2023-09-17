import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RandDev {
    public static void main(String[] args) {
        Scanner readInput=new Scanner(System.in);
        Map<Integer,Integer> a=new HashMap<>();
        int output=0;
        for (int i=1;i<=4;i++){
            a.put(i,readInput.nextInt());
        }
        char [] arr=readInput.next().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            output   +=a.get(arr[i]-48);
        }
        System.out.println(output);
    }
}
