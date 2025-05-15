import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }
    static List<List<String>> accountsMerge(List<List<String>> accounts) {

        HashSet<String> hash = new HashSet<>();

        for(int i = 0; i<accounts.size()-1; i++){

            for(int j = 1; j<accounts.get(i).size();j++){
                hash.add(accounts.get(i).get(j));
            }

            for (int k = i+1; k < accounts.size(); k++) {
                if(hash.contains(accounts.get(i+1).get(k))){
                    accounts.get(i).set(0,null);

                    for (int j = 1; j < accounts.get(i+1).size(); j++) {
                        if(!hash.contains(accounts.get(i+1).get(k)))
                            accounts.get(i).add(accounts.get(i+1).get(k));
                    }
                    accounts.get(i+1).set()

                }
            }

        }
    }

}
