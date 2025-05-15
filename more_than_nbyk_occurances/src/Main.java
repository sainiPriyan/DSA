import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        nBykOccurrences(new int[]{10,20,30,10,10,20},3);
    }
    public static void nBykOccurrences(int[]arr,int k){
        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i: arr)
            hash.put(i,hash.getOrDefault(i,0)+1);

        for(Map.Entry<Integer, Integer> h: hash.entrySet())
            if(h.getValue() > arr.length/k)
                System.out.println(h.getKey()+" ");
    }
}
