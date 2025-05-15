import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(areAnagram("silent","listen"));
    }
    public static boolean areAnagram(String s1, String s2){

        if (s1.length()!=s2.length()) return false;

        HashMap<Character, Integer> hash = new HashMap<>();

        for(Character c: s1.toCharArray())
            hash.put(c, hash.getOrDefault(c,0)+1);

        for (Character c: s2.toCharArray()){
            if(!hash.containsKey(c)) return false;
            hash.put(c, hash.get(c)-1);
            if(hash.get(c) == 0) hash.remove(c);
        }

        return (hash.size() == 0);
    }
}
