class Solution {
    public String reverseWords(String s) {
     
        
        int len = s.length(), i = 0 ;
        StringBuilder finalAns = new StringBuilder();
        
        List<String> list = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder();
        
        while(i < len){
        
            if(s.charAt(i) == ' '){
                
                if(sb.length() == 0)
                {
                    i++;
                    continue;
                }
                else{
                    list.add(sb.toString());
                    sb = new StringBuilder();
                    i++;
                }
            }
            
            else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        
        if(sb.length() != 0)
            list.add(sb.toString());
        
        for(i = list.size()-1; i >=0 ; i--){
            finalAns.append(list.get(i));
            if(i != 0)
                finalAns.append(" ");
        }
    
        return finalAns.toString();
        
    }
}