class Solution {
    public int firstUniqChar(String s) {
        int arr[]= new int [26];
        for(int i=0;i<26;i++){
            arr[i]=0;
        }
        for(int j=0;j<s.length();j++){
            int a = s.charAt(j)-'a';
            arr[a]++;
        }
        for(int k=0;k<s.length();k++){
            int a = s.charAt(k)-'a';
            if(arr[a]==1){
                return k;
            }
        }
        return -1;
        
    }
}