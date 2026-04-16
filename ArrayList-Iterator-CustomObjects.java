Import java.util.*;
class Tvshow{
    String name;
    double rating;
    Tvshow(String name,double rating)
    {
        this.name=name;
        this.rating=rating;
    }
    public String toString()
    {
        return "TV Show : "+name+" with Rating : "+rating;
    }
}
public class ArrayList-Iterator-CustomObjects
{
	public static void main(String[] args) {
		ArrayList<Tvshow> al=new ArrayList();
		al.add(new Tvshow("The Vampire Diaries",9.8));
		al.add(new Tvshow("Game of Thrones",10));
		al.add(new Tvshow("Money Heist",9.5));
		al.add(new Tvshow("Alice In Borderland",9));
		Iterator<Tvshow> it=al.iterator();
		while(it.hasNext())
		{
		    System.out.println(it.next());
		}
	}
}
