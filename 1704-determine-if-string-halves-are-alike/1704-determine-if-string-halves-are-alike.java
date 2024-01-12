class Solution {
  public boolean halvesAreAlike(String s) {
    String a = s.substring(0, s.length() / 2);
    String b = s.substring(s.length() / 2);
    int aVowelsCount = (int) a.chars().filter(c -> isVowel((char) c)).count();
    int bVowelsCount = (int) b.chars().filter(c -> isVowel((char) c)).count();
    return aVowelsCount == bVowelsCount;
  }
  private boolean isVowel(char c) {
    return "aeiouAEIOU".indexOf(c) != -1;
  }
}