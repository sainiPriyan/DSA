import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(leftMost("axcbdxa"));
    }

    public static int leftMost(String s){

        HashMap<Character,Integer> hash = new HashMap<>();

        for (Character c : s.toCharArray())
            hash.put(c,hash.getOrDefault(c,0)+1);

        for(int i = 0; i<s.length();i++)
            if(hash.get(s.charAt(i))>1) return i;

        return -1;
    }
}
