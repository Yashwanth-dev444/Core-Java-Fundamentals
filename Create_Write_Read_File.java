Import java.io.*;
public class Main
{
	public static void main(String[] args) {
		File f=new File("sample.txt");
		try{
		      f.createNewFile();
		      FileWriter fw=new FileWriter(f);
		      fw.write("Hello There.");
		      fw.write("This is yashwanth");
		      fw.close();
		      FileInputStream fis=new FileInputStream(f);
		      int data;
		      while((data=fis.read())!=-1)
		      {
		            System.out.print((char)data);
		      }
      fis.close();
		}
		catch(IOException e){
		      System.out.println("OOPS!Something went wrong...");
		}
	}
}
