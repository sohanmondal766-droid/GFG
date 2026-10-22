class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        stack.push(arr[n-1]);
        for(int i = n-2;i>=0;i--){
            if(arr[i]>= stack.peek()) stack.push(arr[i]);
            else continue;
        }
        
        while(!stack.isEmpty()){
            list.add(stack.peek());
            stack.pop();
        }
        return list;
    }
}
