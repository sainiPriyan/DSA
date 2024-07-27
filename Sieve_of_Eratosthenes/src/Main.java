import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        sieve(101);
    }

    public static void sieve(int n){

        boolean [] array = new boolean[n+1];
        Arrays.fill(array,true);

        for(int i = 2;i*i<n;i++){
            if(array[i]){
                System.out.print(i+" ");
                for(int j = i; j*i <= n; j++){
                    array[j*i] = false;
                }
            }
        }

        for (int i =2; i<=n;i++){
            if(array[i]) System.out.print(i+" ");
        }
        System.out.println();

        }

}
