public class Main {
    public static void main(String[] args) {

    }
    static int[][] sumMatrix(int A[][], int B[][])
    {
        int n = Math.max(A.length,B.length),m=Math.max(A[0].length,B[0].length)
                ,a = Math.min(A.length,B.length),b=Math.min(A[0].length,B[0].length);

        int[][] sum = new int[n][m];

        for(int i = 0; i<a;i++){
            for(int j = 0; j<b; j++){
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        
    return sum;
    }
}
