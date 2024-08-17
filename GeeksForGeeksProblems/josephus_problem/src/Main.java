public class Main {

    public static void main(String[] args) {

        System.out.println(josephus(7,2));

    }

    public static int josephus(int n,int k){
        if(n==1) return 0;

        else 
            return (josephus(n-1,k)+k)%n;
    }
}
