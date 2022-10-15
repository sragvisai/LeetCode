class RandomizedSet {
    
    HashMap<Integer,Integer> map = new HashMap<>();
   
    List<Integer> traverse = new ArrayList<>();
    
    public RandomizedSet() {
       
    }
    
    public boolean insert(int val) {
        
        if(!map.containsKey(val)){
            map.put(val,traverse.size());
            traverse.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        
        if(map.containsKey(val)){
            int lastEle = traverse.get(traverse.size()-1);
            int currIndex = map.get(val);
            traverse.set(currIndex,lastEle);
            map.put(lastEle,currIndex);
            traverse.remove(traverse.size()-1);
            map.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
                
        return traverse.get((int)(Math.random() * (traverse.size()) ));
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */