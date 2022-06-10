//link to the problem:https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

//DSA sheet by Arsh Goyal: Problem 6

class Solution {
    public int maxProfit(int[] prices) {
        int size=prices.length;
        if(size==1)
            return 0;
        else
        {
            int max_profit=0,profit,min_buying_price=prices[0];
            for(int i=1;i<size;i++){
                int selling_price=prices[i];
                
                if(min_buying_price>prices[i])
                    min_buying_price=prices[i];
                
                profit=selling_price-min_buying_price;
                
                if(max_profit<profit)
                    max_profit=profit;
                
            }
            return max_profit;
        }
    }
}
