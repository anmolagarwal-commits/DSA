class Solution {
    public String common(String s1,String s2){
        StringBuilder str = new StringBuilder();
        int len=0;
        int n = s1.length();
        int m = s2.length();
        if(n>m){
            len=m;
        }else{
            len=n;
        }
        for(int i=0;i<len;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                str.append(s1.charAt(i));
            }
            else{
                break;
        }
            }return str.toString();
    }
    public String longestCommonPrefix(String[] strs) {
        String res= strs[0];
        for(int i=0;i<strs.length;i++){
            res=common(res,strs[i]);
        }
        return res;
    }
}