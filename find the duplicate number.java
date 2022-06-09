//link to the problem:https://leetcode.com/problems/find-the-duplicate-number/
//DSA sheet by Arsh Goyal: Problem 1

//Brute force:Sort it 
//better:hashing with new array or already present array
//optimal:Linkedlist cycle

class Solution {
    public int findDuplicate(int[] nums) {
       
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
            
        int new_slow=nums[0];
        while(new_slow!=slow){
            slow=nums[slow];
            new_slow=nums[new_slow];
        }
        
        return slow;
    }
}
