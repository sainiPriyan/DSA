public class Main {
    public static void main(String[] args) {

        System.out.println("Answer = "+searchInSortedRotated(new int[]{6,7,8,9,1,2,3,4,5},8));

    }
    public static int searchInSortedRotated(int[] arr, int n){

        int low = 0, high = arr.length-1, mid ;

        while(low<=high){

            mid = (high+low)/2;

            if(arr[mid] == n) return mid;

            if(arr[low]<= arr[mid] ){

                if(n >=arr[low] && n< arr[mid])
                    high = mid-1;
                else
                    low = mid+1;
            }
            else {
                if(n > arr[mid] && n<= arr[high])
                    low = mid-1;
                else high = mid-1;
            }
        }
        return -1;
    }
}
