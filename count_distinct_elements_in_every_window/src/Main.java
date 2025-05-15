import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] main){
        System.out.println(countDistinctElement(new int[]{10,20,20,10,30,40,10},4));
    }

    public static ArrayList<Integer> countDistinctElement(int[] arr, int k){
        HashMap<Integer,Integer> hash = new HashMap<>();

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0;i<k;i++)
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);

        ans.add(hash.size());

        for (int i = k;i<arr.length;i++){
            hash.put(arr[i-k],hash.get(arr[i-k])-1);
            if (hash.get(arr[i-k]) == 0) hash.remove(arr[i-k]);
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
            ans.add(hash.size());
        }
        return ans;
    }
}
