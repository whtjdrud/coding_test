class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        boolean validate1 = number % n == 0;       
        
        boolean validate2 = number % m == 0;
        
        if ( validate1 && validate2) answer = 1;
            
        return answer;
    }
}