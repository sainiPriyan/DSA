public class Main {
    public static void main(String[] args) {
        System.out.println(gcdBetter(200,100));

    }

    public static int gcd(int number1, int number2){

        int test = Math.min(number1,number2),factor=1;

        while(test > 0){
            if(number1%test == 0 && number2%test ==0){
                factor = test;
                break;
            }
            test--;
        }
        return factor;
    }

    public static int gcdBetter(int num1, int num2){
        if (num2 == 0){
            return num1;
        }
       return gcdBetter(num2,num1%num2);
    }
}
