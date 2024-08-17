import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDupe(new int[]{10, 20, 20, 20, 30, 30, 30,40,40,50,60,60,60})));
    }
    public static int[] removeDupe(int[] arr){
        int x=0, a= arr[0];

        for (int i = 1; i < arr.length; i++) {

            if(arr[i] == a){
                arr[i] = 0;
            }
            else {
                a=arr[i];
                arr[x+1] = arr[i];

                if(x+1 != i){
                    arr[i] = 0;}

                x++;
            }
        }

        return arr;
    }
}
