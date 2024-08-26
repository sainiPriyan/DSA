public class Main {
    public static void main(String[] args) {
        System.out.println(checkRotatedAndSorted(new int[]{3,4,5,1,2,3},6));

    }
    public static boolean checkRotatedAndSorted(int arr[], int num){

        int a=0, d=0;

        for(int i=1;i<num;i++){

            if(arr[i]>arr[i-1]) {
                a++;
                System.out.println("a- "+a);
            }
            else {
                d++;
                System.out.println("d- "+d);
            }
        }

        System.out.println(a-d);
        return a==1||d == 1;

    }
}
