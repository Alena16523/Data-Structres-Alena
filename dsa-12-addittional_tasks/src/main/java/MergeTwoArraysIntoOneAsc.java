import java.util.Arrays;

public class MergeTwoArraysIntoOneAsc {
    public static void main(String[] args) {

//       int[] nums1 ={1,2,3,0,0,0};
//       int m = 3;
//       int[] nums2 ={2,5,6};
//       int n = 3;

//        int[] nums1 ={1};
//        int m = 1;
//        int[] nums2 ={0};
//        int n = 0;

        int[] nums1 ={0};
        int m = 0;
        int[] nums2 ={1};
        int n = 1;

        System.out.println(Arrays.toString(mergeTwoArrays(nums1, nums2, m, n)));
    }

    public static int[] mergeTwoArrays(int[] num1, int[] num2, int m, int n){

        //merge 2 arrays
        for (int i = m; i < num1.length; i++) {  // O(n)
            num1[i]=num2[n];       //O(1) because it has an address
            n++;
        }
        //return in ascending order
        return num1=Arrays.stream(num1).sorted().toArray();  // O(n)
    }

}
