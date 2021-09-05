public class TreeInvert {
  public static void invert(TreeNode root){
    if(root == null) return;
    invert(root.left);
    invert(root.right);
    TreeNode tempNode = root.left;
    root.left = root.right;
    root.right = tempNode;
  }
  public static void printtree(TreeNode root){
    if(root == null) return;
    printtree(root.left);
    System.out.print(root.key+ " ");
    printtree(root.right);
  }
  public static void main(String[] args){
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(5);
    System.out.print("Before invert");
    printtree(root);
    System.out.print("After invert");
    TreeInvert.invert(root);
    printtree(root);
  }
}
    


