
public class Main {
    public static void main(String[] args) {
        altPrintDivisors(9 );

    }
    public static void printDivisors(int n){
        System.out.print("1, "+n+", ");

        int i =2;
        while(i*i<=n){
            if(n%i==0){
                System.out.print(i+", ");
                if(i!= n/i) System.out.print(n/i+", ");
                n /=i;
            }
            i++;
        }
    }
    public static void altPrintDivisors(int n){
        System.out.print("1, ");

        int i =2;
        while(i*i<n){
            if(n%i==0){
                System.out.print(i+", ");
               }
            i++;
        }
        while(i>=1){
            if(n%i==0){
                System.out.print(n/i+", ");
               }
            i--;
        }


    }


}
