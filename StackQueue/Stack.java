package StackQueue;
//based on LIFO
public class Stack {
    protected int[] data;
    protected int tos;  //tos means top of stack
    public static final int Default_Capacity=10;
    public Stack(){
        this(Default_Capacity);
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
        for(int i= this.tos; i>=0; i--){
            System.out.print(this.data[i]+ ", ");
        }
        System.out.println("END");

    }
    public void push(int item) throws Exception {
        if(this.size()==this.data.length){
            throw new Exception("Stack is full");
        }
        this.tos++;
        this.data[this.tos]=item;
    }
    public int top() throws Exception {
        if(this.isEmpty()){
            throw new Exception("Stack is Empty");
        }
        return this.data[this.tos];
    }
    public int pop() throws Exception {
        if(this.isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int rv= this.data[this.tos];
        this.data[this.tos]=0;
        this.tos--;
        return rv;

    }

}
