class Solution {
    
    
    public int minMutation(String startGene, String endGene, String[] bank) {
        int res = 0;
        int count = 0;
        HashSet<String> banks = new HashSet<>();
        
        for(String str: bank){
            
            banks.add(str);
        }
        
        char[] possible = new char[]{'A','C','G','T'};
        
        Queue<String> que = new LinkedList<>();
        
        HashSet<String> visited = new HashSet<>();
        
        que.offer(startGene);
        //visited.add(startGene);
        
        while(!que.isEmpty()){
            
            
            int size = que.size();
            
            for(int j = 0 ; j < size ; j++){
               String current = que.poll(); 
            
                if(current.equals(endGene))
                {
                    res = 1;
                   return count; 
                }
            
                visited.add(current);
            
                for(char ch : possible){
                
                    for(int i = 0 ; i < 8 ; i++){

                        String newStr = current.substring(0,i)+ch+current.substring(i+1,8);

                        if(!visited.contains(newStr) && banks.contains(newStr)){
                            que.offer(newStr);
                        }
                    
                    }
                }
            }
            count++;
        }
        
        return res == 0 ? -1 : count;
    }
}