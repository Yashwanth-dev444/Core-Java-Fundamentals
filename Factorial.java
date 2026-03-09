class Solution {
    public int factorial(int n) {
        int temp=1;
    while(n>0)
    {
        temp=temp*n;
        n--;
    }
    return temp;
    }
}
