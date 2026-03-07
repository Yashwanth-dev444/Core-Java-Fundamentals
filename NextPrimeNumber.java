class Solution {
    public static int nextPrime(int n) {
        int temp=n+1;
        // code here to find next prime number
        // return next prime number
        for(int i=temp;i<=500;i++)
        {
            int count=0;
            for(int j=1;j<=temp;j++)
            {
                if(temp%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                break;
            }
            temp++;
        }
        return temp;
    }
    
}
