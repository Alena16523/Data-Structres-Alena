

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurences {

    public static void main(String[] args) {

        //Given an array of integers arr,
        // return true if the number of occurrences of each value in the array is unique or false otherwise.

        int[] arr={1,2,2,1,1,3};
        System.out.println(countNumberOfOccurences(arr));

//        int[] arr={1,2};
//        System.out.println(countNumberOfOccurences(arr));
    }

    public static boolean countNumberOfOccurences(int[] arr){
        //In a case where there are duplicate keys, the last one will override the other(s) in HashMap
        Map<Integer, Integer> count=new HashMap<>();
        int counter=0;

        for(int i=0; i< arr.length; i++){   // O(n^2)
            for(int j=0; j<arr.length; j++){
                if(arr[i]==arr[j]) counter++;
            }
            //add as key original element, and as value - times it appeared.
            count.put(arr[i], counter);
            counter=0;
        }
        // Store the frequency count of elements in the unordered set.
        Set<Integer> freqSet = new HashSet<>(count.values());

        // If the set size is equal to the map size, It implies frequency counts are unique.
        return count.size() == freqSet.size();
    }


}
