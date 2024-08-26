public class Main {
    public static void main(String[] args) {
        System.out.println(  power(13,31));

    }
   public static long power(int n,int r) {

     long test ;

       if (r <= 1) return n;

       n=n%1000000007;

       if (r % 2 == 0)
           test = power((n * n)%1000000007, r / 2);
       else
           test = (long) (n * (power((n * n)%1000000007, r / 2))%1000000007)%1000000007;
        //(a x b) mod m = ((a mod m) x (b mod m)) mod m

       return test%1000000007;
   }

}
