public class LinearSearch
{
	public static void main(String[] args) {
		int[] nums={2,7,14,9};
		int key=114,count=0;
		for(int i=0;i<nums.length;i++)
		{
		      if(nums[i]==key)
		      {
		            System.out.println(key+" Found at "+i+" position...");
		             count=1;
		            break;
		      }
		}
		if(count==0)
		{
		      System.out.println(key+" is not Found...");
		}
		
	}
}
