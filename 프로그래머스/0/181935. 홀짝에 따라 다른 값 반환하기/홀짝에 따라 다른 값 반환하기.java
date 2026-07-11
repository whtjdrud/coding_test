class Solution {
    public int solution(int n) {
        
        int answer = 0;
        boolean isEven = n % 2 == 0;
        
        
        for(int i = 0; i <= n ; i++){            
            if(i % 2 == 0 && isEven){
                answer += i * i;
            }
            if(i % 2 == 1 && !isEven)            
            {
                answer += i;
            }
        }        
        
        return answer;
    }
}