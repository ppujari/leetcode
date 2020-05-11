# leetcode 152. Maximum Product Subarray

Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.

Example 1:

Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.


class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        if ( nums.length == 1)
            return nums[0];
        for ( int i = 0; i < nums.length; i++){
            int product = nums[i];
            if ( product > max)
                max = product;
            for ( int j = i+1; j < nums.length; j++){
                product *= nums[j];
//                System.out.println(product);
                if ( product > max)
                    max = product;
            }
        }
        return max == Integer.MIN_VALUE ? -1 : max;
    }
}

### Solution

Approach 1: Brute force approach is to split the array into all possible subarrays. Compute product of elements in each subarray and find the maximum product value. Note that array contains both positive and negative integers, and also multiplying a negative product value with a next negative array element becomes positive.



### Complexity Analysis

Time complexity: n requires O(n^2)O(n^2)


Space complexity: O(1) 
We only need constant memory to store few local variables, so the space complexity is O(1)O(1).
