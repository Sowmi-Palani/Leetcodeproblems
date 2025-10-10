/* Verifying an Alien Dictionary

Example 1:
Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.

Example 2:
Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
Output: false
Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.*/


class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0;i<words.length-1;i++){
            String s1 = words[i];
            String s2 = words[i+1];
            int len = Math.min(s1.length(), s2.length());
            boolean found = false;
            for(int j=0;j<len;j++){
                char ch1 = words[i].charAt(j);
                char ch2 = words[i+1].charAt(j);
                if(order.indexOf(ch1)<order.indexOf(ch2)){
                    found = true;
                    break;
                }
                else if (order.indexOf(ch1)>order.indexOf(ch2)){
                    return false;
                }
            }
            if(!found && s1.length()>s2.length()){
                return false;
            }
        }
        return true;
    }
}
