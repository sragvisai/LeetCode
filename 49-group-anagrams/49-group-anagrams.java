class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> res = new ArrayList<>();
        
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(int i = 0 ; i < strs.length; i++){
            
            
            String sorted = sortedStr(strs[i]);
            List<String> temp = map.getOrDefault(sorted,new ArrayList<String>());
            
            temp.add(strs[i]);
            
            map.put(sorted,temp);
        }
        
        for(Map.Entry<String,List<String>> ele : map.entrySet()){
            
            List<String> temp = ele.getValue();
            res.add(temp);
        }
        
        return res;
    }
    
    public String sortedStr(String str){
        
        char[] arr = str.toCharArray();
        
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < arr.length ; i++){
            
            sb.append(arr[i]);
        }
        
        return sb.toString();
        
    }
}