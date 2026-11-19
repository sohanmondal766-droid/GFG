class Solution {
    int[] pushZerosToEnd(int[] arr) {
        // code here
        int[] ans = new int[arr.length];
        int j = arr.length-1;
        int n = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=0) {
                ans[n]=arr[i];
                n++;
            }
            
            else{
                ans[j] = 0;
                j--;
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = ans[i];
        }
        return arr;
        
    }
}