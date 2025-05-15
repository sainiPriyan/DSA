public class Main {

    public static void main(String[] args) {
        String s1 = "aba",s2 = "abc";

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));

    }

    public static boolean isPalindrome(String s){
        int n = s.length();

        for (int i = 0; i < n/2; i++) {
            if(s.charAt(i) != s.charAt(n-1-i))
                return false;
        }
        return true;
    }
}
