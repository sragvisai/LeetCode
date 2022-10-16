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
        
        Node res = traverse;

        
        dfs(traverse,null);

        
        return res;
    }
    
    public void dfs(Node traverse, Node next){
        
        if(traverse == null) return;
        
        Node curr = traverse;
        
        // list.add(curr.val);
        
       if(traverse.child == null){
           
           dfs(traverse.next,next); // 8, 4
           
           if(traverse != null && traverse.next == null){
               
               System.out.println("Here "+traverse.val);
               
               //System.out.println("Here --- "+next.val);
               
               traverse.next = next;
               if(next!=null)
                next.prev = traverse;
               
           }
       }
        else{
            
            Node passThis = traverse.next;
            traverse.next = traverse.child;
            traverse.child.prev = traverse;
            traverse.child = null;
            
            if(passThis!=null)
            dfs(traverse.next,passThis); //7,4
            else
            dfs(traverse.next,next);
                       
            dfs(passThis,next);
        }       
            
        
    }
}