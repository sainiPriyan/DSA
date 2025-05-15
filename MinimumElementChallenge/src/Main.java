import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

    int[] array = readIntegers();

        System.out.println(Arrays.toString(array));

        System.out.println("-".repeat(40));

        System.out.println("The smallest value is: "+findMin(array));

    }

    private static int[] readIntegers(){
        System.out.println("Enter an array of integers separated by commas");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for(int i = 0; i< splits.length;i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for(int i = 1; i< array.length;i++){
            if (array[i] < min)
                min = array[i];
        }
    return min;
    }




}
