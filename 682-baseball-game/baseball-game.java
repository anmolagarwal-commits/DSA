class Solution {
    public int calPoints(String[] operations) {
        List <Integer> ans = new ArrayList<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                ans.remove(ans.size()-1);
            }
            else if (operations[i].equals("D")){
                int a = 2* ans.get(ans.size()-1);
                ans.add(a);
            }
            else if (operations[i].equals("+")){
                int a = ans.get(ans.size()-1)+ans.get(ans.size()-2);
                ans.add(a);
            }
            else{
                ans.add(Integer.parseInt(operations[i]));
            }

        }
        int sum=0;
        int n=ans.size();
        for(int i=0;i<n;i++){
            sum+=ans.get(i);
        }
        return sum;
    }
}