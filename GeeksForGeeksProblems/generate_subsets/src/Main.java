public class Main {

    public static void main(String[] args){

        generateSubsets("ABCD",0,"");

    }

    public static void generateSubsets(String s, int index, String cur){
        if (index == s.length()) {
            System.out.println(cur);
            return;
        }

        generateSubsets(s,index+1,cur);

        cur =  cur.concat(String.valueOf(s.charAt(index)));

        generateSubsets(s,index+1,cur);



    }

}
