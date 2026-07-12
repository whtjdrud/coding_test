class Solution {
    public int solution(int[] num_list) {
        
        int productOfElements = 1; // 모든 원소들의 곱
        int squareOfSum = 0;       // 모든 원소들의 합의 제곱
        
        
        for(int num : num_list){
            productOfElements *= num;
            squareOfSum += num;
        }
        
        squareOfSum = (int) Math.pow(squareOfSum, 2);
        
        
        return productOfElements > squareOfSum ? 0 : 1;
    }
}