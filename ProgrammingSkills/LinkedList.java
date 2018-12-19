package ProgrammingSkills;

import java.util.Iterator;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList ll = new java.util.LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);

        System.out.println(ll);
        System.out.println("SIZE= " + ll.size());
        Object obj[] = ll.toArray();
        int s = 0;
        for (int i = 0; i < obj.length; i++) {


            s = s + (Integer) obj[i];

        }
        System.out.println(s);
        ll.addFirst(5);
        ll.addFirst(4);
        ll.add(2,7);
        System.out.println(ll);
        System.out.println(ll.size());
        Iterator it= ll.iterator();
        int s1=0;
        while (it.hasNext()){
            Object obj1= it.next();


        }


    }
}
