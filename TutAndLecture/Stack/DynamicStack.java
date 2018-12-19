package TutAndLecture.Stack;

public class DynamicStack extends Stack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int capacity) {
        super(capacity);
    }

    public void push(int item) {
        if (this.size() == this.data.length) {
            int oldArray[] = this.data;
            this.data = new int[2 * this.data.length];
            for (int i = 0; i < oldArray.length; i++) {
                this.data[i] = oldArray[i];
            }
        }
        try {
            super.push(item);
        } catch (Exception ex) {

        }
    }
}
