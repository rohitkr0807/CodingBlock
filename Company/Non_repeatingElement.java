package Company;
import java.util.*;

public class Non_repeatingElement {
    public static void main(String[] args) {
        int arr[]={2,2,3,5,5,5,5,3,7};
        nonrepeatingunit(arr);

    }
    public static void nonrepeatingunit(int arr[]){
        Arrays.sort(arr);
        ArrayList al= new ArrayList();
        for (int i = 0; i <arr.length ; i++) {
            al.add(arr[i]);
        }
        for (int i = 0; i <al.size() -1; i++) {
            if(al.get(i)==al.get(i+1)){
                al.remove(al.get(i));

            }
        }
        for (int i = 0; i <al.size() ; i++) {
            System.out.println(al.get(i));
        }
    }
}
