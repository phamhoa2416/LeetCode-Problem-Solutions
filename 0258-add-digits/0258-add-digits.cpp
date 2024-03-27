class Solution {
public:
    int addDigits(int num) {
        int temp = 0;
        while (num > 0) {
            temp += num % 10;
            num = num/10;
        }
        if (temp > 9) return addDigits(temp);
        else return temp;
    }
};