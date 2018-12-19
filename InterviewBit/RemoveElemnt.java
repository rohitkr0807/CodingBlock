package InterviewBit;

import java.util.ArrayList;

public class RemoveElemnt {
    public static int removeElement(ArrayList<Integer> a, int b) {
        int arr[]= new int[a.size()];
        for (int i = 0; i <a.size() ; i++) {
            arr[i]= a.get(i);

        }
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]!=b){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(4);
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(3);
        System.out.println(removeElement(a, 4));
        System.out.println(remove(a,1));
        System.out.println(removeelement(a,4));


    }
    public static int remove(ArrayList<Integer> a, int b){
        int size= a.size();
        while (a.contains(b)){
            a.remove(new Integer(b));
        }
        return a.size();
    }
    public static int removeelement(ArrayList<Integer> a, int k){
        int count=0;
        for (int i = 0; i <a.size() ; i++) {
            if(a.get(i)!=k){
                a.set(count,a.get(i));
                count++;
            }
        }
        return count;
    }
}
