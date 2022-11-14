class Solution {
    public String makeGood(String s) {
        
        
        List<Character> list = new ArrayList<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            
            list.add(s.charAt(i));
            
            if(list.size() > 1){
                int size = list.size();
                
                if( list.get(size-1) != list.get(size-2) && Character.toLowerCase(list.get(size-1)) == list.get(size-2)){
                    list.remove(list.size()-1);
                    list.remove(list.size()-1);
                }
                else if( list.get(size-2) != list.get(size-1) && Character.toLowerCase(list.get(size-2)) == list.get(size-1)){
                    list.remove(list.size()-1);
                    list.remove(list.size()-1);
                }
            }
        }        
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < list.size() ; i++){
            sb.append(list.get(i));
        }
        
        return sb.toString();
        
    }
}