public class Main {
    public static void main(String[] args) {
        System.out.println(largestInArray(new int[]{2,3,4,10,3,2,4}));
    }
    public static int largestInArray(int[] arr){
        int largest = arr[0], index = 0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] > largest) {
               largest = arr[i];
               index = i;
           }
        }
        return index;
    }
}
