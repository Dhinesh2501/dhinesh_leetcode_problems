class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        int[] right = new int[n];

        // Suffix Minimum
        right[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < right[i + 1]) {
                right[i] = nums[i];
            } else {
                right[i] = right[i + 1];
            }
        }

        // Prefix Maximum
        int left = nums[0];

        for (int i = 0; i < n; i++) {

            if (nums[i] > left) {
                left = nums[i];
            }

            if (left - right[i] <= k) {
                return i;
            }
        }

        return -1;
    }
}