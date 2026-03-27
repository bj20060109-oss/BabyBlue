public class BabyBlue{

    // TODO: return the number of valid combinations
    public static long change(int amount, int[] prices){

        //amount = 0 => none of the prices are used
        if(amount == 0){
            return 1;
        }
        
        // the numbers of way to store from 0~amount dollars
        long[] dp = new long[amount + 1];
        dp[0] = 1;

        for(int price : prices){ //choose a 'price' from 'prices' 
            for(int j = price; j <= amount; j++){
                dp[j] += dp[j - price];
            }

        }
        //return how many ways to store 'amount' dollars
        return dp[amount];
    }
}
