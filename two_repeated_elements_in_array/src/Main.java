import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoRepeated(3, new int[]{2, 1, 3, 2, 1 })));
    }
    public static int[] twoRepeated(int n, int[] arr) {

        int[] ans = new int[2];

        int[] tempArr = arr.clone();

        int temp;

        for(int i = 0; i < n+2; i++){

            if(arr[i] == (i+1)) {
//                System.out.println("skip");
                continue;
            }

            if(arr[i] == arr[arr[i]-1]) {
//                System.out.println("True "+ arr[i]);

                if(ans[0] == 0) ans[0] = arr[i];
                else {
                    if(ans[0] != arr[i])
                      ans[1] = arr[i];
                }
                continue;
            }

//            if(arr[arr[i]-1] == arr[arr[arr[i]-1]-1]) {
//                if(ans[0] == 0) ans[0] = arr[arr[i]-1];
//                else ans[1] = arr[arr[i]-1];}


            temp = arr[i];
            arr[i] = arr[temp-1];
            arr[temp-1] = temp;

            if(arr[i] == arr[arr[i]-1]) {
//                System.out.println("True "+ arr[i]);
                if(ans[0] == 0) ans[0] = arr[i];
                else {
                    if(ans[0] != arr[i])
                        ans[1] = arr[i];
                }
                continue;
            }

            System.out.println(i+1);
            System.out.println(Arrays.toString(arr));
            System.out.println();
        }

        System.out.println(Arrays.toString(tempArr));

        for (int j = 0;j<n+2;j++){

             if (tempArr[j] == ans[1]){

                int temp2 = ans[0];
                ans[0] = ans[1];
                ans[1] = temp2;

                return ans;
            }

            if(tempArr[j] == ans[0]){
                return ans;
            }
        }
        return ans;
    }
}
