class Solution {
   public int findClosestNumber(int[] nums) {
        
            int minValue = Integer.MAX_VALUE;
           
          
                for(int i : nums){

                    if(Math.abs(i) < Math.abs(minValue) ||  i == Math.abs(minValue))

                        minValue = i;     
                
                }

        return  minValue;
   }
         
}
