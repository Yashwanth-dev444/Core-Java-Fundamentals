class Solution {
    static String delAlternate(String S) {
        String x="";
        for(int i=0;i<=(S.length()-1);i++)
        {
            if(i%2==0)
            x=x+S.charAt(i);
        }
        return x;
    }
}
