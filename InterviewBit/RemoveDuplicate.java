package InterviewBit;

import java.util.ArrayList;

public class RemoveDuplicate {
    public int removeDuplicates(ArrayList<Integer> a) {
        if (a.size() == 0 || a.size() == 1) {
            return a.size();
        }
        int prev= a.get(a.size()-1);
        for (int i= a.size()-2; i>=0; i--){
            if(a.get(i)==prev){
                a.remove(i);
            }else{
                prev=a.get(i);
            }
        }
        return a.size();

    }
}
