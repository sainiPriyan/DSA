public class Main {
    public static void main(String[] args){
        System.out.println(trailingZeros(251));
    }

    public static int trailingZeros(int number){
        int result = 0;
        for(int i = 5;i<=number;i*=5){

            result+= number/i;
        }
        return result;
    }
}
