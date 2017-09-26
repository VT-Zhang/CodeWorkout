public int[] tenRun(int[] nums)
{
    int[] result = new int[nums.length];
    if(nums.length == 0) {
        return result;
    }
    int temp = nums[0];
    boolean runner = false;
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] % 10 == 0) {
            temp = nums[i];
            runner = true;
        }
        if(runner){
            result[i] = temp;
        }
        else {
            result[i] = nums[i];
        }
    }
    return result;      
}