public class Main {
    public static void main(String[] args) {
        merge2SortedArrays(new int[]{3,5,6,9,10},new int[]{1,5,7,8,11,12,13});

    }
    public static void merge2SortedArrays(int[] a, int[] b){
        int i = 0, j = 0;

        while(i<a.length && j<b.length) {
                    if (a[i] <= b[j]) {
                        System.out.print(a[i] + " ");
                        i++;
                    } else {
                        System.out.print(b[j] + " ");
                        j++;
                    }
                }
        while(i<a.length) {
            System.out.print(a[i] + " ");
            i++;
        }
        while(j<b.length) {
            System.out.print(b[j] + " ");
            j++;
        }
    }
}
