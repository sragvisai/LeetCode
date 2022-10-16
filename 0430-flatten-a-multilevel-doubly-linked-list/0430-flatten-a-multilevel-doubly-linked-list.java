/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    
    List<Integer> list = new ArrayList<>();
    
    public Node flatten(Node head) {
        
        //a recursive dfs approach
        
        //when we encounter a child node call the function
        //passing the current node as a parameter
        
        if(head == null) return head;
        
        
        Node traverse = head;
        
        Node res = null;

        
        dfs(traverse,traverse.next);
        
        
        if(list.size() == 0) return res;
        
        res = new Node();
        res.val = list.get(0);
        res.prev = null;
        
        traverse = res;
        
        for(int i = 1 ;i < list.size() ; i++){
            
            Node node = new Node();
            node.val = list.get(i);
            
            traverse.next = node;
            node.prev = traverse;
            
            traverse = traverse.next;
            
            
        }
        
        return res;
    }
    
    public void dfs(Node traverse, Node next){
        
        if(traverse == null) return;
        
        Node curr = traverse;
        
        list.add(curr.val);
        
       if(traverse.child == null){
           
           dfs(traverse.next,next);
       }
        else{
            
            dfs(traverse.child,next);
            dfs(traverse.next,next);
        }       
            
        
    }
}