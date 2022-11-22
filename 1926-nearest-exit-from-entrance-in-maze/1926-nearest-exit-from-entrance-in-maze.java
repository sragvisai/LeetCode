class Solution {
    int count = 0;
    int startI = 0 , startJ = 0 , minCount = Integer.MAX_VALUE;
    public int nearestExit(char[][] maze, int[] entrance) {
        
        Queue<Node> que = new LinkedList<>();
                
        que.offer(new Node(entrance[0],entrance[1]));
        
        int[][] visited = new int[maze.length][maze[0].length];
        
        while(que.size() > 0){
            
            int size = que.size();
            
            for(int i = 0 ; i < size ; i++){
                
                Node node = que.poll();
            
                int x = node.x;
                int y = node.y;
                
                // System.out.println("Here "+x+" "+y);
                // System.out.println("There "+maze.length+" "+maze[0].length);
                
                if(x >= maze.length || x < 0 || y >= maze[0].length || y <0 || maze[x][y]  == '+' || visited[x][y] == 1)
                        continue;
                
                
                
                visited[x][y] = 1;
                
                  if(x == 0 || y == 0 || x == maze.length-1 || y == maze[0].length-1){
                
                        if(x != entrance[0] || y != entrance[1]){
                            return count;
                        }
                  }   
                  que.offer(new Node(x+1,y));
                  que.offer(new Node(x-1,y));
                  que.offer(new Node(x,y+1));
                  que.offer(new Node(x,y-1));
            }
            
            count++; 
        }
        
        return -1 ;
    }
    
    
    class Node{
        int x = 0 , y = 0;
        
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}