class RandomizedSet {
    
    HashSet<Integer> set;
   
    List<Integer> traverse = new ArrayList<>();
    
    public RandomizedSet() {
        set = new HashSet<>();
    }
    
    public boolean insert(int val) {
        
    
        if(set.add(val)){
            traverse.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        
        if(set.remove(val)){
            traverse.remove((Integer)val);
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