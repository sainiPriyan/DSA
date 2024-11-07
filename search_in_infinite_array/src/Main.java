public class Main {
    public static void main(String[] args) {
        System.out.println(searchInInfiniteArray2(new int[]{1,2,4,5,11,12,13,19,21},2));
    }
    public static int searchInInfiniteArray(int[] arr, int x){
        int low = 0, high = x - arr[0], mid ;

        while (low<=high){
            mid = (low+high)/2;
            if(x == arr[mid]) return mid;
            else if(x > arr[mid]) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }

    public static int searchInInfiniteArray2(int[] arr, int x){ // more efficient
        if(arr[0] == x) return 0;
        int i = 1;

        while(arr[i] < x)
            i *=2;

        if(arr[i] == x) return i;

        return binarySearch(arr,x,i-1, i/2+1);

    }
    public static int binarySearch(int[] arr, int n,int high,int low){
        int mid;

        while(low<=high){
            mid = (high+low)/2;

            if(arr[mid] == n) return mid;
            else if(n>arr[mid])
                low = mid+1;
            else if (n<arr[mid])
                high = mid-1;
            System.out.println(mid);
        }
        return -1;
    }
}
