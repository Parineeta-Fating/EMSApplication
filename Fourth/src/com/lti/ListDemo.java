package com.lti;
import java.util.*;
import java.util.List;
import java.util.Set;

public class ListDemo 
{
	public static void main(String[] args) 
	{
		List<String> ar=new ArrayList<String>();
	    ar.add("Jack");
	    ar.add("Jill");
	    ar.add("Hill");

	    Set<String> ar2=new HashSet<String>();
	    ar2.add("Jack");
	    ar2.add("Jill");
	    ar2.add("Hill");

	    System.out.println(ar2);

	    Iterator<String> out=ar2.iterator();
	    while(out.hasNext())
	        System.out.println(out.next());

	// FOR LOOP     - Only for LIST
	    for(int x=0;x<ar.size();x++)
	        System.out.println(ar.get(x));

	    //FOREACH loop  - for LIST and SET
	    for(String s : ar)
	    {
	        System.out.println( s );
	    }
	    //Iterator    - for LIST and SET
	    Iterator<String> itr=ar.iterator();
	    while(itr.hasNext())
	    {
	        System.out.println(itr.next());
	    }
	    //ListIterator    - Only for LIST
	    ListIterator<String> lst=ar.listIterator();
	    while(lst.hasNext())
	        System.out.println(lst.next());

	    while(lst.hasPrevious())
	        System.out.println(lst.previous());

	}
}
