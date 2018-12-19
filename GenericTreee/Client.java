package GenericTreee;

public class Client {
    public static void main(String[] args) {
        // 10 3 20 2 50 0 60 0 30 3 70 0 80 2 110 0 120 0 90 0 40 1 100 0
        GenericTree gt = new GenericTree();
        gt.display();
        System.out.println(gt.size());
        System.out.println(gt.size2());
        gt.preorder();
        gt.postOrder();
        gt.levelOrder();
        gt.multiSolver();
        gt.multiiSolver();

    }
}
