class Solution {
    public static int gcd(int a, int b) {
        int count=0,g;
        if(a<b)
        {
            g=a;
        }
        else
        {
            g=b;
        }
        for(int i=1;i<=g;i++)
        {
            if(a%i==0 & b%i==0)
            {
                count=i;
            }
        }
        return count;
    }
}
