class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count=0;
        int i=0;
        int n=people.length-1;
        int sum=0;
        Arrays.sort(people);
        while(i<=n){
            sum=people[i]+people[n];
            // if(sum>=limit){
            if(sum>limit){
                n--;
                count++;
            }else{
                n--;
                i++;
                count++;
            }
        }return count;
    }
}