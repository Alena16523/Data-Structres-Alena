import java.util.HashMap;
import java.util.Map;

public class RussianDolls {
    public static void main(String[] args) {

        int[] dolls={1,6,5,9,2};
        System.out.println(remainingNumberOfDolls(dolls));

    }


    public static int remainingNumberOfDolls(int[] dolls){
        Map<Integer, Integer> numberOfDollsBySize = new HashMap<>();
        int max = dolls[0];

        for (int i = 0; i <dolls.length; i++) {
            numberOfDollsBySize.put(dolls[i], numberOfDollsBySize.getOrDefault(dolls[i], 0) + 1);
        }

        for (Integer each: numberOfDollsBySize.values()){
            if(each > max) max = each;
        }
        return max;
    }
}
//how many dolls will be left after fitting smaller dolls into bigger ones.
