class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x!=0 && x %10 == 0)) return false;
       
       
        int reverseNumber = 0;
        
        while(reverseNumber < x){
            
            reverseNumber = (reverseNumber *10) + x % 10;
            
            x = x/10;
            
        }
        
        return reverseNumber == x || reverseNumber/10 == x;
    }
}