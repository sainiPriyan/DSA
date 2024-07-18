public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.maxSquare(6,5,new int[][]{
                {0, 1, 1, 0, 1},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0}}
                ));

    }
}
class Solution {
    static int maxSquare(int n, int m, int mat[][]) {

        int[] and= new int[m];
        int cons,cons2,pos,pos2,ans =0;



   for(int j =0;j<n-1;j++) {

      cons = consecutiveOnes(mat[j],m)[0];
      pos = consecutiveOnes(mat[j],m)[1];

       for (int i = j+1; i < cons+j; i++) {

           if(i <= n) {

               cons2 = consecutiveOnes(mat[i],m)[0];
               pos2 = consecutiveOnes(mat[i],m)[1];

               if(cons2 >= cons){

                  if(  Math.abs(cons - cons2) >= Math.abs(pos - pos2)) {
                      ans = Math.abs(cons - cons2);

                      System.out.println(ans);

                      if(ans < cons) break;
                  }
               }


           }
       }

   //System.out.println(ans);
   }

return ans;
    }
public static int[] consecutiveOnes(int arr[],int m){
    int [] res = new int[2];

    int ans=0,n=0,pos=-1,posA=0;

    for (int i = 0; i< m;i++){

        if (arr[i] == 1 ){
            n++;

            if(pos == -1) pos = i;

            if (n>ans){
                ans = n;
                posA =pos;
            }
        }

        else{ n = 0;
        pos =-1;
            }
    }
    res[0]= ans;
    res[1]=posA;
    return res;
}
}
