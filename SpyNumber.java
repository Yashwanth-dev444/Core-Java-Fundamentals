public class SpyNumber
{
	public static void main(String[] args) {
		int spy=1124;
		int n=spy;
		int sum=0,product=1;    //The number is 1124
		while(n>0){             //sum of the digits 1+1+2+4=8
		      int rem=n%10;     //Product of the digits is 1*1*2*4=8
		      sum+=rem;         //sum=product.So its a spy number.
		      product*=rem;
		      n=n/10;
		}
		if(sum==product)
		{
		      System.out.println(spy+" is a spy number");
		}
		else{
		      System.out.println(spy+" is not a spy number");
		}
	}
}
