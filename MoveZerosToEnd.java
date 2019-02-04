class MoveZerosToEnd {

    public static void moveZerosToEnd(int nums[]) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                k++;
            } else {
                nums[i - k] = nums[i];
                if (k != 0) {
                    nums[i] = 0;
                }
            }
        }
    }

    public static void printArray(int nums[]) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {

            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String args[]) {
        int[] nums = {1, 2, 0, 4, 9, 3, 0, 6, 7, 0, 11, 8, 0, 15};
        printArray(nums);
        moveZerosToEnd(nums);
        printArray(nums);
    }
}
