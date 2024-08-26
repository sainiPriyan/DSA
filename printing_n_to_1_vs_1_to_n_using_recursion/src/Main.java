public class Main {
    public static void main(String[] args) {

        oneToN(16);
        System.out.println();
        System.out.println("- ".repeat(50));
        nToOne(16);
    }
    public static void nToOne(int n){
        if(n == 0) return;
        System.out.print(n+" ");
        nToOne(n-1);
    }
    public static void oneToN(int n){
        if(n == 0) return;
        oneToN(n-1);
        System.out.print(n+" ");
    }
}
