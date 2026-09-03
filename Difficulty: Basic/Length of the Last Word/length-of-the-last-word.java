class Solution {
    public int lastWordLen(String s) {
        // code here
        int count = 0;
        String str = s.trim();
        int i = str.length()-1;
        while(i >= 0 && str.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }
}