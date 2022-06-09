//link to the problem:https://leetcode.com/problems/remove-duplicates-from-sorted-array/

//DSA sheet by Arsh Goyal: Problem 3


class Solution {
    public int removeDuplicates(int[] nums) {
        int point=1,prev=nums[0];
        int size=nums.length;
        if (size == 0 || size == 1)
            return size;
        for(int i=1;i<size;i++){
            if(prev!=nums[i]){
                nums[point]=nums[i];
                point+=1;
                prev=nums[i];
            }
        }
        return point;
    }
}
