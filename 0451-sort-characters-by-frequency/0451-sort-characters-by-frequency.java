class Solution {
    public String frequencySort(String s) {
        
        HashMap<Integer,List<Character>> map = new HashMap<>();
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        HashMap<Character,Integer> count = new HashMap<>();
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0 ; i < s.length() ; i++)
                count.put(s.charAt(i),count.getOrDefault(s.charAt(i),0)+1);
        
        for(Map.Entry<Character,Integer> entry : count.entrySet()){
            
            List<Character> list = map.getOrDefault(entry.getValue(),new ArrayList<Character>());
            list.add(entry.getKey());
            map.put(entry.getValue(),list);
            if(set.add(entry.getValue()))
                pq.offer(entry.getValue());
        }
        
        //System.out.println("Here "+map);
        
        StringBuilder sb = new StringBuilder();
        
        while(pq.size() != 0){
            
            int x = pq.poll();
            
            List<Character> list = map.get(x);
            
            for(char ch : list){
                
                    int a = 0;
                while(a < x){
                    sb.append(ch);
                    a++;
                }

            }
        }
        
      return sb.toString();  
        
    }
}