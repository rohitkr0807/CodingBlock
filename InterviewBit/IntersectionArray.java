package InterviewBit;

import java.util.ArrayList;
import java.util.List;

public class IntersectionArray {
    public static ArrayList<Integer> intersect(final List<Integer> a, final List<Integer> b) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int aN= a.size();
        int bN= b.size();
        int i=0;
        int j=0;
        while (i<aN & j<bN){
            if(a.get(i)<b.get(j)){
                i++;
            }else if(a.get(i)>b.get(j)){
                j++;
            }else{
                result.add(b.get(j));
                i++;
                j++;
            }
        }
        return result;
    }
}
