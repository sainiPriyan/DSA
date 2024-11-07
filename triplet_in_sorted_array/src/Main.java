public class Main {
    public static void main(String[] args) {

        System.out.println(isTriplet(new int[]{1,2,3},6));

    }
    public static boolean isTriplet(int[] arr, int x){
        int a=0, b = (arr.length-1)/2, c=arr.length-1;

        while(a!=b && b!=c) {
            if(arr[a]+arr[b]+arr[c] == x) {
                System.out.println("Final - a = "+a+", b = "+b+", c = "+c);
                return true;}
            else if (arr[a]+arr[b]+arr[c]<x){
                if(c-b != 1 ) b++;
                else a++;
            }
            else{
                if(b-a != 1 ) b--;
                else c--;
            }
            System.out.println("a = "+a+", b = "+b+", c = "+c);
        }
        return false;
    }
}
