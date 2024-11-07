public class Main {
    public static void main(String[] args) {
        findRepeating2(new long[]{1,2,3,4,5,6,7,8},8);

    }

    public static void findRepeating(long[] arr, int n) {

        int high = n-1, low = 0,mid ;

        while(high >= low){

            mid = (low+high)/2;

            if(arr[high] == arr[low]){
                System.out.println(arr[low]+" "+(high-low+1));
                return;
            }

            if((mid - low) == (arr[mid] - arr[low]))
                low = mid;

            if((high - mid) == (arr[high] - arr[mid]))
                high = mid;

            if((arr[mid] == arr[mid+1] || mid == n-1) && ( arr[mid] == arr[mid-1] || mid == 0) ){
                if(arr[mid] == arr[low] && arr[mid] != arr[high]) high--;
                else if(arr[mid] != arr[low] && arr[mid] == arr[high]) low++;
                else if(arr[mid] != arr[low] && arr[mid] != arr[high]){
                    low++;
                    high--;
                }

            }
            else if(arr[mid] != arr[mid -1] && (arr[mid] == arr[mid+1] || mid == n-1) )
                low = mid;

            else if(arr[mid]!= arr[mid+1] &&( arr[mid] == arr[mid-1] || mid == 0))
                high = mid;

        }


    }

    public static void findRepeating2(long[] arr, int n) {



        int high = n-1, low = 0,mid;

        long count = n  - (arr[high] - arr[low]) ;

        if(arr[high]- arr[low] == high-low) {
            System.out.println("-1 -1");
            return;
        }

        while(high >= low){

            mid = (low+high)/2;

            if((mid - low) == (arr[mid] - arr[low]))
                low = mid;

            if((high - mid) == (arr[high] - arr[mid]))
                high = mid;

            if(arr[mid] == arr[mid-1] || arr[mid] == arr[mid+1]){
                System.out.println(arr[mid]+" "+count);
                return;
            }
    }
  }
}
