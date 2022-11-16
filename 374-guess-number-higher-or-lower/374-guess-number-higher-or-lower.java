/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        
        
        int low = 1 , high = n;
        
        while(low <= high){
           // System.out.println("Low "+low+" "+high);
            int num = low + (high-low)/2;
            
           // System.out.println("Num "+num);
            
            if(guess(num) == 0)
                return num;
            else if(guess(num) == -1)
                high = num-1;
            else
                low = num + 1 ;
            
        }
        
        return low;
    }
}