package Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        String s = "";

        for (int i = 0; i < n; i++){
            s += i + 1;
        }

        int i = 0, ind = 0;
        String res = "";

        while(true) {
            res += s.charAt(i);
            if ((m + i) > n) {
                i = m + i - n - 1;
            } else {
                i = m + i - 1;
            }
            if (s.charAt(i) == s.charAt(ind)) {
                break;
            }
        }

        System.out.println(res);
    }
}