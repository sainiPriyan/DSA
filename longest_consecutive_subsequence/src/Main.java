import java.util.HashSet;

public class Main {
    public static void main(String[] main){
        System.out.println(longestSub(new int[]{1,3,4,3,3,2,9,10}));
    }
    public static int longestSub(int[] arr){

        HashSet<Integer> hash = new HashSet<>();
        for(int i: arr)
            hash.add(i);

        int res = 0;

        for (Integer i : hash) {
            if(!hash.contains(i-1)){
                int curr = 1;

                while(hash.contains(i+curr))
                    curr++;

                res = Math.max(curr,res);
            }
        }
        return res;
    }
}
