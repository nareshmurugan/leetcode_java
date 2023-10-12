/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-109 <= nums[i] <= 109
 

Follow-up: Could you solve the problem in linear time and in O(1) space?
 */
public class Majority_Element {
    public static void main(String[] args) {
        majorityElement(new int[]{2,2,1,1,1,2,2});
    }
    public static int majorityElement(int[] nums) {
        int e=0,c=0;
        for(int i:nums){
            if(c==0)e=i;
            if(e==i)c++;
            else c--;
        }
        return e;
   }
}
