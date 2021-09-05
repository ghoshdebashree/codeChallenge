import java.util.List;
import java.util.ArrayList;
public class InoorderWithList {

  public static List<Integer> inorderTraversal(TreeNode root){
    List<Integer> list = new ArrayList<>();
    if(root!= null) traverse(root, list);
    System.out.println(list);
    return list;
  }
  public static void traverse(TreeNode root, List<Integer> list){
    if(root == null) return;
    traverse(root.left, list);
    list.add(root.key);
    traverse(root.right, list);
  }
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(3);
    System.out.println("Inorder traversal");
    inorderTraversal(root);
   
  }

}
