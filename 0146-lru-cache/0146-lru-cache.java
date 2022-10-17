class LRUCache {
    
    HashMap<Integer,Node> map;
    int cap =0 ;
    Node head , tail;
    public LRUCache(int capacity) {
        cap = capacity;
        map = new HashMap<>();
        head = new Node();
        tail = new Node();
        
        head.prev = null;
        tail.next = null;
        
        head.next = tail;
        
        tail.prev = head;
        
        
    }
    
    public int get(int key) {
        
        
        if(map.containsKey(key)){
            
            Node node = map.get(key);
            
            addToHead(node);
            return node.val;
        }
        
        return -1;
    }
    
    public void put(int key, int value) {
        
        
        //System.out.println("After "+key+" "+timeMap);
        
        Node node = map.get(key);
        
        if(node == null){
            
            Node new_node = new Node();
            new_node.val = value;
            new_node.key = key;
            
            map.put(key,new_node);
            addNode(new_node);
            
            if(map.size() > cap){
             
                map.remove(removeTail());
            }
        }
        else{
            node.val = value;
            addToHead(node);
        }
    }
    
    
    class Node{
        int val;
        int key;
        Node prev;
        Node next; 
        
    }
    
    //add it to the start of the head
    public void addNode(Node node){
        
        Node next = head.next;
        
        node.next = next;
        next.prev = node;
        head.next = node;
        node.prev = head;        
    }
    
    //remove some node from between and add it to the head
    
    public void addToHead(Node node){
        
        removeNode(node);
        addNode(node);
    }
    
    //remove a node
    public void removeNode(Node node){
        
        Node prev = node.prev;
        Node next = node.next;
        
        prev.next = next;
        next.prev = prev;
        
    }
    
    public void printNodes(){
        
        Node node = head.next;
        while(node.next!=null){
            System.out.println(" "+node.key);
            node = node.next;
        }
    }
    
    //remove the tail Node to remove from the cache
    
    public int removeTail(){
        
        int keyRemoved = tail.prev.key;
        removeNode(tail.prev);
        return keyRemoved;
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */