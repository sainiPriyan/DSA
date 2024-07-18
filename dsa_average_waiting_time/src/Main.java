public class Main {
    public static void main(String[] args) {
//        int[][] customers = new int[][] {{1,2},{2,5},{4,3}};


        System.out.println(Solution.averageWaitingTime(new int[][]{{2,3},{6,3},{7,5},{11,3},{15,2},{18,1}}));
    }
}

class Solution {
    public static double averageWaitingTime(int[][] customers) {

        int cookingTime = 0 ,totalTime ,extraTime =0,t=customers[0][0]+customers[0][1],margin=0, length = customers.length;

        for (int i =0; i<customers.length;i++){

            cookingTime += customers[i][1];

            if(i != length-1 ) {


                if (t > customers[i + 1][0]) {
                    extraTime += t - customers[i + 1][0];
                }
                else if (t < customers[i + 1][0]) {
                    t = customers[i + 1][0];
                }
                t += customers[i + 1][1];
            }
            System.out.println(cookingTime+" "+ extraTime);

        }
        totalTime = cookingTime+extraTime;
        return  (double) totalTime /customers.length;
    }
}