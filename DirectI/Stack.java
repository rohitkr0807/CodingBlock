package DirectI;

public class Stack {
    protected int data[];
    protected int tos;
    public static final int DefaultCapacity=10;
    public Stack(){
        this(DefaultCapacity);
    }
    public Stack(int capacity){
        this.data= new int[capacity];
        this.tos=-1;
    }
    public int size(){
        return this.tos+1;
    }
    public boolean isEmpty(){
        return this.size()==0;
    }
    public void display(){
        for(int i= this.tos;i>=0;i--){
            System.out.print(this.data[i]+" ");
        }
        System.out.println("End");
    }
    public void push(int item) throws Exception{
        if(this.size()==this.data.length){
            throw new Exception("Stack is full");
        }
        this.tos++;
        this.data[this.tos]= item;

    }
    public int pop() throws Exception{
        if(this.isEmpty()){
            throw new Exception("Empty");
        }
        int rv= this.data[this.tos];
        this.data[this.tos]=0;
        this.tos--;
        return rv;
    }
}
