package String;
import java.io.*;
import java.util.*;

public class Split {
    public static void main(String[] args) {
        String str = "He is a very very good boy, isn't he?";
        String delims = "[ .,?!']+";
        String[] tokens = str.split(delims);
        System.out.println(tokens.length);
        for (int i = 0; i <tokens.length ; i++) {
            System.out.println(tokens[i]);
        }


    }
}
