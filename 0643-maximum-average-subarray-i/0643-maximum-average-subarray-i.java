class Solution {
    public double findMaxAverage(int[] nums, int k) {
   int n=nums.length;
   double maxsum=0;
   double windowsum=0;
   for(int i=0;i<k;i++){
    windowsum += nums[i];
    }
     maxsum =windowsum;
    for(int i=k;i<n;i++){
        windowsum =windowsum + nums[i]-nums[i-k];
        maxsum = Math.max(maxsum,windowsum);

    }
    return maxsum/k;
   
        
    }
}