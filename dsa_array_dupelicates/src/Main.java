import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Solution.duplicates(new int[]{1,3,2,3,1}));
    }

}
class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {

      Arrays.sort(arr);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
for (int j = 0; j< arr.length;j++) {

    for (int i = j+1; i < arr.length; i++) {

        if ((arr[j] - arr[i]) == 0) {

            list.remove(Integer.valueOf(-1));
            list.add(arr[i]);
        }
    }
}
        return list;
    }


}