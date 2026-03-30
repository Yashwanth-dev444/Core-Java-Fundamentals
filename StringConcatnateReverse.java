class StringConcatnateReverse {
    static String conRevstr(String S1, String S2) {
        // code here
        String x=S1+S2;
        String rev="";
        for(int i=(x.length()-1);i>=0;i--)
        {
            rev =rev+x.charAt(i);
        }
        return rev;
    }
}
