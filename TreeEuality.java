public class TreeEuality {
  public static boolean equality(TreeNode p, TreeNode q){
    if(p == null && q == null){
       return true;
    }
    if(p != null && q != null){
      if(p.key == q.key && equality(p.left, q.left) && equality(p.right, p.right))  
        return true;
    }
    return false;
  }
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(8);
    root.right.right = new TreeNode(5);
    root.right.right.right = new TreeNode(7);

    TreeNode root2 = new TreeNode(1);
    root2.left = new TreeNode(2);
    root2.right = new TreeNode(3);
    root2.right.left = new TreeNode(4);
    root2.right.right = new TreeNode(5);
    root2.right.right.right = new TreeNode(7);
    boolean result = TreeEuality.equality(root, root2);
  
    if(result) System.out.println("Equal tree");
    else 
      System.out.println("Not equal Tree");
    
  }
}
