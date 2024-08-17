public class Main {
    public static void main(String[] args) {

        towerOfHanoi(3,'a','b','c');
    }

    public static void towerOfHanoi(int n, char a, char b,char c){
        if(n==1){
            System.out.println("1-> "+a+" to "+c);
            return;
        }

        towerOfHanoi(n-1,a,c,b);
        System.out.println(n+" -> "+a+" to "+c);
        towerOfHanoi(n-1,b,a,c);
    }
}
