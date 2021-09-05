public class TraversalTreeeasy {
  public static void inorderPrint(TreeNode root){
    if(root == null) return;
    inorderPrint(root.left);
    System.out.println(root.key+ " ");
    inorderPrint(root.right);
  }
  public static void PostorderPrint(TreeNode root){
    if(root == null) return;
    PostorderPrint(root.left);
    PostorderPrint(root.right);
    System.out.println(root.key+ " ");
  }
  public static void PreorderPrint(TreeNode root){
    if(root == null) return;
    System.out.println(root.key+ " ");
    PreorderPrint(root.left);
    PreorderPrint(root.right);
  }
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);
    System.out.println("Tree traversal in inOrder");
    inorderPrint(root);
    System.out.println("Tree traversal in PostOrder");
    PostorderPrint(root);
    System.out.println("Tree traversal in PreOrder");
    PreorderPrint(root);

  }
}
