public class Main {
    public static void main(String[] args) {
        if(!searchingInSortedMatrix(new int[][]{{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}},17))
            System.out.println("Not Found!");

    }

    public static boolean searchingInSortedMatrix(int[][] arr, int x){
        int i = 0, j = arr[0].length-1;

        while(i<arr.length && j>=0){
            if(arr[i][j] == x){
                System.out.println("Element found at: ("+i+","+j+")");
                return true;
            }
            else if (arr[i][j] > x) j--;
            else i++;
        }
        return false;
    }
}
