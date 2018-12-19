package Java;

import HashTable.HashTable;

import java.io.*;
import java.util.*;

public class Collection {
    //    public static void main(String args[]){
//        int arr[]= new int[]{2,4,6,9};
//        Vector<Integer> v= new Vector<>();
//        HashMap<Integer,String> hm= new HashMap<>();
//        v.addElement(1);
//        v.addElement(2);
//        v.add(4);
//        v.add(3);
//        Collections.sort(v);
//        System.out.println(v);
//        hm.put(1,"Gaya");
//        hm.put(2,"Kolkta");
//        hm.put(0,"Haya");
//        System.out.println(hm.get(2));
//        System.out.println(v.elementAt(2));
//
//    }
    public static void main(String[] args) {
       HashSet<String> hs= new HashSet<>();
       hs.add("Gaya");
       hs.add("Nice");
       hs.add("Kya");
       Iterator it= hs.iterator();
       while (it.hasNext()){
           System.out.println(it.next());
       }
    }
}
