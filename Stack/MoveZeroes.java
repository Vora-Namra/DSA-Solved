class moveZeroes {
    public void moveZeroes(int[] nums) {
     int nonZeroIndex = 0;  

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Move the non-zero element to the front at nonZeroIndex position
                nums[nonZeroIndex] = nums[i];
                if (nonZeroIndex != i) {
                    nums[i] = 0;  // Set the current index to zero
                }
                nonZeroIndex++;  
            }
}
}
}