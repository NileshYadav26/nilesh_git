import java.util.*;
public class Cursor{
	 public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		/*Enumeration e=v.elements();
		while(e.hasMoreElement)
		System.out.println(v);*/
		
		/*Iterator i=v.iterator();
        while(i.hasNext())
		{
			System.out.println(i.next());
		}*/

		ListIterator i=v.listIterator();
		

        while(i.hasNext())
		{
			if(i.nextIndex()>=1)
				i.set(20);
			System.out.println(i.next());
		}
	}
}