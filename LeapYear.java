import java.util.*;

public class Solution {
    public static void solve() {
        String x;
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%400==0 || (year%4==0 && year%100!=0))
        System.out.print("True");
        else
        System.out.print("False");
    }
}
