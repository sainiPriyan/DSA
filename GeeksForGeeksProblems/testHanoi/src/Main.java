public class Main {
    public static void main(String[] args) {
        System.out.println(toh(2,1,3,2));
    }
    public static long toh(int n, int from, int to, int aux) {
        if(n==1){
            System.out.println("move disk 1 from rod " +from+" to rod "+to);
            return 0;
        }
        else {

            toh(n - 1, from, aux, to);
            System.out.println("move disk " + n + " from rod " + from + " to rod " + to);
            toh(n - 1, aux, to, from);

            return (long) Math.pow(2, n) - 1;
        }
    }
}
