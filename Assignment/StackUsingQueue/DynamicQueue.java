package Assignment.StackUsingQueue;

import java.util.Queue;
import java.util.*;

/**
 * Created by piyush0 on 01/07/17.
 */
public class DynamicQueue extends StackQueue.Queue {

    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int capacity) {
        super(capacity);
    }

    public void enqueue(int item) {

        if (this.size() == this.data.length) {
            int[] oa = this.data;

            this.data = new int[2 * oa.length];

            for (int i = 0; i < oa.length; i++) {
                int index = (this.front + i) % oa.length;
                this.data[i] = oa[index];
            }

            this.front = 0;

        }
        try {
            super.enqueue(item);
        } catch (Exception e) {

        }

    }

}
