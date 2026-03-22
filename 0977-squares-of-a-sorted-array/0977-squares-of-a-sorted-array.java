class Solution {
    public int[] sortedSquares(int[] nums) {
       int n= nums.length;
       int []result=new int[n];
       int left=0;
       int right=n-1;
       int k=n-1;
       while(left<=right){
        int leftsqu=nums[left]*nums[left];
        int rightsqu=nums[right]*nums[right];
        if(leftsqu>rightsqu){
            result[k]=leftsqu;
            left++;
        }
        else{
            result[k]=rightsqu;
            right--;

        }
        k--;
       }
       return result;
    }
}