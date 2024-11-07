public class Main {
    public static void main(String[] args) {

        int[] arr = {6,4,2,1,5,7,3};
        int a = kSmallest(arr,3);
        System.out.println(a);


    }
    public static int kSmallest(int[] arr,int k){
        int l = 0, h = arr.length-1, p;

        while(l<=h) {
            p = lomutoPartition(arr, l, h);

            if (p == k-1) return arr[p];
            else if (p > k-1) {
                h = p - 1;
            } else l = p + 1;
        }
        return -1;
    }
    public static int lomutoPartition(int[] arr, int l, int h){
        int i = l-1,j=l,pivot = arr[h];

        for (; j < h; j++) {
            if(arr[j]<pivot){
                i++;

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[h];
        arr[h] = arr[i+1];
        arr[i+1] = temp;

        return i+1;
    }
}
