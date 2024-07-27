public class Main {
    public static void main(String[] args) {
        System.out.println(termOfGP(2,3,5));
    }
    public static double termOfGP(int a,int b,int n){

        if(n == 1) return a;
        else if(n ==2 ) return b;

        else{
            return a* Math.pow(((double)b/a),n-1);
        }


    }
}
