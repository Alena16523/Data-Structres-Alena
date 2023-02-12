import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {

    public static void main(String[] args) {

        int[] candies={2,3,5,1,3};
        int extraCandies=3;

        System.out.println(KidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> KidsWithCandies(int[] candies, int extraCandies){
         //create new list
        List<Boolean> result=new ArrayList<>();
        //going to find max of the array given
        int max= Arrays.stream(candies).max().getAsInt();
        //iterate and compare to max
        for (int candy : candies) {
           result.add(candy+extraCandies>=max);
        }
        //return list
        return  result;
    }



}
