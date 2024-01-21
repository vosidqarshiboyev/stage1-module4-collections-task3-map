package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        for(Integer i:functionMap.values()){
            if(Integer.valueOf(requiredValue).equals(i)){
                return true;
            }
        }
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        HashMap<Integer,Integer>result=new HashMap<>();
        for(int i=0;i<sourceList.size();i++){
            result.put(sourceList.get(i),5*sourceList.get(i)+2);
        }
        return result;
    }
}
