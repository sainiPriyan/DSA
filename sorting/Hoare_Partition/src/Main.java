import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{5,3,8,4,2,7,1,10};
        int pivot = hoarePartition(arr,0,7);
        System.out.println(Arrays.toString(arr) +" pivot =  "+ pivot);

    }
    public static int hoarePartition(int[] arr, int l, int h){
        int pivot = arr[l];
       int  i = l-1, j = h+1;

        while (true){
            do {i++;
                System.out.println("i-"+i);
            }while (arr[i]<pivot);

            do{j--;
                System.out.println("j-"+j);
            }while (arr[j]>pivot);

            if (i>=j){
                return j;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
