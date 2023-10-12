public class Best_TIme_To_Buy_and_Sell_Stock {
    
    public static void main(String[] args) {
        maxProfit(new int[]{7,1,5,3,6,4});
    }
    
    public static int maxProfit(int[] prices) {
        int lp=prices[0],pro=0;
        for(int p:prices){
            if(p<lp)lp=p;
            else if(p-lp>pro)pro=p-lp;
        }
        return pro;
    }
}
