class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int j = 0;
        int freq = 0;
        int maxlength = 0;

        int[] count = new int[26];

        for(int i = 0;i < n;i++){
            count[s.charAt(i) - 'A']++;
            freq = Math.max(freq ,count[s.charAt(i) - 'A'] );

            int win = i - j +1;

            if(win - freq > k){
                count[s.charAt(j) - 'A']--;
                j++;
            }

            win = i - j +1;
            maxlength = Math.max(maxlength , win);
        }
        return maxlength;
    }
}
