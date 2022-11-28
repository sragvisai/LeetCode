class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0 ; i < matches.length ; i++){
            
            map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);
            set.add(matches[i][0]);
            set.add(matches[i][1]);
        }
        
        
        //determining the first part
        
        List<Integer> ans1 = new ArrayList<>();
        
        for(Integer i : set)
            if(!map.containsKey(i))
                ans1.add(i);
        
        Collections.sort(ans1);
        //now for the second part
        
        
        List<Integer> ans2 = new ArrayList<>();
        
        for(Map.Entry<Integer,Integer> ele : map.entrySet()){
            
            if(ele.getValue() == 1)
                ans2.add(ele.getKey());
        }
        
        Collections.sort(ans2);
        
        
        List<List<Integer>> res = new ArrayList<>();
        
        res.add(ans1);
        res.add(ans2);
        
        return res;
    }
}