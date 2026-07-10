class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] m =new int[1001];
        for(int i=0;i<trips.length;i++){
            int passenger = trips[i][0];
            int start = trips[i][1];
            int end = trips[i][2];
            m[start]=m[start]+passenger;
            m[end]=m[end]-passenger;
        } for(int i=0;i<1001;i++){
            capacity=capacity-m[i];
            if(capacity<0){
                return false;
            }
        }
        return true;
        
    }
}