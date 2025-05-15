import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        System.out.println(longestSubArray(new int[]{8,3,1,5,-6,6,2,2},4));
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
