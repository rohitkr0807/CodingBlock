package Company;

import java.util.*;

public class MergeKlist {
    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            this.val = x;
            this.next = null;
        }
    }

    public ListNode mergeLists(ArrayList<ListNode> a) {
        if (a.size() == 0) {
            return null;
        }
        PriorityQueue<ListNode> q= new PriorityQueue<ListNode>(a.size(), new Comparator<ListNode>() {
            @Override
            public int compare(ListNode a, ListNode b) {
                if(a.val>b.val)
                    return 1;
                else if(a.val<b.val) return -1;
                else return 0;
            }
        });
        for(ListNode node: a){
            if(node!= null){
                q.add(node);
            }
            ListNode head= new ListNode(0);
            ListNode p= head;

        }
        return null;
    }
}
