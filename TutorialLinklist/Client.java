package TutorialLinklist;

public class Client {
    public static void main(String[] args) throws Exception {
        LinkedListTut ll= new LinkedListTut();
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(7);
        ll.addFirst(7);
        ll.addFirst(9);
//        ll.addFirst(7);

//        ll.addAt(3,25);
////        ll.addLast(34);
//        ll.display();
////        ll.swapNodes(5,6);
//        ll.display();
//        ll.eliminateDuplicates();
//        ll.display();
//        ll.merge(ll);
//        ll.display();
        System.out.println(ll.mid());
    }
}
