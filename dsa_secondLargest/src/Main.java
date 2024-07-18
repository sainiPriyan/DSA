import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(5);
        list.add(10);
//        list.add(10);
//        list.add(34);
//        list.add(1);

        Solution solution = new Solution();
        System.out.println( solution.print2largest(list));
    }
}
class Solution {
    public int print2largest(List<Integer> arr) {
        int largest,sLargest;

        ArrayList<Integer> list = (ArrayList<Integer>) arr;

        if (arr.size() <2){ return -1;}
        if(arr.get(0)>list.get(1)){
            largest = list.get(0);
            sLargest = list.get(1);
        }

        else {
            largest = list.get(1);
            sLargest = list.get(0);
        }
        System.out.println(largest+" "+ sLargest);

        for (int i = 2; i < list.size();i++){

            if(list.get(i)>sLargest){

                if(list.get(i)>largest){
                    sLargest = largest;
                    largest = list.get(i);
                }
                else if(list.get(i)==largest) continue;


                else {
                    sLargest = list.get(i);
                }
                System.out.println(largest+" "+ sLargest);

            }

        }
        if (sLargest == largest) return -1;
        return sLargest;

    }
}
