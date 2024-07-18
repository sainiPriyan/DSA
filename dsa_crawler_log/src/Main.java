public class Main {
    public static void main(String[] args) {
        System.out.println("-> "+Solution.minOperations(new String[]{"d1/","../","../","../"}));
    }
}
class Solution {
    public static int minOperations(String[] logs) {
        int counter = 0;

        for (String log : logs) {
            if (log.equals("../")) {
                counter--;
                counter = Math.max(counter,0);
            }
           else if (log.equals("./")) continue;

             else counter++;
            System.out.println(counter);
        }
            return counter;
    }
}