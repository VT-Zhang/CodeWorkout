public boolean evenlySpaced(int a, int b, int c)
{
    int[] nums = {a, b, c};
    int temp;
    for (int i = 0; i < nums.length; i++) {
        for (int j = i; j > 0; j--) {
            if (nums[j] < nums[j-1]){
                temp = nums[j];
                nums[j] = nums[j-1];
                nums[j-1] = temp;
            }
        }
    }
    if ((nums[2] - nums[1]) == (nums[1] - nums[0])) {
        return true;
    }
    else return false;
}