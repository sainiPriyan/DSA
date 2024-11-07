public class Main {
    public static void main(String[] args) {

    }
    public static int repeatingElement(int[] arr){
        for (int i =0;i<arr.length;i++){

            if(arr[i] >= i){
                arr[arr[i]] += i;
            }
        }
    }
}
