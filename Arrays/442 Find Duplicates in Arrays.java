class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        Arrays.sort(nums);

        int i=0,j=1;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]==nums[j]){
                arr.add(nums[i]);
            }
            j++;
        }
        return arr;
    }
}
