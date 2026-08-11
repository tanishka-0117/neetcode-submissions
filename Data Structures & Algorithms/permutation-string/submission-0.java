class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (char ch : s1.toCharArray()) {
            count1[ch - 'a']++;
        }

        int k = s1.length();

        for (int i = 0; i < k; i++) {
            count2[s2.charAt(i) - 'a']++;
        }

        if (matches(count1, count2)) {
            return true;
        }

        for (int i = k; i < s2.length(); i++) {

            count2[s2.charAt(i) - 'a']++;

            int j = i - k;
            count2[s2.charAt(j) - 'a']--;

            if (matches(count1, count2)) {
                return true;
            }
        }

        return false;
    }

    private boolean matches(int[] n, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (n[i] != b[i]) {
                return false;
            }
        }

        return true;
    }
}