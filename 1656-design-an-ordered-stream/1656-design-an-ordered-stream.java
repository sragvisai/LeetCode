class OrderedStream {
    
    int finalCount = 1 , index = 0 ;
    String[] arr ;
    
    HashSet<Integer> set = new HashSet<>();
    
    public OrderedStream(int n) {
        
        arr = new String[n+1];        
    }
    
    public List<String> insert(int idKey, String value) {
        
        arr[idKey] = value;
        
        index = Math.max(index,idKey);
        
        set.add(idKey);
        
        
        List<String> res = new ArrayList<>();
       
          
            for(int i = finalCount ; i <= index ; i++){
                if(!set.contains(i)) break;
                res.add(arr[i]);
                finalCount++;
            }
        
        
        return res;
        
        
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */