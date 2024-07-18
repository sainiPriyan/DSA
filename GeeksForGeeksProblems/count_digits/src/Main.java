public class Main {

    public static void main(String[] args){
        int num = 5;

        System.out.println("Number of digits = "+digitCount(num));
        System.out.println("Reverse  = "+ reverse(num));

        if (isPalindrome(num)){
            System.out.println(num+" is a palindrome");
        }
        else System.out.println(num+" is not a palindrome");

        System.out.println("Factorial of "+num+" using loop = "+factorial(num));
        System.out.println("Factorial of "+num+" using recursion = "+factorial2(num));
    }

    public static int digitCount(int number){
        int counter =0;
        while (number!=0){
            counter++;
            number/=10;
        }
        return counter;
    }
    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }

    public static int reverse(int number){
        int ans = 0;
        while (number != 0){
            ans = ans*10 + (number%10);
            number /= 10;
        }
        return ans;
    }

    public static int factorial(int number){
       int ans = 1;
        while (number>0){
            ans *= number;
            number -= 1;
        }
        return ans;
    }

    public static int factorial2(int number){

        if(number == 0) return 1;
        return  number*factorial2(number-1);

    }
}
