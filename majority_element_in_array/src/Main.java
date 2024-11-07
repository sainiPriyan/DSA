public class Main {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1,2,2,3,2,2,3}));

    }
    public static int majorityElement(int[] arr){

        int res = 0, count =1;

        for (int i = 1; i < arr.length; i++) {
            if(arr[res] == arr[i])count++;
            else count--;

            if (count ==0) {
                res = i;
                count=1;
            }
        }
        count = 0;
        for (int j : arr) {
            if (arr[res] == j)
                count++;
        }
        if(count<=arr.length/2) res = -1;

        return res;
    }

}
