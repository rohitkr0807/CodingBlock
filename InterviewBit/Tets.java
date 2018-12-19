package InterviewBit;

import javax.xml.soap.Node;
import java.util.LinkedList;

public class Tets {
    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();
       ll.add(0);
       ll.add(13);
       ll.add(14);
        ll.add(19);
        ll.add(17);
        ll.add(15);
        System.out.println(linearSearch(ll,19));


    }

    public static void rotate() throws Exception {
        LinkedList ll = new LinkedList();
        ll.add(23);
        ll.remove();
        ll.add(24);
        ll.remove();
        ll.remove(1);


        if (ll.size() == 0) {
            throw new Exception("Out of bound");
        }

    }

    public static int linearSearch(LinkedList l, int item) {
        for (int i = 0; i < l.size(); i++) {
            l.get(i);
            if((int) l.get(i)==item){
                return 1;
            }

        }
        return 0;
    }
    public static void reverseDi(LinkedList l, Node head){
        int left=0;
        int right= l.size()-1;
        while (left<=right){

            left++;
            right--;
        }
    }
}
