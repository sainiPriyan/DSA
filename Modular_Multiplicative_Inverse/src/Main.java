public class Main {
    public static void main(String[] args) {

        System.out.println(modInverse(3,11));
    }
    public static int modInverse(int a, int m){
        int ans =1;

        if(m==1) return -1;

        for(int i =1;i<m;i++){

            if(a*i % m == 0) return -1;
            if(a*i % m < a*ans % m) ans = i;
        }
        return ans;
    }

}
