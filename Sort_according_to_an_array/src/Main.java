import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortA1ByA2(new int[]{2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8}, 11, new int[]{2, 1, 8, 3}, 4)));

    }
    public static int[] sortA1ByA2(int[] a1, int n, int[] a2, int m){


        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i = 0; i<m;i++)
            hash.put(a2[i],i);

        Integer[] arr= new Integer[n];

        for(int i = 0 ; i< n;i++)
            arr[i] = a1[i];

        Arrays.sort(arr,(a, b)->{

            boolean aInA2 = hash.containsKey(a);
            boolean bInA2 = hash.containsKey(b);

            if (aInA2 && bInA2) {
                return hash.get(a) - hash.get(b);
            } else if (aInA2) {
                return -1;
            } else if (bInA2) {
                return 1;
            } else {
                return a - b;
            }

        });
        for(int i = 0 ; i< n;i++)
            a1[i] = arr[i];

        return a1;
    }
}
