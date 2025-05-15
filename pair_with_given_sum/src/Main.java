import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] arr= {8,3,4,2,5};
        System.out.println(pairWithGivenSum(arr,7));
    }
    public static boolean pairWithGivenSum(int[] arr, int sum){

        HashSet<Integer> hash = new HashSet<>();

        for (int i : arr) {
            if(hash.contains(sum-i)){
                System.out.println(i+","+(sum-i));
                return true;
            }
            else{
                hash.add(i);
            }
        }

        return false;
    }


}
