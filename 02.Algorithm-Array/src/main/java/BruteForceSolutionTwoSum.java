import java.util.Arrays;

public class BruteForceSolutionTwoSum {
    public static void main(String[] args) {

        int[] numbers = {2,7,11,15};
        int target =9;

        System.out.println(Arrays.toString(twoSum(numbers, target)));

    }

    public static int[] twoSum(int[] numbers, int target){
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

}
