import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] a= {10,30,10}, b = {40,10};
        System.out.println(countDistinctElements(a,b));
    }

    public static int countDistinctElements(int[] a, int[] b){
        HashSet<Integer> hash = new HashSet<>();
        for(int i : a)
            hash.add(i);
        for (int i:b)
            hash.add(i);

        return hash.size();
    }
}
