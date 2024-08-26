public class Main {
    public static void main(String[] args) {

        System.out.println("Answer: "+binarySearch(new int[]{0,1,2,3,4,5,6,7,8,9},7));

        //System.out.println("Recursive Answer: "+ binarySearchRecursive(new int[]{0,1,2,3,4,5,6,7,8,9},90    ,9,0));

    }

    public static int binarySearch(int[] arr, int n){
        int high = arr.length-1,low = 0, mid;

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
    public static int binarySearchRecursive(int[] arr, int n,int high,int low){

        if(low>high) return -1;

        int mid = (high+low)/2;
        if(n == arr[mid]) return mid;
        else if (n>arr[mid]) return binarySearchRecursive(arr,n,high,mid+1);
        else return binarySearchRecursive(arr,n,mid-1,low);

    }



}
