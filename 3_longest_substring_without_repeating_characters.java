class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int right = 0;
        int max = 0;
        Set<Character> chars_set = new HashSet<>();

        while(right<s.length()){

            if(!chars_set.contains(s.charAt(right))){
                chars_set.add(s.charAt(right));
                max = Math.max(max, chars_set.size());
                right++;
            }
            else{
                chars_set.remove(s.charAt(left));
                left++;
            }

        }

        return max;
    }
}