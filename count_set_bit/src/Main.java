public class Main {
    public static void main(String[] args) {
        System.out.println(lookUpTableMethod(536870911));
    }

    public static int numOfSetBits(int n) {
        int counter =0;
        while (n > 0) {
            counter+= (n&1);
            n/=2;
        }
        return counter;
    }
    public static int brianKerningamsAlgorithm(int n){
        int counter = 0;
        while(n>0){
            n = n&(n-1);
            counter++;
        }
        return counter;
    }
    public static int lookUpTableMethod(int n){

        int[] arr = new int[256];
        for(int i = 1; i < 256;i++){
            arr[i] = arr[i&(i-1)]+1;
        }

        return arr[255&n] + arr[255&(n>>8)] + arr[255&(n>>16)] + arr[255&(n>>24)] ;

    }
}
