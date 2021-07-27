package com.lti;

import java.util.*;
import java.util.Map.Entry;

public class MapTask 
{
	List<String> names=new ArrayList<String>();
	Map<String,String> stat=new HashMap<String,String>();
	Map<Character,Integer> ch=new TreeMap<Character,Integer>();
	
	Map<Character,Integer> getCharCount(String input)
	{
		for(char c:input.toCharArray())
		{
			if(ch.containsKey(c))
			{
				ch.put(c,ch.get(c)+1);
			}
			else
			{
				ch.put(c,1);
			}
		}
		return ch;
	}

	List<String> getStudentNames(Map<String,Integer> input)
	{
		for(Entry<String,Integer> i:input.entrySet())
		{
			if(i.getValue()>70)
			{
				names.add(i.getKey());
			}
				
		}
		return names;
	}
	
	Map<String,String> evaluate(Map<String,Integer> input)
	{
		for(Entry<String,Integer> i:input.entrySet())
		{
			if(i.getValue()>70)
			{
				stat.put(i.getKey(),"Pass");
			}
			else
				stat.put(i.getKey(),"Fail");
		}	
		return stat;
	}
     public static void main(String[] args) 
     {
		Map<String,Integer> data=new HashMap<String,Integer>();
	    data.put("Ritika",90);
	    data.put("Deeksha",87);
	    data.put("Alisha",67);
	    data.put("Pallavi",56);
	    data.put("Madhu",75);
	    data.put("rithik",100);
	    System.out.println(new MapTask().getStudentNames(data));
	    System.out.println(new MapTask().evaluate(data));
	    System.out.println(new MapTask().getCharCount("ENTERTAINMENT"));
     }
}