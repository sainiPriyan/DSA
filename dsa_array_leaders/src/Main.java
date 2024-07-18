import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        System.out.println(Solution.leaders(6,new int[] {16,17,4,3,5,2}));
    }

}
class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {


        LinkedList<Integer> list = new LinkedList<>();
        boolean flag = true;


        for (int i = 0; i<n-1; i++){
            for (int j = i+1; j<n; j++){

                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if(flag)list.add(arr[i]);

            flag = true;

        }

        return new ArrayList<Integer>(list);

    }
}
