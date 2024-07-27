public class Main {
    public static void main(String[] args) {
        System.out.println(isKthBitSetAlt(13,3));
    }
    public static boolean isKthBitSet(int n,int k){
        int num = (int) Math.pow(2,k-1);
        return (num & n) == num;
    }
    public static boolean isKthBitSetAlt(int n,int k){
        int num = n>>(k-1);
        return ((num&1)!=0);
    }
}
