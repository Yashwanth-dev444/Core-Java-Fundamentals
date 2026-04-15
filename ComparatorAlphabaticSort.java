import java.util.*;
class Students
{
      String name;
      double marks;
      Students(String name,double marks)
      {
            this.name=name;
            this.marks=marks;
      }
      public String toString()
      {
            return "Name : "+name+"| Marks : "+marks;
      }
}
public class ComparatorAlphabaticSort
{
	public static void main(String[] args) {
		ArrayList<Students> al=new ArrayList();
		Comparator<Students> comp=new Comparator<Students>(){
	            public int compare(Students i,Students j)
	            {
	                  return i.name.compareTo(j.name);
	            }
	      };
		al.add(new Students("Sam",50));
		al.add(new Students("Tim",100));
	      al.add(new Students("Jones",10));
	      al.add(new Students("Jack",90));
	      al.add(new Students("Alice",100));
	      Collections.sort(al,comp);
		for(Students s:al)
		{
		      System.out.println(s);
		}
	}
}
