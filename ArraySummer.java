class ArraySummer {

    private static int getSum(int[] nums, int l, int h) {
        if (h - l == 1) {
            return nums[l];
        }
        return getSum(nums, l, (l + h) / 2) + getSum(nums, (l + h) / 2, h);
    }

    private static int getSumOfArray(int[] nums) {
        return getSum(nums, 0, nums.length);
    }

    public static void main(String args[]) {
        int nums[] = {1, 5, 3, 4, 6, 10, 8, 7, 9, 2, 17, 18};
        System.out.println("sum of array is " + getSumOfArray(nums));
    }
}
