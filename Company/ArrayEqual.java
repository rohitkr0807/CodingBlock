package Company;
import java.util.*;

public class ArrayEqual {
    public static void main(String[] args) {
        Scanner scrn= new Scanner(System.in);
        int t= scrn.nextInt();
        while (t-->0){
            System.out.println(equal(scrn));

        }

    }
    public static int equal(Scanner scrn){
        int n= scrn.nextInt();
        int arr1[]= new int[n];
        for (int i = 0; i <n ; i++) {
            arr1[i]= scrn.nextInt();
        }
        int arr2[]= new int[n];
        for (int i = 0; i <n ; i++) {
            arr2[i]= scrn.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int a=0;
        while (arr1.length>a){
            if(arr1[a]!=arr2[a]){
                return 0;
            }
            a++;

        }
        return 1;

    }
    public static boolean areEqual(int arr1[], int arr2[]){
        int n= arr1.length;
        int m= arr2.length;
        if(n!=m){
            return false;
        }
        Map<Integer,Integer> map= new HashMap<>();
        int count=0;
        for (int i = 0; i <n ; i++) {
            if(map.get(arr1[i])==null){
                map.put(arr1[i],1);
            }else{
                count=map.get(arr1[i]);
                count++;
                map.put(arr1[i],count);
            }
        }
        for (int i = 0; i <n ; i++) {
            if(!map.containsKey(arr2[i])){
                return false;
            }
            if(map.get(arr2[i])==0){
                return false;
            }
        }
        return true;
    }
}
