public class Main {
    public static void main(String[] args) {
        System.out.println(consecutiveInts(new int[]{1,0,0,1,1,1,1,0,1}));

    }

    public static int consecutiveInts(int[] arr){

        int counter = 0, ans=0;

        for (int j : arr) {
            if (j == 1) {
                counter++;
                ans = Math.max(counter, ans);
            } else
                counter = 0;

        }
        return  ans;
    }

}
