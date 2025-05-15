import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(longestSubArrayWith1s0s(new int[]{1, 0, 0, 1, 0, 1, 1}));
    }

    public static int longestSubArrayWith1s0s(int[] arr){

        for (int i = 0; i < arr.length; i++)
            if(arr[i] == 0)
                arr[i] = -1;

        return longestSubArray(arr,0);
    }

    public static int longestSubArray(int[] arr, int x){

        HashMap<Integer, Integer> hash = new HashMap<>();
        int sum = 0, length = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if(sum==x)
                length = i+1;

            if(!hash.containsKey(sum))
                hash.put(sum,i);

            //hash.put(sum, Math.min(i,hash.getOrDefault(sum,Integer.MAX_VALUE)));

            if(hash.containsKey(sum-x)){
                length = Math.max(length,(i-hash.get(sum-x)));
            }

        }

        return length;
    }
}
