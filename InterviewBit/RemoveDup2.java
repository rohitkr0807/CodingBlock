package InterviewBit;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveDup2 {
    public static int removedup(ArrayList<Integer> a){
        Collections.sort(a);
        int index=1;
        int n= a.size();
        for (int i = 2; i <n ; i++) {
            if(!a.get(i).equals(a.get(index-1))){
                index++;
                a.set(index,a.get(i));
            }else{

            }
        }
        return index+1;

    }
    public static int removeDupl(ArrayList<Integer> a){
        if(a.isEmpty()){
            return 0;
        }
        int flag=0;
        int previous= a.get(a.size()-1);
        int i= a.size()-2;
        while (i>=0){
            int current= a.get(i);
            if(current!=previous){
                flag=0;
            }else{
                flag++;
            }
            previous=current;
            if(flag>=2){
                a.remove(i);

            }
            i--;
        }
        return a.size();
    }
}

