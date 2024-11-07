public class Main {
    public static void main(String[] args) {
        System.out.println("Final Answer = "+trappingRainWater(new int[] {0,2,0,3,0,2,1,0,5,0,2}));

    }

    public static int trappingRainWater(int[] arr){

        int ans = 0, antiWater = 0, pole = 0;

        for (int i = 1; i < arr.length; i++) {

            if(i == arr.length-1){

                ans += Math.min(arr[i],arr[pole])*(i-pole-1);
                System.out.println(ans);
            }

            else if(arr[i]>=arr[pole]){

                ans+= arr[pole]* (i-pole-1);
                System.out.println(ans);

                pole =i;
                System.out.println("pole "+pole);
            }
            else {
                System.out.println("anti " + antiWater);
                antiWater -= arr[i];
            }
        }
        ans += antiWater;
        ans = Math.max(0, ans);

        return  ans;

    }
}
