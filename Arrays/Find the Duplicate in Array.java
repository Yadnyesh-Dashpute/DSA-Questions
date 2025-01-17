class Solution {
    public int findDuplicate(int[] nums) {

        // int slow = nums[0];
        // int fast = nums[0];

        // do{
        //     slow = nums[slow];
        //     fast = nums[nums[fast]];
        // }while(slow != fast);

        // slow = nums[0];

        // while(slow != fast){
        //     slow = nums[slow];
        //     fast = nums[fast];
        // }

        // return slow;
        // }

        boolean[] arr = new boolean[nums.length];

        int dup = nums[0];

        for(int i: nums){
            if(arr[i]){
                dup = i;
                break;
            }
            arr[i] = true;
        }
    return dup;
    }
}
