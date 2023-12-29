import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()) {
            list.add(scan.nextLine());
        }

        scan.close();

        int size = list.size();
        for(int i = 0; i < size; i++) {
            System.out.println((i + 1) + " " + list.get(i));
        }
    }
}
