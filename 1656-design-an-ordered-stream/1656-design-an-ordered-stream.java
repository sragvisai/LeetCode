class OrderedStream {
    
    int index = 1 ;
    String[] arr ;
    
    
    public OrderedStream(int n) {
        
        arr = new String[n+1];        
    }
    
    public List<String> insert(int idKey, String value) {
        
        arr[idKey] = value;
            
        List<String> res = new ArrayList<>();
       
          
        while(index < arr.length && arr[index] != null){
            res.add(arr[index]);
            index++;
        }
        
        
        return res;
        
        
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */