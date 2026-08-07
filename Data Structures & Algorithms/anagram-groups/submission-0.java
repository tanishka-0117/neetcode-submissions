class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n  = strs.length;

        Map<String , List<String>> map = new HashMap<>();


        for(String str : strs){
            String p = helper(str);

            if(!map.containsKey(p)){
                map.put(p , new ArrayList<>());
            }

            map.get(p).add(str);
        }


        return new ArrayList<List<String>>(map.values());
    }

    private String helper(String s){
        char[] ch = s.toCharArray();

        Arrays.sort(ch);
        return new String(ch);
    }
}
