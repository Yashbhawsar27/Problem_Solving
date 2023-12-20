package hashing;
import java.util.*;

class NumCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("enter nubers");
        n = sc.nextInt();
       
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        int q;
        System.out.println("enter");
        q = sc.nextInt();
        while (q-- != 0) {
            int number;
            System.out.println("----------");
            number = sc.nextInt();
            // fetching:
            System.out.println(hash[number]);
        }
    }
}
