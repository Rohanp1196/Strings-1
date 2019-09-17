class Solution {

    public String customSortString(String S, String T) {
        
        Map<Character, Integer> hm = new HashMap<>();
        
        StringBuilder sb = new StringBuilder();
        
        for (char t : T.toCharArray()){
            
            if(!hm.containsKey(t)){
                
                hm.put(t, 1);
            }
            
            else
                hm.put(t, hm.get(t)+1);
            
            
        }
        
        for (char s : S.toCharArray()){
            
            if(hm.containsKey(s)){ 
                for (int i=0;i<hm.get(s);i++){
                    
                    sb.append(s);
                    
                }
                hm.remove(s);
                
                
            }
        }
            for( char c : hm.keySet()){
                
                for(int i=0; i<hm.get(c);i++){
                    
                    sb.append(c);
                }
            }
        
        return sb.toString();
            
        
        
    }
}