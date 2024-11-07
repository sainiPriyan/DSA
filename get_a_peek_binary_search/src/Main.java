public class Main {
    public static void main(String[] args) {
        System.out.println(getAPeak(new int[]{5,20,30,20,50,60}));

    }
    public static int getAPeak(int[] arr){
        int low = 0, high = arr.length;

        while (low<=high){
            int mid = (low+high)/2;
            if((mid ==0 || arr[mid-1]<= arr[mid])&&
                    (mid == arr.length-1 || arr[mid+1]<= arr[mid]))
                return mid;
            if(mid > 0 && arr[mid-1]>= arr[mid])
                high = mid -1;
            else low= mid+1;
        }
        return -1;
    }
}
