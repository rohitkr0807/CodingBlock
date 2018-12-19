package String;

public class StringBuilderdemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Gaya");
        System.out.println(sb);
        System.out.println(sb.length());
        sb.insert(1, "Patna");
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.delete(5, sb.length());
        System.out.println(sb);
        System.out.println(sb.charAt(2));
        String str = "China";
        str = str.substring(0, 2) + "lol" + str.substring(3);
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        Duplicate("aabccbaa");
        maxArrangement(16);
        Duplicate("aaaabbbc");


    }

    public static void Duplicate(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        System.out.println(sb);
        int i = 0;
        while (i < sb.length()-1) {
            if (sb.charAt(i)==sb.charAt(i + 1)) {
                sb.deleteCharAt(i);


            }else{
//                System.out.println(sb);
            }
            i++;
        }
        System.out.println(sb);

    }
    public static void maxArrangement(int n){
        int row=0;
        int k=0;
        while (k<n){
            k= row*(row+1)/2;
            row++;
        }
        System.out.println(row-1);

    }
}
