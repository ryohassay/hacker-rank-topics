import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        byte breadth = scan.nextByte();  // Constraint: 100 <= breadth <= 100 => byte is enough
        byte height = scan.nextByte();  // Constraint: 100 <= height <= 100 => byte is enough
        scan.close();

        if(breadth > 0 && height > 0) {
            System.out.println(breadth * height);
        }
        else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
