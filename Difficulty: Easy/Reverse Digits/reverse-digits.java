class Solution {
    public int reverseDigits(int n) {
        // Code here
        int ans = 0;
        int r = 0;
        while(n>0){
            r = n%10;
           
            ans = ans*10+r;
            n = n/10;
            
        }
        return ans;
    }
}