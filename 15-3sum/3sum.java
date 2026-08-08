class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums==null || nums.length<3) 
        return new ArrayList<>();
        //sort the array element 
        Arrays.sort(nums);//Sorting is extremely important because it allows us to use the two-pointer technique.

        //create a set to store all the triplete 
        Set<List<Integer>> result = new HashSet<>();

        //now fix the first element & find other two element 
        for(int i=0;i<nums.length-2; i++){

        //find other two elements using two sum approach 
        int left = i+1;
        int right =nums.length-1;

        while(left<right){
            int sum= nums[i]+nums[left]+nums[right];

            if(sum==0){
                //add the set & move to find other triplets
                result.add(
                    Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
            }else if (sum<0){
            left++;
            }else{
            right--;
        }
        
    }
        }
    return new ArrayList<>(result);
}
}