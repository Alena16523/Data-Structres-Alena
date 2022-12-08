package ExtraTasks;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productArrayBruteForce(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productArray1(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productArray2(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productArray3(new int[]{1, 2, 3, 4})));
    }

    public static int[] productArrayBruteForce(int[] nums) {//   1, 2, 3, 4
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sub = 1;
            for (int j = 0; j < nums.length; j++) {

                if (i != j) {
                    sub *= nums[j];
                }
            }
            result[i] = sub;
        }
        return result;
    }

    public static int[] productArray1(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] res = new int[nums.length];

        left[0]=right[right.length-1]=1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i-1]*nums[i-1];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = right[i+1]*nums[i+1];
        }

        for (int i = 0; i < nums.length; i++) {
            res[i]=right[i]*left[i];
        }

        return res;
    }

    public static int[] productArray2(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] res = new int[nums.length];

        int leftRunning = 1;
        for (int i = 0; i < nums.length; i++) {
            left[i] = leftRunning;
            leftRunning *= nums[i];
        }

        int rightRunning = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            right[i] = rightRunning;
            rightRunning*= nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            res[i]=right[i]*left[i];
        }

        return res;
    }

    public static int[] productArray3(int[] nums) {
        int[] product = new int[nums.length];

        int leftRunningProduct = 1;
        for (int i = 0; i < nums.length; i++) {
          product[i]=leftRunningProduct;
          leftRunningProduct*=nums[i];
        }

        int rightRunningProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
          product[i]*= rightRunningProduct;
          rightRunningProduct*=nums[i];
        }


        return product;
    }
}
