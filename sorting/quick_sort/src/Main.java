import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{2,5,1,3,4};
        qSortH(arr,0,4);
        System.out.println(Arrays.toString(arr));

    }

    public static void qSortL(int[] arr, int l, int h){
        if(l<h){
            int p = lomutoPartition(arr, l , h);
            qSortL(arr,l,p-1);
            qSortL(arr,p+1,h);
        }
    }

    public static void qSortH(int[] arr, int l, int h){

        if(l<h){
            int p = hoarePartition(arr, l , h);
            qSortH(arr,l,p);
            qSortH(arr,p+1,h);
        }
    }


    public static int lomutoPartition(int[] arr, int l, int h){

        int i = l-1,pivot = arr[h];

        for(int j = l;j<h;j++){
            if(arr[j]<pivot){
                int temp = arr[i+1];
                arr[i+1] = arr[j];
                arr[j] = temp;

                i++;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;

        return i+1;
    }

    public static int hoarePartition(int[] arr, int l, int h){
        int i = l-1, j = h+1, pivot = arr[l];

        while(true){
            do{
                i++;}
            while(arr[i]<pivot);

            do{
                j--;}
            while(arr[j]>pivot);

            if(i>=j) return j;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}

