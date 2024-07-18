import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.getPairsCount(new int[]{1, 5, 7, 1},6));
    }

}
class Solution {
    static int getPairsCount(int[] arr, int sum) {

        int counter=0, length = arr.length,num;
        Arrays.sort(arr);

        for(int i =0;i<length;i++){

            num = sum - arr[i];

            if(i >0){
                if(arr[i] == arr[i-1]) {
                    counter++;
                    continue;
                }
            }

            for(int j = i+1; j< length;j++){

                if (arr[j]== num)
                    counter++;
                            }
        }
        return counter;
    }
}

