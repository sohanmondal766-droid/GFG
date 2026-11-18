class Solution {
    public static boolean isPalinArray(int[] arr) {
        // code here
        int n =arr.length;
        
        for(int i = 0; i<n; i++){
            int temp = arr[i];
            int rev =0;
            
            while(arr[i]>0){
                int digit = arr[i]%10;
                rev = rev*10+digit;
                arr[i] = arr[i]/10;
                
            }
            
            if(temp != rev) return false;
            
        }
        
        return true;
    }
}