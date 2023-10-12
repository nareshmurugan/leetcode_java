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
[17,18,19,20,21,22,23,24,25,26,27,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16]

 */
public class Rotate_Array_copy {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27};
        rotate(a,2);
        for (int i : a) {
            System.out.println(i);
        }
        
    }
    public static void rotate(int[] nums, int k) {
        k%=nums.length;
        if(k<1)return;
        for (int i = 0; i < nums.length/k; i++) {
            reverse(nums,i*k,nums.length-k,k);
        }
        if(nums.length%k<2)return;
        int s=(nums.length/k)*k;
        k-=(nums.length%k);
        for (int i = s; i < (s-nums.length)/k; i++) {
            reverse(nums,i*k,nums.length-k,k);
        }
        
    }
    public static void reverse(int []ar,int l,int l1,int k){
        System.out.println("ef");
        for (int i = 0; i < k; i++,l++,l1++) {
            int t=ar[l];
            ar[l]=ar[l1];
            ar[l1]=t;
        }
    }
}
