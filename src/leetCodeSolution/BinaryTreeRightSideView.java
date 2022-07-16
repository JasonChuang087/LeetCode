package leetCodeSolution;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
	 /*Test Case
	 * input output
	 * [1,2] [1,2]
	 * [1,2,3,4] [1,3,4]
	 * [1,2,3,null,5,6] [1,3,6]
	 * [6,1,null,null,3,2,5,null,null,4] [6,1,3,5,4]
	 * */
	static int maxLevel = -1;
    static int res = -1;
	public static void main(String[] args) {
//		TreeNode d = new TreeNode(6);
//		TreeNode c = new TreeNode(5);
//		TreeNode b = new TreeNode(3,d,null);
//		TreeNode a = new TreeNode(2,null,c);
		TreeNode a = new TreeNode(2);
		TreeNode root = new TreeNode(1,a,null);
		System.out.println(rightSideView(root));
	}
    
    public static List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        rightSideView(root, 0, list);
        
        return list;
    }
    
    public static void rightSideView(TreeNode root, int level, ArrayList<Integer> list) {
        if(root == null) return;

        if(list.size() == level)
            list.add(root.val);
        System.out.println(root.val);
        System.out.println(list);
        
        rightSideView(root.right, level + 1, list);
        rightSideView(root.left, level + 1, list);
        
    }
    
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

}
