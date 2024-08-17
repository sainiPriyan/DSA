import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printAllPermutations("YES",0);

    }
    public static void printAllPermutations(String s,int n){

        if (n== s.length()-1) {
            System.out.println(s+" ");
            return;
        }

       for(int i =n;i<s.length();i++){

           s= swap(n,i,s);
           printAllPermutations(s,i+1);
           s= swap(n,i,s);

       }

    }
    public static String swap(int i, int j, String s){
       char x;

       x = s.charAt(i);
       c[i] = c[j];
       c[j] = x;

       return Arrays.toString(c);

    }
}
