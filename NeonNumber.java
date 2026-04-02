//square of 9 is 81 and 8+1=9=orginal number is said to be Neon Number

public class NeonNumber
{
	public static void main(String[] args) {
		int neon=9;
		int sum=0;
		int n=neon*neon;
		while(n>0)
		{
		      int rem=n%10;
		      sum=sum+rem;
		      n=n/10;
		}
		if(sum==neon)
		{
		      System.out.println(neon+" is a neon number");
		}
		else{
		      System.out.println(neon+" not a neon number");
		}
	}
}
