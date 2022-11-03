package leetCodeSolution;

public class SameTree {

        public static void main(String[] args) {
                TreeNode p = new TreeNode(1);
                p.left = new TreeNode(2);
                p.right = new TreeNode(1);
                TreeNode q = new TreeNode(1);
                q.left = new TreeNode(2);
                q.right = new TreeNode(2);
                System.out.println(isSameTree(p,q));
        }
        
        public static boolean isSameTree(TreeNode p, TreeNode q) {
                if(p==null&&q==null) {
                        return true;
                }
                else if(p!=null&&q==null) {
                        return false;
                }
                else if(p==null&&q!=null) {
                        return false;
                }
                
                if(p.val!=q.val){
                    return false;
                }
                
                if(p.left!=null&&q.left!=null){
                    if(!isSameTree(p.left,q.left)) {
                            return false;
                    }
                }
                else if (p.left!=null&&q.left==null) {
                        return false;
                }
                else if (p.left==null&&q.left!=null) {
                        return false;
                }

                
                if(p.right!=null&&q.right!=null){               
                    if(!isSameTree(p.right,q.right)) {
                            return false;
                    }
                }
                else if (p.right!=null&&q.right==null) {
                        return false;
                }
                else if (p.right==null&&q.right!=null) {
                        return false;
                }
                
                return true;
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
