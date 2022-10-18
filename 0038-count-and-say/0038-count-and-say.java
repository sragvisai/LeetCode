class Solution {
    public String countAndSay(int n) {
        
        String one = "1";
        
        if(n == 1) return one;
        
        String two ="11";
        
        if(n ==2) return two;
        
        StringBuilder sb = new StringBuilder(two);
        
        int Lcount = 2;
        
        while(Lcount < n){
            
            StringBuilder temp =  new StringBuilder(sb);
            
            sb = new StringBuilder();
            
            int i = 0 , count = 0;
            
            
            
            while (i < temp.length()){
                
                char ch = temp.charAt(i);
                
                count = 1;
                
                int j = i + 1;
                
                while(j < temp.length() && temp.charAt(j) == ch)
                {
                    count++;
                    j++;
                }
                
                sb.append(count);
                sb.append(ch);
                
                i = j;
                
            }
            
            
            
            Lcount++;
        }
        
        return sb.toString();
        
    }
}