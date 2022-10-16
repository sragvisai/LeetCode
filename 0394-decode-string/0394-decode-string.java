class Solution {
    public String decodeString(String s) {
      
        List<Integer> countNeeded = new ArrayList<>();
        List<String> character = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder();
        int count  = 0 , braceCount = 0;
        
        int i = 0;
        while(i < s.length()){
           //System.out.println("BraceCount "+braceCount);
            if(s.charAt(i) == ']'){
                //perform some operations here
                StringBuilder temp = new StringBuilder();
                
                //traverse through the list and build a string
                //till we encounter an open bracket
                
                int size =  character.size() -1;
                while(!character.get(size).equals("[")){
                    temp.append(character.get(size));
                    character.remove(size);
                    size--;
                } 
                //removing the open brace
                character.remove(size);
                
                braceCount--;
                
                //if the count > 0 then we are still inside of an another openbracket
                //so append this string to the list
                
                //System.out.println("Count needed "+countNeeded);
                if(braceCount > 0){
                    System.out.println("Character "+character);
                    character.add(appendString(temp,countNeeded.get(countNeeded.size()-1)).toString());
                }
                else{
                    //else we can append the string to our final result
                    sb.append(appendString(temp.reverse(),countNeeded.get(countNeeded.size()-1)));
                }
                
                countNeeded.remove(countNeeded.size()-1);                
                
            }
            else if(s.charAt(i) == '[') {
                countNeeded.add(count);
                count = -1;
                braceCount++;
                character.add(String.valueOf('['));
            }
            else if(s.charAt(i)-'0' >= 0 && s.charAt(i)-'0' <=9){
                
                if(count == -1)
                    count = s.charAt(i) -'0';
                else
                    count = (count * 10) + s.charAt(i)-'0';
            }
            else if(braceCount > 0){
                character.add(String.valueOf(s.charAt(i)));
                System.out.println("Here for "+s.charAt(i));
            }
                
            else
                sb.append(s.charAt(i));
            
            i++;
            
            System.out.println("SV at "+sb);
        }
        
        int leftOut = 0;
        while(leftOut < character.size())
                sb.append(character.get(leftOut++));
        
        return sb.toString();
    }
    
    public StringBuilder appendString(StringBuilder sb, int count){
        System.out.println("Start res" + sb);
        int i = 0;
        StringBuilder res = new StringBuilder();
        
        while(i < count){
            res.append(sb);
            i++;
        }
        
        System.out.println("Returning res" + res);
        return res;
    }
}