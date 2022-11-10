import java.util.Arrays;

public class BruteForceSolutionTwoSum {
    public static void main(String[] args) {

        int[] numbers = {2,7,11,15};
        int target =9;

        System.out.println(Arrays.toString(twoSum(numbers, target)));
        System.out.println(Arrays.toString(twoSum2(numbers, target)));

    }

    public static int[] twoSum(int[] numbers, int target){ //will return values of the array
        int[] result=new int[2];

        for (int i = 0; i < numbers.length; i++) {   //O(n)
            for (int j = 1; j < numbers.length; j++) { //O(n)
                if(numbers[i]+numbers[j]==target){
                    result[0]=numbers[i];
                    result[1]=numbers[j];
                }
            }
        }
        return result;
    }

    public static int[] twoSum2(int[] numbers, int target){ //will return index of the elements
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if(numbers[i]+numbers[j]==target) return new int[]{i, j};
            }

        }
        return new int[]{};
    }

}
