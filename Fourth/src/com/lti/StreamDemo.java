package com.lti;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo 
{

public static void main(String[] args) {
	


String []ns= {"One","Two","Three","Four","Five"};

List<String> names=new ArrayList<String>();
for(String k : ns)
{
    names.add(k);
}
System.out.println(names);
// MAP ..FILTER .. SORTED.. ( Intermediate / Terminal)

List<String> upName= names.stream().map( x -> x.toUpperCase()).collect(Collectors.toList());

System.out.println(upName);

List<Integer> nums=new ArrayList<Integer>();
for(int y=1;y<=10;y++)
{
    nums.add(y);
}
List<Integer> str=nums.stream().map( y-> y*y).collect(Collectors.toList());
System.out.println(str);

}
}