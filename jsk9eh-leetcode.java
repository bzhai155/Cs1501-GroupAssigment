// Joy Kim, jsk9eh
class Solution {
    public int romanToInt(String s) {
        int count = 0;
        
        for (int i=0; i < s.length(); i++){
            if(s.substring(i,i+1).equals("I")){
                count = count + 1;
            }
            if(s.substring(i,i+1).equals("V")){
                count = count + 5;
            }
            if(s.substring(i,i+1).equals("X")){
                count = count + 10;
            }
            if(s.substring(i,i+1).equals("L")){
                count = count + 50;
            }
            if(s.substring(i,i+1).equals("C")){
                count = count + 100;
            }
            if(s.substring(i,i+1).equals("D")){
                count = count + 500;
            }
            if(s.substring(i,i+1).equals("M")){
                count = count + 1000;
            }
        }
        for (int i=0; i < s.length()-1; i++){
            if(s.substring(i,i+2).equals("IV") || s.substring(i,i+2).equals("IX")){
                count = count - 2;
            }
            else if(s.substring(i,i+2).equals("XL") || s.substring(i,i+2).equals("XC")){
                count = count - 20;
            }
            else if(s.substring(i,i+2).equals("CD") || s.substring(i,i+2).equals("CM")){
                count = count - 200;
            }
        }
        
        return count;
    }
}