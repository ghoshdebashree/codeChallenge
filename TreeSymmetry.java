public class TreeSymmetry {
  public static boolean symmetry(TreeNode t, TreeNode r){
    if(t == null && r == null) return true;
    if(t == null || r == null) return false;
    if(t.key != r.key) return false;
    else
         if(t.key == r.key && symmetry(t.left, r.right)&& symmetry(r.left, t.right)) 
           return true;
         
         return false;
      }
  
  
  public static void main(String[] args) {
    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(3);
    root1.right.left = new TreeNode(4);
    root1.right.right = new TreeNode(5);
    TreeNode root2 = new TreeNode(1);
    root2.left = new TreeNode(3);
    root2.right = new TreeNode(2);
    root2.right.left = new TreeNode(5);
    root2.right.right = new TreeNode(4);
    
    boolean result = symmetry(root1, root2);
    if(result) System.out.println("Symmetric");
    else{
      System.out.println("Not Symmetric");
    }
  }
}

