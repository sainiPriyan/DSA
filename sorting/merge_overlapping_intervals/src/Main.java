import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,5},{4,5},{4,10},{11,15}};

        System.out.println(Arrays.deepToString(mergeOverlappingIntervals(arr).toArray()));

    }
    public static ArrayList<int[]> mergeOverlappingIntervals(int[][] arr){
        ArrayList<int[]> list = new ArrayList<>();
        mergeSort(arr,0, arr.length-1);

        int high = -1;

        System.out.println(Arrays.deepToString(arr));

        list.add(arr[0]);

        for (int i = 1; i < arr.length-2;i++){

            if(arr[i][1] < arr[i+1][0]){
                list.add(arr[i]);
            }
            else {
                if(arr[i][1] > list.get(list.size()-1)[1]){
                    list.get(list.size()-1)[1] = arr[i][1];
                }
            }
        }
        return list;
    }
    public static void mergeSort(int[][] arr,int l , int h){

        if(l<h){
            int m = l + (h-l)/2;

            mergeSort(arr,l,m);
            mergeSort(arr,m+1,h);
            merge(arr,l,m,h);
        }
    }
    public static void merge(int[][] arr,int l,int m, int h){
        int n1 = m-l+1, n2 = h-m;
        int [][] left = new int[n1][], right = new int[n2][];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l+i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[i+m+1];
        }

        int i = 0, j = 0, k = l;

        while (i<n1 && j<n2){
            if(left[i][0] < right[j][0]){
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = right[j];
            j++;
            k++;
        }

    }
}
