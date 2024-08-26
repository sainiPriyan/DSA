public class Main {
    public static void main(String[] args) {
        powerSet("abc");

    }
    public static void powerSet(String s){
         int n= s.length();

         for(int i = 0; i<(1<<n);i++){
             for(int j =0;j<n;j++)
                 if((i & (1<<j)) !=0)
                     System.out.print(s.charAt(j));
                 System.out.print(", ");
         }
    }
}

