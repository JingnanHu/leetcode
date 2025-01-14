import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        int number = 0;
        Map<Integer, Integer> sockMap = new HashMap<>();

        for (int singsock : ar){
            sockMap.put(singsock, sockMap.getOrDefault(singsock, 0)+1);
        }

        for (int pair : sockMap.values()){
            number += pair/2;
        }
        return number;
        // Write your code here



}
}
