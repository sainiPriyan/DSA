public class Main {
    public static void main(String[] args) {
        intersection(new int[]{2,3,4},new int[]{2,4,4,5,6});
    }

    public static void intersection(int[] arr1, int[] arr2){
        int i = 0, j = 0, last = Integer.MIN_VALUE + 1;

        while (i<arr1.length && j<arr2.length) {
            if (arr1[i] == arr2[j]) {
                if (last != arr1[i]) {
                    System.out.print(arr1[i] + " ");
                }
                last = arr1[i];
                i++;
                j++;
            } else if (arr1[i] > arr2[j]) j++;
            else i++;
        }
    }
}
