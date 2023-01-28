public class BestTimeStock {
    public static int buyAndSellStocks(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0;i<prices.length;i++){
            if (buyPrice < prices[i]){      // CASE 1: Profit case 
                int profit = prices[i] - buyPrice;  // Today profit
                maxProfit = Math.max(maxProfit,profit);   
            }
            else {                          // CASE 2: Loss case
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println("Maximum Profit earned: "+buyAndSellStocks(prices));
    }    
}

/*
OUTPUT:
Maximum Profit earned: 5
*/