import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{1,6,7,3,2,5};
        int pivot = lomuto_Partition(arr,3);
        System.out.println(Arrays.toString(arr) +"\npivot is at "+ (pivot+1)+"th position");

    }
    public static int lomuto_Partition(int[] arr, int pivot){

        int i = -1, temp;

        temp = arr[arr.length-1];
        arr[arr.length-1] = arr[pivot];
        arr[pivot] = temp;

        pivot = arr[arr.length-1];

        for (int j = 0; j < arr.length-1; j++) {
            if(arr[j]<pivot){
                i++;
                System.out.println(i);

                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1] = arr[arr.length-1];
        arr[arr.length-1] = temp;

        return i;
    }


}
