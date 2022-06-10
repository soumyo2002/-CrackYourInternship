//link to the problem:https://www.geeksforgeeks.org/chocolate-distribution-problem/

//DSA sheet by Arsh Goyal: Problem 7

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int start=0,end=m-1,diff=0,min_diff=Integer.MAX_VALUE;
        while(end<n){
            diff=a.get(end)-a.get(start);
            start++;
            end++;
            if(diff<min_diff)
            min_diff=diff;
        }
        return min_diff;
    }
}
