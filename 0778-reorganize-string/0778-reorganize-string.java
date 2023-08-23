class Solution {
    public String reorganizeString(String s) {
        if (s.length() < 3) return s;
        
        int cnt[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cnt[s.charAt(i) - 'a']++;
        }
        
        int max = 0;
        int letter = 0;
        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] > max) {
                max = cnt[i]; // Update max count
                letter = i;   // Update corresponding letter
            }
        }
        
        if (max > (s.length() + 1) / 2) return "";
        
        char res[] = new char[s.length()];
        int id = 0;
        
        // Fill even indices with the most frequent letter
        while (cnt[letter]-- > 0) {
            res[id] = (char) (letter + 'a');
            id += 2;
        }
        
        // Fill remaining indices
        for (int i = 0; i < cnt.length; i++) {
            while (cnt[i]-- > 0) {
                if (id >= res.length) id = 1; // Wrap around to odd indices
                res[id] = (char) (i + 'a');
                id += 2;
            }
        }
        
        return String.valueOf(res);
    }
}
