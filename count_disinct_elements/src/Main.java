import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 1,1,2, 2, 3, 3, 4, 5, 6, 7};
        System.out.println(countDistinctElements(arr));
    }

    public static int countDistinctElements(int[] arr){
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> dupes = new HashSet<>();

        for(int i : arr){
            if(!hashSet.contains(i))
                hashSet.add(i);
            else
                dupes.add(i);
        }
        return hashSet.size()-dupes.size();
    }
}
