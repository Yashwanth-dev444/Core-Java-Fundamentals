public class ArmstrongNumber
{
	public static void main(String[] args) {
		int armstrong=1753;
		int sum=0;
		int n=armstrong;
		while(n>0)
		{
		      int rem=n%10;
		      sum=sum+(rem*rem*rem);
		      n=n/10;
		}
		if(armstrong==sum)
		{
		      System.out.println(armstrong+" is an Armstrong Number...");
		}
		else{
		      System.out.println(armstrong+" is not an Armstrong Number");
		}
	}
}
