public class Main {
    public static void main(String[] args) {
        leadersInArray(new int[]{5,4,3,2,1});

    }
    public static void leadersInArray(int[] array){
        System.out.print(array[array.length-1]+" ");

        int greatest = array[array.length-1];

        for (int i = array.length-2;i >= 0; i--) {
            if(array[i]>greatest){
                greatest = array[i];
                System.out.print(array[i]+" ");
            }
        }
    }
}
