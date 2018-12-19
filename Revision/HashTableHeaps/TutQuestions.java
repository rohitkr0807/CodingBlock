package Revision.HashTableHeaps;

import Heap.Heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TutQuestions {
    public static void main(String[] args) {
        System.out.println(uniqueChars("asdfghgfdsasdfgs"));
    }

    public static ArrayList<Character> uniqueChars(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            hm.put(str.charAt(i), 0);
        }
        ArrayList<Character> retVal = new ArrayList<>();
        Set<Character> ret = hm.keySet();
        for (Character value : ret) {
            retVal.add(value);
        }
        return retVal;
    }

    public static ArrayList<Integer> getConsecutiveSeq(ArrayList<Integer> numbers) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (Integer num : numbers) {
            int nm1 = num - 1;
            int nm2 = num + 1;
            if (map.containsKey(nm1)) {
                map.put(nm1, false);
            } else {
                map.put(nm2, true);
            }
        }
        Set<Map.Entry<Integer, Boolean>> entries = map.entrySet();
        int lsl = 0;
        int lss = 0;
        for (Map.Entry<Integer, Boolean> entry : entries) {
            if (entry.getValue() == false) {
                continue;
            }
            int seql = 0;
            int seqs = entry.getKey();
            while (map.containsKey(seqs + seql)) {
                seql++;
            }
            if (seql > lsl) {
                lsl = seql;
                lss = seqs;
            }
        }
        ArrayList<Integer> rv = new ArrayList<>();
        for (int i = 0; i < lsl; i++) {
            rv.add(lss + i);
        }
        return rv;
    }

    public static int highestFreque(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer element = arr[i];
            if (!map.containsKey(element)) {
                map.put(element, 1);
            } else {
                int ov = map.get(element);
                int nv = ov + 1;
                map.put(element, nv);
            }
        }
        int hf = Integer.MIN_VALUE;
        int hfe = 0;
        Set<Map.Entry<Integer, Integer>> allEntries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : allEntries) {
            if (entry.getValue() > hf) {
                hf = entry.getValue();
                hfe = entry.getKey();
            }
        }
        return hfe;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer>... lists) {
        ArrayList<Integer> rv = new ArrayList<>();
        Heap<Triplet> heap= new Heap<Triplet>(true);
        for (int i = 0; i < lists.length; i++) {
            Triplet p= new Triplet(i,0,lists[i].get(0));

        }
        return rv;


    }
    private static class Triplet implements Comparable<Triplet>{
        int li;
        int iwli;
        int num;
        Triplet(int li,int iwli,int num){
            this.li=li;
            this.iwli=iwli;
            this.num=num;

        }
        public int compareTo(Triplet o){
            return this.num-o.num;
        }
    }
}
