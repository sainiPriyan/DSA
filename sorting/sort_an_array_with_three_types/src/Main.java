import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        int[] arr = new int[]{0,1,1,2,2,1,2,0,1,2,0};
        sort0and1and2(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort0and1and2(int[] arr){
        int lo=0, mid = 0, hi = arr.length-1;

        while(mid<=hi){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++;
                mid++;
            }
            else if(arr[mid] == 1) mid++;

            else{
                int temp = arr[hi];
                arr[hi] = arr[mid];
                arr[mid] = temp;

                hi--;
            }
        }

    }
}
