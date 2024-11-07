public class Main {
    public static void main(String[] args) {
        System.out.println(isPair(new int[]{1,2,3,4,5,6,7},3));
    }
    public static boolean isPair(int[] arr, int x){
        int a = 0, b = arr.length-1;

            while(a<b){

                if(arr[a]+arr[b] == x) {
                    System.out.println(arr[a]+" "+arr[b]);
                    return true;
                }
                else if(arr[a]+arr[b]>x)
                    b--;
                else
                    a++;

                System.out.println("a = "+a+" b ="+b);
            }
            return false;
    }
}
