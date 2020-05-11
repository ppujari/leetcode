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
                if ( product > max)
                    max = product;
            }
        }
        return max == Integer.MIN_VALUE ? -1 : max;
    }
}
