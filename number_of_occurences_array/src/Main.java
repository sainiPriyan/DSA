public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfOccurrences(new int[]{1,2,2,2,2,3,4,5},6));

    }
    public static int numberOfOccurrences(int[] arr, int x){
        if(lastOccurrence(arr, x) == -1) return 0;
        return lastOccurrence(arr,x) - firstOccurrence(arr,x)+1;

    }
    public static int firstOccurrence(int[] arr, int n){
        int high = arr.length-1,low = 0, mid;

        while(low<=high){
            mid = (high+low)/2;
            if(n>arr[mid])
                low = mid+1;
            else if (n<arr[mid])
                high = mid-1;
            else{
                if(mid ==0 || arr[mid-1] != arr[mid])  return mid;
                else high = mid-1;
            }
        }
        return -1;
    }
    public static int lastOccurrence(int[] arr, int n){

        int high = arr.length-1,low = 0, mid;

        while(low<=high){
            mid = (high+low)/2;
            if(n>arr[mid])
                low = mid+1;
            else if (n<arr[mid])
                high = mid-1;
            else{
                if(mid == arr.length-1 || arr[mid+1] != arr[mid])  return mid;
                else low = mid+1;
            }
        }
        return -1;
    }
}
