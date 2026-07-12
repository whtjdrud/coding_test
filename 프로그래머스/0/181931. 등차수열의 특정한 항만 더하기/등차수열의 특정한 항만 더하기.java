class Solution {
    public int solution(int a, int d, boolean[] included) {
    
        int answer = 0;  
        int currentNum = a;        
        
        for (boolean shouldAdd : included) {
            
            if (shouldAdd) {
               answer += currentNum;
            }            
            
            currentNum += d;
        }
        
        return answer;
    }
}