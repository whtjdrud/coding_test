class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int operandPlus = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        int operandMult = 2 * a * b;
        
        return Math.max(operandPlus, operandMult);
    }
}