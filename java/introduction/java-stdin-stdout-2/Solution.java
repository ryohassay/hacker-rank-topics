import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double decNum = scan.nextDouble();
        scan.nextLine();
        String str = scan.nextLine();

        System.out.println("String: " + str);
        System.out.println("Double: " + decNum);
        System.out.println("Int: " + num);

        scan.close();
    }
}
