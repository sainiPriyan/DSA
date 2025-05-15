import java.util.ArrayDeque;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int ans = largestRectangleWithAll1sMatrix(new int[][]{  {1,0,0,1,1},
                                                                {0,0,0,1,1},
                                                                {1,1,1,1,1},
                                                                {0,1,1,1,1}
        });
        System.out.println(ans);
    }
    public static int largestRectangleWithAll1sMatrix(int[][] mat){
        int [] histogram = new int[mat[0].length];
        int ans = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] != 0 )
                    histogram[j] = histogram[j] + 1;
                else
                    histogram[j] = 0;
            }

            System.out.println(Arrays.toString(histogram));

            ans = Math.max(ans, getMaxArea(histogram));
        }

        return ans;
    }

    public static int getMaxArea(int arr[]) {
        
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(0);
        int cur = arr[0];

        for(int i = 1; i<arr.length;i++){

            while(!stack.isEmpty() && arr[i] < arr[stack.peek()]){

                int x = arr[stack.pop()];
                int j = i;
                if(!stack.isEmpty()) j = i-stack.peek()-1;
                cur = Math.max(cur, x*j);
            }
            stack.push(i);
        }

        while(!stack.isEmpty()){

            int x = arr[stack.pop()];

            int j = arr.length;
            if(!stack.isEmpty()) j = arr.length - stack.peek() -1;

            cur = Math.max(cur, x*j);
        }
        return cur;
    }

}
