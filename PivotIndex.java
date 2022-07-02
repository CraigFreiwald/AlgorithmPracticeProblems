public class PivotIndex {

    public int pivotIndex(int[] nums) {
        // pivot index is the index in an array where the
        // sum of all numbers left and all numbers right of it are equal, exclusive of itself
        // if there is no such index return -1
        

        // establish placeholders sum and leftsum at 0
        int sum = 0, leftsum = 0;

        // for int x loop through nums[] adding each number to the sum to get total
        for (int x : nums) sum += x;

        // for i loop through nums[] and i++ increment
        for (int i = 0; i < nums.length; i++) {

            // during each iteration check if the previous totaled sum
            // minus the leftsum (starts at 0) minus the current location in nums[]
            // is equal to leftsum
            // if it is return i because that's the answer
            if (leftsum == sum - leftsum - nums[i])
                return i;

            // increase leftsum by number at nums[i] continue for loop
            leftsum += nums[i];
        }

        //fail safe return -1 if no solution exists
        return -1;
    }
}

