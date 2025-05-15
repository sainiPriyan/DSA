public class Main {
    public static void main(String[] args){
        patternSearch("auagudgddeeddff","ddee");
    }
    public static void patternSearch(String str,String pattern){
        for (int i = 0; i <= str.length()-pattern.length(); i++) {
            int j;
            for (j =0; j < pattern.length(); j++)
                if(str.charAt(i+j)!=pattern.charAt(j))
                    break;
            if (j == pattern.length())
                System.out.println(i+" ");
        }
    }

}
