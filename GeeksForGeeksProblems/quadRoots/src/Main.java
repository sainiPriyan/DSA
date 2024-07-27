import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.quadraticRoots(752,904,164));
    }
}
class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {

        ArrayList<Integer> list = new  ArrayList<>();

        if(b*b < 4*a*c){ System.out.print("Imaginary");
            return list;
        }
        else {
            double d = Math.sqrt(b * b - 4 * a * c);

            int x = (int) Math.floor((-b+ d)/(2*a));
            int y =(int) Math.floor((-b- d)/(2*a));

            list.add(Math.max(x,y));
            list.add(Math.min(x,y));

            return list;
        }
    }
}