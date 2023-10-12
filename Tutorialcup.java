import java.util.Arrays; 
public class Tutorialcup {
     public static int maxProfit(int[] prices) {
        int ans = 0;
        int n=prices.length;
        for (int i = 1; i < n; i++) {
            if (prices[i] > prices[i - 1])
                ans += prices[i] - prices[i - 1];
        }
        return ans;
    }
  public static void main(String[] args) {
    int [] arr = {7,1,3,8,6,4}; 
    int ans=  maxProfit(arr);
    System.out.println(ans);
  }
}