public class Main {
    public static void main(String[] args) {
        System.out.println(findOdd(new int[]{3,3,3,4,4,5,5,5,5}));
    }
    public static int findOdd(int[] arr){
        int ans = 0;
        for (int i : arr) {
            ans = ans ^ i;
        }
        return ans;
    }
}
