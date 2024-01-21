package com.epam.mjc.collections.map;

import java.util.*;

public class KeyValueSwapper {
    public static Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        HashMap<String,Integer>result=new HashMap<>();
        for(Map.Entry<Integer,String> b:sourceMap.entrySet()){
            result.put(b.getValue(),b.getKey());
        }
        return result;
    }


    public static void main(String args[]){
        Map<Integer,String>a=Map.of(1, "Monday",
                2, "Tuesday",
                3, "Wednesday",
                4, "Thursday",
                5, "Friday",
                6, "Saturday",
                7, "Sunday",
                10, "Friday");
        System.out.println(swap(a));
    }
}
