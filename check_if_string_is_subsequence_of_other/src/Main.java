public class Main {
    public static void main(String[] args) {
       System.out.println( isSubsequence("ABCDEF","ADE"));
        System.out.println(isSubsequenceRecursive("ABCDEF","ADE",6,3));

    }
    public static boolean isSubsequence(String s1, String s2){
        if(s2.length()>s1.length()) return false;
        int j = 0;
        for(int i = 0; i<s1.length();i++){
            if(s1.charAt(i) == s2.charAt(j)) j++;
            if (j == s2.length()) return true;
        }
        return false;
    }

    public static boolean isSubsequenceRecursive(String s1, String s2, int n, int m){
        if (m == 0) return true;
        if (n == 0) return false;


        if(s1.charAt(n-1) == s2.charAt(m-1))
            return isSubsequenceRecursive(s1,s2,--n,--m);
        else return isSubsequenceRecursive(s1,s2,--n,m);
    }
}
