class Solution {
    public int lengthOfLongestSubstring(String s) {
      if( s == null || s.length() == 0){
        return 0;
      }   
      int n = s.length();
      int longest = 0;

      int i = 0;
      Set<Character> set = new HashSet<>();

      for(int j = 0;j<n;j++){
        char ch = s.charAt(j);

        while(set.contains(ch)){
            set.remove(s.charAt(i));
            i++;
        }
        set.add(ch);
        longest = Math.max(longest , j - i +1);
      }
        return longest;
    }
}
