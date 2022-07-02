public class PivotIndex {

    public int pivotIndex(int[] nums) {
        // pivot index is the index in an array where the
        // sum of all the numbers left and all numbers right
        // of it are equal, exclusive of itself
        // if there is no such index return -1


        // establish placeholder values
        int sum = 0, leftsum = 0;

        //  get the sum of all ints in the array
        for (int x : nums) sum += x;

        // loop through nums[] by length
        for (int i = 0; i < nums.length; i++) {

            // during each loop iteration,
            // check if the current leftsum is equal to the sum minus the leftsum
            // (starts at 0) minus the current location in nums[]
            // if it is, return i because that's the index of the solution
            if (leftsum == sum - leftsum - nums[i])
                return i;

            // increase leftsum by number at nums[i] continue for loop
            leftsum += nums[i];
        }

        //fail safe return -1 if no solution exists
        return -1;
    }
}

