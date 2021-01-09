package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,1,1,2,3,4,3,4));
        HashMap<Integer,Integer> map = new HashMap<>();
        for (Integer i: list) {
            Integer i1=map.get(i);
            map.put(i,(i1==null)? 1: i1+1);
        }
        for (Map.Entry<Integer, Integer> map1 : map.entrySet()) {
            if (map1.getValue()==2){
                System.out.println(map1.getKey());
            }
        }
    }
}
