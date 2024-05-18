class Solution {
public:
    bool strongPasswordCheckerII(string password) {
        if (password.length() < 8) { return false; }

        bool lowerCase = false;
        bool upperCase = false;
        bool digit = false;
        bool special = false;
        bool adj = false;

        for (int i = 0; i < password.length(); ++i) {
            char ch = password[i];
            if (ch >= '0' && ch <= '9') { digit = true; }
            else if (ch >= 'a' && ch <= 'z') { lowerCase = true; }
            else if (ch >= 'A' && ch <= 'Z') { upperCase = true; }
            else if (string("!@#$%^&*()-+").find(ch) != string::npos) { special = true; }
            
            if (i > 0 && ch == password[i - 1]) { adj = true; }
        }

        return lowerCase && upperCase && digit && special && !adj;
    }
};