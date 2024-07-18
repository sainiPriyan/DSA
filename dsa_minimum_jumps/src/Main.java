public class Main {
    public static void main(String[] args) {

        System.out.println(Solution.minJumps(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 },11));
    }

}
class Solution {
    static int minJumps(int[] arr, int n) {

        if(arr[0] == 0) return -1;

        int counter = 0, currentNumber = arr[0],nextNumberIndex = 0,nextNumChange=0, changeIndex;
        int i = 0;

        while(i<n-1){

            for(int j = i+1;j<=currentNumber+i;j++){

                changeIndex  = Math.abs( (arr[j] - arr[i]) - (j - i));
                System.out.println(i+" "+changeIndex);
                System.out.println(nextNumChange);

                if( (arr[j] != 0) && (changeIndex >= nextNumChange) ){

                    nextNumChange = changeIndex;
                    nextNumberIndex = j;
                    System.out.println("current number = "+ arr[j]);

                }

            }


            i = nextNumberIndex;
            counter++;
            nextNumChange = 0;
        }
        return counter;
    }
}