class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
     
        HashMap<Integer,Integer> map = new HashMap<>();
        
        
        for(int i =0 ;i < matrix.length ; i++){
            
            for(int j= 0 ; j < matrix[0].length ; j++){
                
                if(map.containsKey(i-j)){
                    if(matrix[i][j] != map.get(i-j))
                            return false;
                }
                else{
                    map.put(i-j,matrix[i][j]);
                }
            }
        }
        
        return true;
        
    }
}