public class Main {
    public static void main(String[] args) {
        System.out.println(firstOccurrence(new int[]{0,1,1,1,1,1,1,2,3,4,4,4,4,4,4,4,4,4,4,4},4));

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
}
