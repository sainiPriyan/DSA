import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int[] arr = {10,12,10,15,10,20,12,12};
        System.out.println(sortByFreq(arr));

    }

    public static ArrayList<Integer> sortByFreq(int arr[]) {

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i: arr)
            freq.put(i,freq.getOrDefault(i,0)+1);

        ArrayList<Integer> list =new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            list.add(i,arr[i]);
        }

        Collections.sort(list,(a, b) -> {
            int freqA = freq.get(a);
            int freqB = freq.get(b);

            if(freqA!=freqB)
                return freqB - freqA;

            return a - b;
        });

        return list;
    }
}
