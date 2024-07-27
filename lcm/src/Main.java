public class Main {
    public static void main(String[] args) {

        System.out.println("LCM = "+lcm(2,4));

    }

    public static int lcm(int num1, int num2 ){
        return (num1*num2)/gcd(num1,num2);
    }
    public static int gcd(int num1, int num2){
        if (num2 == 0){
            return num1;
        }
        return gcd(num2,num1%num2);
    }
}
