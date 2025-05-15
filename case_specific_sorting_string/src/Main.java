import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(caseSort("defRTSersUXI"));

    }
    public static String caseSort(String str){

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < 97)
                count++;
        }

        char[] small = new char[str.length()-count];
        char[] cap = new char[count];

        StringBuilder ans  = new StringBuilder();

        int j = 0, k = 0;

        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) < 97){
                cap[j] = str.charAt(i);
                j++;
            }
            else  {
                small[k] = str.charAt(i);
                k++;
            }
        }
        Arrays.sort(cap);
        Arrays.sort(small);

        j=0;
        k=0;

        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) >= 97){
                ans.append(small[j]);
                j++;
            }

            else{ ans.append(cap[k]);
                k++;
            }

        }
        return ans.toString();
    }
}
