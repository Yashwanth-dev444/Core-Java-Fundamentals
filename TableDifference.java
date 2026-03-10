//Differences between mathematical tables of n1 and n2 and printing in a single line.
class Solution {
    public static void difference(int n1, int n2) {

    
        for(int i=1;i<=10;i++)
        {
           int s1=n1*i;
           int s2=n2*i;
           System.out.print(s1-s2+" ");
        }
    }
}
