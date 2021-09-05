
public class InvertATree {
  public static void invert(TreeNode root) {
    if (root == null) {
      return;
    }

    invert(root.left);
    invert(root.right);

    // Swap time
    TreeNode tempNode = root.left;
    root.left = root.right;
    root.right = tempNode;
  }

  public static void printTreeInOrder(TreeNode root) {
    if (root == null) {
      return;
    }
    printTreeInOrder(root.left);
    System.out.print(root.key + " ");
    printTreeInOrder(root.right);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    root.right.left = new TreeNode(4);
    root.right.right = new TreeNode(5);
    root.right.right.right = new TreeNode(7);
    System.out.println("Before Invert");
    printTreeInOrder(root);

    InvertATree.invert(root);
    System.out.println("Done Inverting, Let's see the tree now!");
    printTreeInOrder(root);
  }
}
