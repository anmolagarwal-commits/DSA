class Solution {
    public String toLowerCase(String s) {
        char[] Char = s.toCharArray();
        for (int i = 0; i < Char.length; i++) {
        if (Char[i] >= 'A' && Char[i] <= 'Z') {
                Char[i] = (char) (Char[i] + 32);
            }}
        return new String(Char);
}
}
