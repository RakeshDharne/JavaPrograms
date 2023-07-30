public class buySellStocks {

    
    public static int  buyAndSellStocks(int prices[]) {
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i = 0; i < prices.length; i++) {
            if(buyPrice<prices[i]){ //profit

                int profit=prices[i]-buyPrice;///todays profit
                maxProfit=Math.max(maxProfit, profit);
            }else{
                buyPrice=prices[i];
            }
            
            
        }
        return maxProfit;


        
    }
    public static void main(String[] args) {

        

        int prices[]={7,1,5,3,6,4};//O(n)
        System.out.println(buyAndSellStocks(prices));
    }
}
