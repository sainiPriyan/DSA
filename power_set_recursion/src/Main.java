import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(powerSet("abc"));

    }
    public static ArrayList<String> powerSet(String s){

        return powerSet(s,"",new ArrayList<>(),0);
    }
    public static ArrayList<String> powerSet(String s,String x, ArrayList<String> list, int n){

        if(n==s.length()){
            list.add(x);
            return list;
        }

            powerSet(s, x, list, n+1);
            x = x.concat(String.valueOf(s.charAt(n)));
            powerSet(s, x, list, n+1);


            return list;
    }
}
