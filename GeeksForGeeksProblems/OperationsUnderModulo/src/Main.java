public class Main {
    public static void main(String[] args) {
        System.out.println(multiplicationUnderModulo(92233720368547758L, 92233720368547758L));
    }

    public static long sumUnderModulo(long a, long b) {

        return (a % 1000000007 + b % 1000000007) % 1000000007;
    }

    public static long multiplicationUnderModulo(long a, long b) {

        return ((a % 1000000007) * (b % 1000000007) % 1000000007);
    }
}
