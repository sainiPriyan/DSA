public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("true"));

    }

    public static boolean isPalindrome (String s){

        if(s.length() == 1 || s.length() ==0) return true;

        if(s.charAt(0) != s.charAt(s.length()-1)) return false;

        String s1 = s.substring(1,s.length()-1);

        return isPalindrome(s1);
    }
}
