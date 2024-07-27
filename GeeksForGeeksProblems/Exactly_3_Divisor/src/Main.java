public class Main {
    public static void main(String[] args) {
        System.out.println(exactly3Divisors(67));
    }
    public static int exactly3Divisors(int n){
        int counter =0;
        for(int i = 2;i*i<n;i++) {

            if(isPrime(i)) counter++;

            System.out.println(i+" "+ counter);
        }
        return counter;
    }
    public static boolean isPrime(int num){

        if(num == 1 || num ==0 ) return false;
        else if(num == 2 || num ==3) return true;
        else if (num%2 == 0 || num%3 == 0) return false;

        for (int i = 5; i*i<=num;i+=6){
            if (num% (i) == 0 || num%(i+2) == 0 ) return false;
        }
        return true;
    }
}
