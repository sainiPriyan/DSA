import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[]{-5,7,-9,1,-4,3};
        segregatePositiveNegative(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void segregateOddEven(int[] arr){
        int firstEven = -1;

        for (int i = 0; i < arr.length; i++) {

            if(firstEven == -1 ){
                if(arr[i] % 2 != 0) continue;
                else firstEven = i;
            }

            if(arr[i] % 2 != 0){
                int temp = arr[i];
                arr[i] = arr[firstEven];
                arr[firstEven] = temp;

                firstEven++;
            }
        }
    }

    public static void segregatePositiveNegative(int[] arr){
        int i = -1, j = arr.length;

        while(true){
            do{i++;
            }while (arr[i]<0);
            do{j--;}
            while (arr[j]>=0);

            if(i>=j) return;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }


}
