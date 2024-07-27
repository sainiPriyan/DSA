public class Main {
    public static void main(String[] args) {
        System.out.println(computingPowerBinary(3,5));
    }

    public static int computingPower(int x,int n){
        return (int)Math.pow(x,n);
    }

    public static int computingPowerLoop(int x,int n) {

        int ans = 1;

        if (n == 0) return 1;

        for (int i = 0; i < n / 2; i++) {
            ans *= x;
        }
        ans *= ans;

        if (n % 2 == 0) return ans;
        else return ans *x;

    }

    public static int computingPowerBinary(int x,int n){
        if(n==0) return 1;
        int ans =1;

       while(n>0){
          if(n%2 != 0)
              ans *= x;

          x*=x;
          n=n>>1;
          }

       return ans;
    }
      }

