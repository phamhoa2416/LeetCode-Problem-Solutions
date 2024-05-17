class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder original = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                original.append(Character.toLowerCase(ch));
            }
        }

        if (original.toString().equals(original.reverse().toString())) { return true; }
        return false;
    }
}