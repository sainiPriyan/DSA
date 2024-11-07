public class Main {
    public static void main(String[] args) {
        minConsecutiveFlips(new int[]{1,1,0,0,0,1,1,1,0,0,1,0});

    }
    public static void minConsecutiveFlips(int[] arr){
        //int count = 0;
        boolean flag = true;

        for (int i = 1; i < arr.length; i++) {

            if(arr[i] != arr[i-1]){
                if(flag) {
                    System.out.print("From "+i);
                   // count++;
                    flag = false;
                }
                else {
                    System.out.println(" to "+(i-1));
                    flag = true;}
            }

            if(i == arr.length-1 && !flag) System.out.println(" to "+(i));

        }
      //  return count;
    }
}
