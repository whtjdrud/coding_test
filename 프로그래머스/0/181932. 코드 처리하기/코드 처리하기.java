class Solution {
    public String solution(String code) {        
 
        int mode = 0;
        StringBuilder ret = new StringBuilder();
                
        
        for(int i = 0; i < code.length(); i++){
            char current = code.charAt(i);
            
            if(current == '1'){
                mode = mode == 1 ? 0:1;
                continue;
            }
            
           if(i % 2 == mode){
              ret.append(current);
           }
            else if(i % 2 == mode){
               ret.append(current);
            }               
            
        }
        
        return ret.length() == 0 ? "EMPTY" : ret.toString();
       
      
    }
}