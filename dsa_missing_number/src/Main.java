import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        Solution s = new Solution();
        System.out.println(s.missingNumber(5,new int[] {3,2,1,5}));
    }
}
class Solution {
    int missingNumber(int n, int arr[]) {

        Arrays.sort(arr);


        for (int i = 1; i < n ; i++) {

            if (arr[i - 1] != i) {

                return i;
            }


        }
        return n;

    }
}