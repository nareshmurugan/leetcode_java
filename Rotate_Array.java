/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

 

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 

Follow up:

Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
Could you do it in-place with O(1) extra space?
 */
// public class Rotate_Array {
//     public static void main(String[] args) {
//         rotate(new int[]{1,2,3,4,5,6,7},3);
//     }
//     public static void rotate(int[] nums, int k) {
//         reverse(nums,0,k-1);
//         reverse(nums,k,nums.length-1);
//         reverse(nums,0,nums.length-1);
//     }
//     public static void reverse(int []ar,int l,int r){
//         while(l<r){
//             int t=ar[r];
//             ar[r]=ar[l];
//             ar[l]=t;
//         }
//     }
// }
import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7},3);
    }
    public static void rotate(int[] nums, int k) {
        k%=nums.length;
        if(k<1)return;
        int[]a=Arrays.copyOfRange(nums,0,nums.length-k);
        int[]b=Arrays.copyOfRange(nums,nums.length-k,nums.length);
        System.arraycopy(b, 0, nums, 0, b.length);
        System.arraycopy(a, 0, nums, b.length, a.length);
    }
}