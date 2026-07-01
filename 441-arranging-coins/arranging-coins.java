class Solution {
    public int arrangeCoins(int n) {
        int row=1;
        int coins=n;
        while(coins-row>=0){
            coins=coins-row;
            row++;
        }
        return row-1;
        
    }
}