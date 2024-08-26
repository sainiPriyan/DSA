public class Main {
    public static void main(String[] args) {
        System.out.println(lastOccurrence(new int[]{0,1,1,1,1,1,1,2,3,4,4,4,4,4,4,4,6,7,8,9},4));
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
