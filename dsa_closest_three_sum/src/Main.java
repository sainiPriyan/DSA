public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.threeSumClosest(new int[]{-72, -66, 100, -38, -43, 50, 7 ,7},99));

    }
}
class Solution {
    static int threeSumClosest(int[] array, int target) {

        int length = array.length;
        int sum = 0;
        int diff= Math.abs(Integer.MAX_VALUE);
        int result = 0;

        for(int i = 0; i<length-2; i++){

            for(int j = i+1; j<length-1;j++){

                for(int k = j+1;k<length;k++){

                    sum = (array[i]+array[j]+array[k]);
                    System.out.println(array[i]+" + "+array[j]+" + "+array[k]+" = "+sum);


                    if((target - sum) == 0) return sum;

                    int newDiff = Math.abs(target - sum);
                    int oldDiff = Math.abs(diff);

                    if( newDiff < oldDiff){
                        diff = target - sum;
                        result = sum;
                    }
                    else if (newDiff == oldDiff){

                        if(sum>result) result = sum;
                    }


                }
                System.out.println();
            }
            System.out.println();

        }

        return result;



    }
}

