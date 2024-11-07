public class Main {
    public static void main(String[] args) {
        union(new int[]{1,2,3,4,4,4}, new int[]{2,3,3,4,5});
    }
    public static void union(int[] arr1, int[] arr2){
        int i = 0, j = 0;

        while (i<arr1.length && j < arr2.length){

            if (i>0 && arr1[i] == arr1[i-1]){
                i++;
                continue;
            }
            if(j>0 && arr2[j-1] == arr2[j]){
                j++;
                continue;
            }

            if(arr1[i] == arr2[j]) {
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }

            else if(arr1[i]<arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
            }

            else{
                System.out.print(arr1[j] + " ");
                j++;
            }

        }
        while(i<arr1.length){
            if(i>0 && arr1[i] != arr1[i-1])
                System.out.print(arr1[i]+" ");
            i++;
        }
        while(j<arr2.length){
            if(j>0 && arr2[j] != arr2[j-1])
                System.out.print(arr2[j]+" ");
            j++;
        }
    }
}

