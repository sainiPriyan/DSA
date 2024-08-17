public class Main {
    public static void main(String[] args) {
        frequencyOfEachElement(new int[]{40,50,50,50});

    }
    public static void frequencyOfEachElement(int[] arr){
        int frequency = 1;
        for (int i = 1; i < arr.length; i++) {

            if(arr[i]==arr[i-1]){
                frequency++;
            }
            else {
                System.out.println(arr[i-1]+": "+frequency);
                frequency = 1;
            }
            if(i== arr.length-1){
                System.out.println(arr[i]+": "+frequency);
            }
        }
    }
}
