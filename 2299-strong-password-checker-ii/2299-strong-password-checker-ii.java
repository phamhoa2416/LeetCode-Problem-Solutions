class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length() < 8) { return false; }
        for (int i = 0; i < password.length() - 1; ++i) {
            if (password.charAt(i) == password.charAt(i + 1)) {
                return false;
            }
        }

        int countDigit = 0, countUpperCase = 0, countLowerCase = 0, countSpecialChar = 0;;
        for (int i = 0; i < password.length(); ++i) {
            char ch = password.charAt(i);
            if (Character.isLowerCase(ch)) {
                countLowerCase++;
            } else if (Character.isUpperCase(ch)) {
                countUpperCase++;
            } else if (Character.isDigit(ch)) {
                countDigit++;
            } else if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^'
                        || ch == '&' || ch == '*' || ch == '(' || ch == ')' || ch == '-' || ch == '+') {
                countSpecialChar++;      
            }
        }

        if (countDigit == 0 || countUpperCase == 0 || countLowerCase == 0 || countSpecialChar == 0) { return false; }
        return true;
    }
}