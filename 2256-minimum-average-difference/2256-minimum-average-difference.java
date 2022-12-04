class Solution {
    public int minimumAverageDifference(int[] nums) {
        int index = -1;
        int len = nums.length;
        long[] prefix = new long[len];
        
        prefix[0] = nums[0];
        
        for(int i = 1 ; i < len ; i++){
            prefix[i] = nums[i] + prefix[i-1];
        }
        
        int value = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < len ; i++){
            
            int avg1 =(int)( prefix[i] / (i+1) );
            long avg2 = 0 ;
            
            if(i!=len-1)
                avg2 =(int) ((prefix[len-1] - prefix[i]) / (len-i-1));
            
            int diff = (int)(Math.abs(avg1-avg2));
            
            if(diff < value){
                value = diff;
                index = i;
            }
        }
        
        return index;
    }

}