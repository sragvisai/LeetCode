class Solution {
    public String intToRoman(int num) {
        
        StringBuilder sb = new StringBuilder();
        
        while(num > 0){
            
            if(num >= 1 && num < 4){
                sb.append("I");
                num--;
            }
            else if(num == 4){
                sb.append("IV");
                num -= 4;
            }
            else if(num == 9){
                sb.append("IX");
                break;
            }
            else if(num >=5 && num <9){
                sb.append("V");
                num -= 5;
            }
            else if(num >= 10 && num < 40){
                sb.append("X");
                num -= 10;
            }
            else if(num >= 40 && num <= 49){
                sb.append("XL");
                num -= 40;
            }
            else if(num >= 50 && num <= 89){
                sb.append("L");
                num -= 50;
            }
            else if(num >= 90 && num < 100){
                sb.append("XC");
                num -= 90;
            }
            else if(num >= 100 && num <= 399){
                sb.append("C");
                num -= 100;
            }
            else if(num >= 400 && num < 500){
                sb.append("CD");
                num -= 400;
            }
            else if(num >= 500 && num < 900){
                sb.append("D");
                num -= 500;
            }
            else if(num >= 900 && num < 1000){
                sb.append("CM");
                num -= 900;
            }
            else{
                sb.append("M");
                num -= 1000;
            }
        }
        
        return sb.toString();
        
    }
}