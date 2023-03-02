import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       int arr[]=new int[n];
       for (int i=0;i<arr.length;i++){
           arr[i]=scan.nextInt();
       }
       int t=scan.nextInt();
       int result[]=twoSum(arr,t);
        System.out.println(Arrays.toString(result));

    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i< nums.length; i++) {
            for(int j=i+1; j< nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }

        }
        return new int [] {};
    }
}