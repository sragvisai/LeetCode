class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
                return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        
        HashSet<Character> set = new HashSet<>();
        
        int i = 0, j =0 , maxCount = 1;
        
        
        while(j < s.length()){
            
            char curr = s.charAt(j);
            
            if(!set.contains(curr)){
               
                map.put(curr,j);
                set.add(curr);
              

                maxCount = Math.max(maxCount, j - i);
                 j++;
            }
            else{
                
                maxCount = Math.max(maxCount,j-i);
                i = Math.max(map.get(curr)+1,i);
                map.put(curr,j);
                j++;
            }
        }
        
        return Math.max(maxCount,j-i);
        
    }
}