package com.lti;

import java.util.*;
import java.util.Map.*;

public class hashdemo {
    public static void main(String[] args) {
        Map<Integer, String> data = new HashMap<Integer, String>();
        data.put(100,"Dev");
        data.put(101, "Mani");
        data.put(102,"Hector");
        data.put(104, "Rahul");
        data.put(null, "Mark");
        data.put(101, "Ravi");
        System.out.println(data);

        String name = data.get(102);
        System.out.println(name);

        Set<Integer> keys  = data.keySet();
        System.out.println(keys);

        Collection<String> values = data.values();
        System.out.println(values);

        for(Entry<Integer, String> x: data.entrySet()){
            System.out.println(x.getKey()+ " " + x.getValue());
        }
    }
}