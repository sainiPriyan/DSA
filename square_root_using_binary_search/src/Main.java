public class Main {
    public static void main(String[] args) {
        System.out.println(squareRoot(48));

    }
    public static int squareRoot(int x){
        int low = 1, high = x, ans = -1;

        while (low<=high){
            int mid = (low+high)/2, midSqr = mid*mid;

            if(midSqr == x) return mid;
            else if (midSqr > x)  high=mid-1;
            else {
                low = mid+1;
                ans = mid;
            }
        }
        return ans;
    }

}
