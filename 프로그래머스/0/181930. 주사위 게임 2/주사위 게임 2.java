class Solution {
    public int solution(int a, int b, int c) {
        
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int result = 1;
        
        int[] intArr = {a, b, c};
        
        for (int num : intArr) {
            if (a == num) countA++;
            if (b == num) countB++;
            if (c == num) countC++;
        }
        
        int maxNum = Math.max(countA, Math.max(countB, countC));
     
        for( int i = 1; i <= maxNum; i++){
            result *= (int) (Math.pow(a, i) + Math.pow(b, i) + Math.pow(c, i));
        }
        
        return result;

     
    }
}
