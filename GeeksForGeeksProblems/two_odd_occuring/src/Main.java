public class Main {
    public static void main(String[] args) {
        twoOddOccurring(new int[] {1,2,2,2,2,3,3,5},8);

    }
    public static void twoOddOccurring(int[] arr,int n){
        int xor= 0;
        for(int i : arr)
           xor = xor^i;

       int k = xor & ~(xor -1),ans1 = 0,ans2 = 0;

       for(int i = 0;i<n;i++){
           if((arr[i]&k)!= 0)
               ans1 = ans1^arr[i];
           else
               ans2 = ans2 ^arr[i];
       }
        System.out.println(ans1+", "+ans2);
    }
}
