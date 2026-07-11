class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        
        char[] str1_chars = str1.toCharArray();
        char[] str2_chars = str2.toCharArray();
        char[] resultArray = new char[str1_chars.length*2];
        
        for(int i = 0; i < str1_chars.length; i++){            
            
            resultArray[i*2] = str1_chars[i];
            resultArray[i*2+1] = str2_chars[i];        
        
        }
        
        return String.valueOf(resultArray);
    }
}