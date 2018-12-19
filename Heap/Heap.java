package Heap;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> data;
    private boolean isMin;

    public int size() {
        return this.data.size();
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public Heap(boolean isMin) {
        this.data = new ArrayList<>();
        this.isMin = isMin;
    }

    public Heap(T[] arr, boolean isMin) {
        this(isMin);
        for (int i = 0; i < arr.length; i++) {
            this.data.add(arr[i]);
        }
        for(int i= this.data.size()/2-1;i>0;i--){

        }
    }
    public Heap(){
        this(false);
    }

}
