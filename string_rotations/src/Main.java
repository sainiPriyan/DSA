public class Main {
    public static void main(String[] args) {
        System.out.println(areRotations("geeksforgeeks","forgeeksgeeks"));
    }
    public static boolean areRotations(String s1, String s2) {

        s2 = s2+s2;
        System.out.println(s2);
        System.out.println(s1);

        int j = 0;

        for(int i = 0; i<s2.length(); i++){

            System.out.print(s2.charAt(i)+" "+s1.charAt(j)+" " );

            if(s2.charAt(i) == s1.charAt(j)){
                j++;
                if(j == s1.length()-1) return true;
            }

            else{
                if(j>0) i--;
                j = 0;
               }
            System.out.println(j);
        }


        return false;
    }


}
