package Test;
import java.util.*;
import java.util.stream.Collectors;

import com.sun.org.apache.xpath.internal.SourceTree;

public class TestClass {
    public static void main(String[] args) {
//
//        List<Double> ld= Arrays.asList(1.2,2.3,3.5);
//        System.out.println(sumOfList(ld));
        List<Integer> numbers= Arrays.asList(9,10,3,4,7,3,4);
        List<Integer> distinct = numbers.stream().map(i -> i*i).distinct().collect(Collectors.toList());
        System.out.println(distinct);



    }
    public static double sumOfList(List <? extends Number> list){
        double s=0.0;
        for(Number n:list)
            s+= n.doubleValue();
        return s;
    }
}

