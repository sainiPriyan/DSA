import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {




        System.out.println(Solution.subarraySum(new int[]{1,2,4,5,6} ,5,11));
    }
}

class Solution {
    // Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

        int sum = 0;

        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> sumList = new LinkedList<>();


        for(int i = 0; i<n;i++){

            if(arr[i] == s){

                list.clear();
                list.add(i+1);
                list.add(i+1);

                return list ;
            }
            else if(arr[i]>s){
                sumList.clear();
                sum = 0;
            }

            else if(arr[i]<s){

                sumList.add(i+1);
                System.out.println("after adding = "+sumList);
                sum += arr[i];
                System.out.println("+Sum = "+sum);

                while (sum > s){

                    sum -= arr[sumList.get(0) - 1 ];
                    System.out.println("-Sum= "+sum);

                    sumList.remove(0);
                    System.out.println("after removing = "+sumList);
                }
                if(sum == s){

                    list.add(0,sumList.getFirst());
                    list.add(1,sumList.getLast());

                    return list ;
                }

            }

        }
        list.add(0,-1);

        return list;
    }
}
