package lca;
class Node{
  int data;
  Node left;
  Node right;

  Node(int n)
  {
    this.data = n;
    this.left = null;
    this.right = null;

  }

} //end of class Node




class BinaryTree
{
  Node root;
  Node lca(Node node, int n1, int n2)
  {
    if (node.data<n1 && node.data<n2)
      return lca(node.right, n1, n2);
    if (node.data>n1 && node.data > n2)
      return lca(node.left, n1, n2);
  
    return node;
  }


  public static void main(String[] args)
  {
    BinaryTree bt = new BinaryTree();
    bt.root = new Node(20);
    bt.root.left = new Node(8);
    bt.root.right = new Node(22);
    bt.root.left.left = new Node(4);
    bt.root.left.right = new Node(12);
    bt.root.left.right.left = new Node(10);
    bt.root.left.right.right = new Node(14);
    int n1 = 10;
    int n2 = 14;
    Node result = bt.lca(bt.root,n1,n2);
    System.out.println(result.data);
  
  } //end of main


} // end of class binary tree
