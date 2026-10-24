class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder str= new StringBuilder();
        for(int i=0;i<words.length;i++){
            int sum=0;
            for(int j=0;j<words[i].length();j++){
                sum=sum+weights[words[i].charAt(j)-'a'];
            }
            int val=sum%26;
            char ch = (char) ('a'+(25-val));
            str.append(ch);
        }
        return str.toString();
    }
}