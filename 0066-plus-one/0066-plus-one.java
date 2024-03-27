class Solution {
    public int[] plusOne(int[] digits) {
        int size = digits.length;

        for (int i = size - 1; i >= 0; --i) {
            if (i == size - 1) {
                digits[i]++;
            }

            if (digits[i] == 10) {
                digits[i] = 0;
                if (i != 0) {
                    digits[i - 1]++;
                } else {
                    int newDigits[] = new int[size + 1];
                    newDigits[0] = 1;
                    return newDigits;
                }
            } else {
                return digits;
            }
        }
        return digits;
    }
}