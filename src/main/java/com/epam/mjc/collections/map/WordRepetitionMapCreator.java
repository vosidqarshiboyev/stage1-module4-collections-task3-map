package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        sentence=sentence.trim();
        sentence=sentence.strip();
        sentence=sentence.replace(".","");
        sentence=sentence.replace(",","");
        sentence=sentence.toLowerCase();
        HashMap<String,Integer>result=new HashMap<>();
        HashSet<String>b=new HashSet<>();
        String[]a=sentence.split(" ");
        for(String j:a){
            b.add(j);
        }
        for(String hey:b){
            int count=0;
            for(int i=0;i<a.length;i++){
                if(a[i].equals(hey)){
                    count++;
                }
            }
            if(!hey.equals(""))
                result.put(hey,count);
        }
        return result;
    }
}
