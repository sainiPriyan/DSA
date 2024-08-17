public class Main {
    public static void main(String[] args) {
        System.out.println("Index of second largest - "+secondLargest(new int[]{4,3,2}));

    }
    public static int secondLargest(int[] arr){

        int largest =0,secondLargest=-1;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]>arr[largest]){

                secondLargest = largest;
                largest=i;
            }
            if(arr[i] != arr[largest] && (secondLargest==-1||arr[i] > arr[secondLargest])){
                secondLargest=i;
            }
        }
        return secondLargest;
    }
}
