class Solution {
    public int twoCitySchedCost(int[][] costs) {
        
        HashMap<Integer,List<Integer>> costMap = new HashMap<>();
        
        int[] arr = new int[costs.length];
        
        for(int i = 0 ; i  < costs.length; i++){
            
            int key = costs[i][0] - costs[i][1];
            
            
            List<Integer> list = costMap.getOrDefault(key,new ArrayList<>());
            
            list.add(i);
            
            costMap.put(key,list);
            
            arr[i] = key;
            
            System.out.println("Cost Map" + costMap);
        }
        
       
        
        Arrays.sort(arr);
        
        int totalCost = 0;
        
        //adding the values for city1
        for(int i = 0 ; i < costs.length/2 ; i++){
            
            
            List<Integer> list = costMap.get(arr[i]);
            
            totalCost += costs[list.get(0)][0];
            
            if(list.size() > 1)
                    list.remove(0);
        }
        
        for(int i = costs.length / 2 ; i < costs.length; i++){
            
            
            List<Integer> list = costMap.get(arr[i]);
            
            totalCost += costs[list.get(0)][1];
            
            if(list.size() > 1)
                    list.remove(0);
        }
        
        return totalCost;
        
    }
}