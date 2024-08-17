public class Main {
    public static void main(String[] args) {
        System.out.println(maxDiff(new int[]{5,5,6,1,2,5}));
    }
    public static int maxDiff(int[] arr){

        int smallest = arr[0], difference=Integer.MIN_VALUE;

        for (int j : arr) {
            smallest = Math.min(smallest, j);
            difference = Math.max(difference, j - smallest);
        }
        return difference;
    }
}
