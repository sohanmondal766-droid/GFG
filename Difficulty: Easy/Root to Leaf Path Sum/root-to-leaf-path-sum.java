/* A Binary Tree node
class Node {
	int data;
	Node left;
	Node right;
	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}
*/

class Solution {
	boolean hasPathSum(Node root, int target) {
		// code here
		if(root == null) return false;
		if(root!=null && root.left == null && root.right == null){
		    if(root.data == target) return true;
		}
		
		return hasPathSum(root.right,target-root.data) || hasPathSum(root.left,target-root.data);
	}
}
