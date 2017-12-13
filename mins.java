public int[] mins(int[][] nums) {
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        int min = nums[i][0];
        for(int j = 0; j < nums[i].length; j++) {
            if (nums[i][j] < min) {
                min = nums[i][j];
            }
        }
        result[i] = min;
    }
    return result;
}