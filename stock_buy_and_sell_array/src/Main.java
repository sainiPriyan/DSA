public class Main {
    public static void main(String[] args) {

        System.out.println(stockBuyAndSell(new int[] {5,3,1,8,12,7,2,6,9,1}));

    }
    public static int stockBuyAndSell(int[] arr){

       int profit = 0;

        for (int i = 1; i < arr.length; i++) {

            if(arr[i]>arr[i-1])
                profit += arr[i] - arr[i-1];
        }
        return profit;
    }




        // Shit code
//        for(int i = 1;i<arr.length;i++){
//
//            if(arr[i]>arr[i-1]){
//
//                a = lowest;
//                highest = arr[i];
//
//                System.out.println("a "+a);
//
//                if(i== arr.length-1) b = highest;
//            }
//
//            else if(arr[i]<arr[i-1]){
//
//                b = highest;
//                lowest = arr[i];
//
//                if(i== arr.length-1) a = lowest;
//
//                System.out.println("b "+b);
//
//            }
//
//            if(a!=0 && b != 0){
//                profit += b-a;
//                a=0;
//                b=0;
//                highest = 0;
//
//                System.out.println(profit);
//            }
//        }
//        return profit;
//
//    }
}
