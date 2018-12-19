package Company;

public class DiffOfLarge {
    //    Given two numbers as strings. The numbers may be very large (may not fit in long long int), the task is to find difference of these two numbers.
    public static void main(String[] args) {
        System.out.println(diff("12332","2343"));

    }

    public static String diff(String str1, String str2) {
        String str="";
        int n1= str1.length();
        int n2= str2.length();
        int diff= n1-n2;
        int carry=0;
        for(int i=n2-1; i>=0;i--){
            int sub= ((str1.charAt(i+diff)-'0')-(str2.charAt(i)-'0')-carry);
            if(sub<0){
                sub=sub+10;
                carry=1;
            }else{
                carry=0;
            }

        }
        return str;
    }
}
