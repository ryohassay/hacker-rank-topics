import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();  // Read \n after the number

        String[] arr = new String[num];

        for(int i = 0; i < num; i++) {
            arr[i] = scan.nextLine();
        }

        scan.close();

        for(int i = 0; i < num; i++) {
            long n;
            try {
                n = Long.parseLong(arr[i]);
            }
            catch(NumberFormatException e) {
                System.out.println(arr[i] + " can't be fitted anywhere.");
                continue;
            }
            
            System.out.println(n + " can be fitted in:");
            if(-128 <= n && n <= 127) {
                System.out.println("* byte");
            }
            if(-32768 <= n && n <= 32767) {
                System.out.println("* short");
            }
            if(-(Math.pow(2, 31)) <= n && n <= (Math.pow(2, 31) - 1)) {
                System.out.println("* int");
            }
            System.out.println("* long");
        }
    }
}
