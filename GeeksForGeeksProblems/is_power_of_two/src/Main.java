public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(536870912));
    }

    public static boolean isPowerOfTwo(int n){
        if(n==0) return false;
        else return ((n&(n-1)) ==0 );
    }
}
