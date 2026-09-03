class Solution {
    boolean isPalindrome(String s) {
        // code here
        int l = 0;
        int n = s.length()-1;
        int r = n;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)) return false;
            else{
                l++;
                r--;
            }
        }
        return true;
        
    }
}