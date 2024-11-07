import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println(subArraySum(new int[]{2,0},2,0));

    }
    public static ArrayList<Integer> subArraySum(int[] arr, int n, int s) {

        ArrayList<Integer> ans = new ArrayList<>();

        int start = 0, current , sum =0;

        if (s == 0) {
            for (int i=0;i<n;i++) {
                if(arr[i] == 0){
                    ans.add(i+1);
                    ans.add(i+1);
                    return ans;
                }
            }
        }


        for(int i = 0; i < n; i++){

//            if(arr[i] == s){
//                ans.add(i+1);
//                ans.add(i+1);
//                return ans;
//            }

            sum += arr[i];
            current = i;

            while(sum > s){
                sum -= arr[start];
                start++;
            }
            if(sum == s){
                ans.add(start+1);
                ans.add(current+1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
}
