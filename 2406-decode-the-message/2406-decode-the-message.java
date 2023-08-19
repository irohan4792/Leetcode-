class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> hm = new HashMap<>();
        StringBuilder res = new StringBuilder();
        key = key.replaceAll(" ","");
        char cur = 'a';
        for(int i = 0 ; i < key.length() ; i++){
            if(!hm.containsKey(key.charAt(i))){
                hm.put(key.charAt(i), cur++);
            } 
        }
        for(int i = 0 ; i < message.length() ; i++){
            if(hm.containsKey(message.charAt(i))){    
                res.append(hm.get(message.charAt(i)));
            } 
            else{
             res.append(message.charAt(i));
            }
        }
        return res.toString();
    }
}