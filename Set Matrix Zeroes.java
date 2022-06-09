//link to the problem:https://leetcode.com/problems/set-matrix-zeroes/

//DSA sheet by Arsh Goyal: Problem 4

class Solution {
    public void setZeroes(int[][] a) {
        int m=a.length;
        int n=a[0].length;
        int flag=0;
        for(int i=0;i<m;i++){
            if(a[i][0]==0)
                flag=1;
            for(int j=1;j<n;j++){
                if(a[i][j]==0)
                {
                    a[i][0]=0;
                    a[0][j]=0;  
                }
            }
        }
        for(int i=(m-1);i>=0;i--){
            for(int j=(n-1);j>=1;j--){
                if(a[i][0]==0 || a[0][j]==0)
                {
                    a[i][j]=0;  
                }
            }
            if(flag==1)
                a[i][0]=0;
        }
    }
}
