import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String[] strs = new String[3];
        int[] nums = new int[3]; 

        for(int i = 0; i < 3; i++) {
            strs[i] = scan.next();
            nums[i] = scan.nextInt();
        }

        System.out.println("================================");
        for(int i = 0; i < 3; i++) {
            System.out.printf("%-15s", strs[i]);
            System.out.printf("%03d", nums[i]);
            System.out.println();
        }
        System.out.println("================================");

        scan.close();
    }
}
