public class Main {

    public static void main(String[] args){

        if(isPrime(1031)) System.out.println("It is prime");
        else System.out.println("Not prime");

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
