class A extends Thread{
      public void run()
      {
            for(int i=1;i<=50;i++)
            {
                  System.out.println(i);
            }
      }
}
class B extends Thread{
      public void run()
      {
            for(int i=1;i<=50;i++)
            {
                  System.out.println(i);
            }
      }
}
public class BasicThreadProgram
{
	public static void main(String[] args) {
		A obj=new A();
		B obj2=new B();
		obj.start();
		obj2.start();
}}
