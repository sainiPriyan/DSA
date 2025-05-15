import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){

        System.out.println(subArrayWithZeroSum(new int[]{4, 2, -3, 1, 6}));
        System.out.println(subArrayWithZeroSum(new int[]{-3, 2, 3, 1, 6}));
        System.out.println("==============================================");
        //System.out.println(countSubArrayWithZeroSum(new int[]{6, -1, -3, 4, -2, 2, 4, 6, -12, -7}));
        System.out.println(countSubArrayWithZeroSum(new int[]{0,0, 0, 5, 5, 0, 0}));


    }
    public static boolean subArrayWithZeroSum(int[] arr){
        int sum = 0;
        HashSet<Integer> hash = new HashSet<>();

        for(int i: arr){
            sum+= i;

            if(hash.contains(sum) || sum==0 )
                return true;

            hash.add(sum);
        }
        return false;
    }
    public static int countSubArrayWithZeroSum(int[] arr){
        int sum = 0,count= 0;
        HashMap<Integer,Integer> hash = new HashMap<>();

        for (int j : arr) {

            if(j == 0 && !hash.containsKey(0)){
                hash.put(0,1);
            }

            sum += j;

            if (hash.containsKey(sum) || sum == 0) {
                count += hash.get(sum);
//                System.out.println(hash.get(sum));
            }
            hash.put(sum, hash.getOrDefault(sum, 0) + 1);
           // System.out.println(count);
        }
        return count;
    }

}
