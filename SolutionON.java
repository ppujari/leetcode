class Solution {
    public int maxProduct(int[] nums) {
        if ( nums == null || nums.length == 0)
            return -1;
        //keep track of max as we move forward
        int maxSoFor = nums[0];
        int currentMax = nums[0];
        //since we have -ve numbers in array, we need to keep track of min as well
        //because if the next number is also negative, multiplication is +ve
        int currentMin = nums[0];
        //compute max and min for every array element
        for ( int i = 1; i < nums.length; i++){
            int tempMax = currentMax;
            currentMax = Math.max(Math.max(currentMax * nums[i], currentMin * nums[i]), nums[i]);
            
            currentMin = Math.min(Math.min(tempMax * nums[i], currentMin * nums[i]),nums[i]);
        if ( maxSoFor < currentMax)
            maxSoFor = currentMax;

        }
        
        return maxSoFor;
    }
}
