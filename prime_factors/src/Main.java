public class Main {

    public static void main(String[] args) {

        betterPrintPrimeFactors(14);
    }

    public static void printPrimeFactors(int n){

        int number = n;
        int i =2;

        while(i<=number){

            if (isPrime(i)){
                if (number%i ==0){
                    System.out.print(i+", ");
                    number /= i;
                }
                else i++;
            }
            else i++;
        }
    }
    public static void betterPrintPrimeFactors(int num){
        if (num == 1 || num == 0) return;
        while(num%2==0){ System.out.print("2, "); num/=2;}
        while(num%3==0){ System.out.print("3, "); num/=3;}

        for (int i = 5; i * i <= num; i += 6) {

                while(num % (i) == 0){
                    System.out.print(i+", ");
                    num/=i;
                }
                while(num % (i+2) == 0){
                    System.out.print((i+2)+", ");
                    num/=(i+2);
                }
        }
        if(num>3) System.out.println(num+", ");
    }




    public static boolean isPrime(int num) {

            if (num == 1 || num == 0) return false;
            else if (num == 2|| num == 3) return true;
            else if (num % 2 == 0 || num % 3 == 0) return false;

            for (int i = 5; i * i <= num; i += 6) {
                if (num % (i) == 0 || num % (i + 2) == 0) return false;
            }
            return true;
        }
    }

