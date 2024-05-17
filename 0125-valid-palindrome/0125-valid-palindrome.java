class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder original = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z')  || (ch >= '0' && ch <= '9')) {
                original.append(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                original.append((char)(ch + 32));
            }
        }
        return original.toString().equals(original.reverse().toString());
    }
}