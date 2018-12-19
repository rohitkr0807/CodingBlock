package InterviewBit.StackAndQueues;


import java.util.*;

public class paranthesis {
    public  int paranthesis(String str){
        int length= str.length();
        char[] array= str.toCharArray();
        Stack<Character> stack= new Stack<Character>();
        if(length==0){
            return 1;
        }
        for (int i = 0; i <length ; i++) {
            if(array[i]=='('|| array[i]=='{'||array[i]=='['){
                stack.push(array[i]);
            }
            if(array[i]==')'|| array[i]=='}'||array[i]==']'){
                if(stack.isEmpty()){
                    return 0;
                }
                char temp= stack.pop();
                if((temp=='(' && array[i]==')')|| (temp=='{' && array[i]=='}') || (temp=='[' && array[i]==']')){
                    continue;
                }else{
                    return 0;
                }
            }
        }

        if(!stack.isEmpty()){
            return 0;
        }return 1;
    }
}
