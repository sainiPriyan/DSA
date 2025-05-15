import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(commonSubArray(new int[]{0,0,0,0,0,0},new int[]{0,0,0,1,0,1}));
    }
    public static int commonSubArray(int[] arr1, int[] arr2){
        int[] temp = new int[Math.min(arr1.length,arr2.length)];

        for (int i = 0; i <temp.length ; i++)
            temp[i] = arr1[i]-arr2[i];

        HashMap<Integer,Integer> hash = new HashMap<>();
        int preSum = 0,length = 0;

        for (int i = 0; i<temp.length;i++){
            preSum +=temp[i];

            if(preSum == 0)
                length = Math.max(length,i+1);
            else if(!hash.containsKey(preSum))
                hash.put(preSum,i);
            else length = Math.max(length,i-hash.get(preSum));
        }
        return length;
    }
}
