class RandomizedSet {
    
    HashSet<Integer> set;
    int minEle = 0 , maxEle = 0;
    // HashMap<Integer,Integer> map = new HashMap<>();
    List<Integer> traverse = new ArrayList<>();
    
    public RandomizedSet() {
        set = new HashSet<>();
    }
    
    public boolean insert(int val) {
        
        // if(!map.containsKey(val)){
        //     map.put(val,traverse.size());
        //     traverse.add(val);       
        // }
        // return set.add(val);
        
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
        
        Random random = new Random(); 
        
        int x = random.nextInt(traverse.size());
        
        return traverse.get(x);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */