class Solution {
    public List<String> letterCombinations(String s) {
        List <String> res = new ArrayList<>();
        if(s.length()==0) return res;
    Map<Character, String> mp = new HashMap<>();
    mp.put('2',"abc");
    mp.put('3',"def");
    mp.put('4',"ghi");
    mp.put('5',"jkl");
    mp.put('6',"mno");
    mp.put('7',"pqrs");
    mp.put('8',"tuv");
    mp.put('9',"wxyz");
    helper(s,0,mp,new StringBuilder(), res);
    return res;
    }
    static void helper(String s, int i, Map<Character, String>mp, StringBuilder sb, List<String>res){
        if(i==s.length()){
            res.add(sb.toString());
            return;
        }
        String cur = mp.get(s.charAt(i));
        for(int j = 0 ; j< cur.length() ; j++){
            sb.append(cur.charAt(j));
            helper(s,i+1,mp,sb,res);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}