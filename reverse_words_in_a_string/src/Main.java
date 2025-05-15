import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(reverseWords("ie ll"));

    }

    public static String reverseWords(String s){
        s = s.trim();
        char[] arr = s.toCharArray();

        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if(arr[i] == ' ' || i == s.length()-1){

                if(i == s.length()-1) i++;

                for (int k = 0; k < Math.ceil((double) (i -1 - j) /2)  ; k++) {
                    char temp = arr[i-1-k];
                    arr[i-1-k] = arr[j+k];
                    arr[j+k] = temp;
                }
                j = i+1;
            }
        }

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < s.length() /2; i++) {
            char temp = arr[i];
            arr[i] = arr[s.length()-1-i];
            arr[s.length()-1-i] = temp;

        }

        return new String(arr);

    }

}
