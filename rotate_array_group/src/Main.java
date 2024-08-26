import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        rotateArr(arr,2,10);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateArr(int[] arr, int d, int n) {
        reverseArr(arr,0,d);
        reverseArr(arr,d,n);
        reverseArr(arr,0,n);
    }

    static void reverseArr(int[] arr, int a , int b){
        int temp;
        for(int i = 0; i<((b-a+1)/2); i++){
            temp = arr[a+i];
            arr[a+i] = arr[b-1-i];
            arr[b-1-i] = temp;
        }
    }
}
