import java.io.*;
public class BufferReaderDemo
{
	public static void main(String[] args) {
		File f=new File("Test.txt");
		try{
		      BufferedReader br=new BufferedReader(new FileReader(f));
		      String x="";
		      while((x=br.readLine())!=null)
		      {
		            System.out.println(x);
		      }
		      br.close();
		}
		catch(IOException e)
		{
		      System.out.println("OOPS! something went wrong...");
		}
	}
}
