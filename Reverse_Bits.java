/*Reverse bits of a given 32 bits signed integer.

Example 1:
Input: n = 43261596
Output: 964176192

Explanation:
Integer	Binary
43261596	00000010100101000001111010011100
964176192	00111001011110000010100101000000 */



class Solution {
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();
        while(n>0){
            int rem = n%2;
            sb.append(rem);
            n/=2;
        }
        while (sb.length() < 32) {
            sb.append('0');
        }
        Long decimal = Long.parseLong(sb.toString(), 2);
        return decimal.intValue();
    }
}
