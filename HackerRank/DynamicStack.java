package HackerRank;

public class DynamicStack extends Stack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int capacity){
        super(capacity);
    }
    public void push(int item){
        if(this.size()==this.data.length){
            int []oldArray= this.data;
            this.data= new int[2*oldArray.length];
            for (int i = 0; i <oldArray.length ; i++) {
                this.data[i]= oldArray[i];
            }
        }
    }
}
