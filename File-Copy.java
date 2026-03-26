Import java.io.*;
public class FileCopy
{
	public static void main(String[] args) {
		File f1=new File("sample.txt");
		File f2=new File("copy.txt");
		try{
		      f1.createNewFile();
		      f2.createNewFile();
		      FileWriter fw1=new FileWriter(f1);
		      fw1.write("Hello There");
		      fw1.close();
		      FileInputStream fis=new FileInputStream(f1);
		      
		      FileWriter fw2=new FileWriter(f2);
		      int data;
		      while((data=fis.read())!=-1)
		      {
		            System.out.println((char)data);
		            fw2.write((char)data);
		            
		      }
		      fw2.close();
		      fis.close();
		}
		catch(IOException e)
		{
		      System.out.println("Something went Wrong...");
		}
	}
}
