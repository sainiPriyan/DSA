public class Main {
    public static void main(String[] args) {
        System.out.println(modified("aabbbcccccdddddddddd"));
    }
    public static long modified(String a) {

        int count = 1, ans = 0;

        for(int i = 1; i<a.length();i++){
            if(a.charAt(i) ==  a.charAt(i-1))
                count++;

            else{
                if(count>=3) ans+= (Math.ceil((double) count /2) - 1);
                count = 1;}

        }
        if(count>=3) ans+= (Math.ceil((double) count /2) - 1);

        return ans;
    }
}
