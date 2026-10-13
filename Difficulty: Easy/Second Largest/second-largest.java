class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int m = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>m){
                s = m;
                m = arr[i];
            }
            else if (arr[i]<m&&arr[i]>s) s = arr[i];
            
        }
        
        if(s == Integer.MIN_VALUE) return -1;
        return s ;
    }
}