public class Main {
    public static void main(String[] args) {

        MyHash myHash = new MyHash(7);

        myHash.insert(5);
        myHash.insert(3);
        myHash.insert(6);
        myHash.insert(10);
        myHash.insert(11);
        myHash.insert(21);
        myHash.insert(33);

        myHash.print();

        System.out.println(myHash.search(7));
    }
}

class MyHash{
    int n;
    int[] hash;

    int size;

    public MyHash(int n){
        hash = new int [n];
        this.n = n;
        size = 0;

        for (int i = 0; i < n; i++)
            hash[i] = -1;
    }

    public void insert(int x){
        if(hash[x%n] == -1 || hash[x%n] == -2 ){
            hash[x%n] = x;
        }
        else{
            int k = x%n , o = n-1 - x%(n-1);


            while(hash[k  % n ] != -1 && hash[k  % n] != -2){
                  k = (k+o)%n;
                //j++;
            }

            hash[k] = x;
            size++;
        }
        System.out.println("Inserted!");
    }

    public void print() {
        for (int i : hash){
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public int search(int x) {
        if (hash[x % n] == x) {
            return x % n;
        }
        else{
            int k = x%n , o = n-1 - x%(n-1);

            while(hash[k % n] != x){
                k = (k+o)%n;
            }
            return k%n;
        }
    }
}
