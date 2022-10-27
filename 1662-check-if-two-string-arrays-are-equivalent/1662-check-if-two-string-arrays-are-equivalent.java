class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder sb1 = new StringBuilder();
        
        for(String str : word1){
            sb1.append(str);
        }
        
        StringBuilder sb2 = new StringBuilder();
        
        for(String str : word2){
            sb2.append(str);
        }
        
        // System.out.println("S "+sb1);
        // System.out.println("S 2 " +sb2);
        
        return sb1.compareTo(sb2) == 0;
    }
}