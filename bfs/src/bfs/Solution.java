package bfs;
import java.util.ArrayList;
import java.util.*;
class Node{
  int data;
  boolean visited;
  ArrayList <Node> adjList = new ArrayList <Node> ();
  Node( int data )
  {
    this.data = data;
    this.visited = false;

  }
  
  void addNode(Node[] temp)
  {
   for (Node item: temp)
     this.adjList.add(item);
  }


}

public class Solution{
  public static void main(String[] args)
  {
    Solution s = new Solution();
    Node n2 = new Node(2);
    Node n0 = new Node(0);
    Node n1 = new Node(1);
    Node n3 = new Node(3);

    n2.addNode(new Node[] {n0,n3});
    n0.addNode(new Node[] {n2,n1});
    n1.addNode(new Node[] {n1,n2});
    n3.addNode(new Node[] {n3});
    System.out.println("bfs");
    //s.bfs(n2);
    System.out.println("dfs");
    s.dfs_util(n2);

    //driver program

  }
  public void dfs_util(Node root)
  {
    //root.visited = true;
    dfs(root);

  }
  public void dfs(Node n)
  {
    n.visited = true;
    System.out.println(n.data);
    for(Node temp: n.adjList) 
    {
      if (temp.visited==false)
         dfs(temp);
    }
  }
  public void bfs(Node root)
  {
  LinkedList <Node> queue = new LinkedList <Node> ();
  queue.add(root);
  root.visited = true;
  while(!queue.isEmpty())
  {
    Node item = queue.poll();
    System.out.println(item.data+",");
    for (Node temp: item.adjList)
    {
       if (temp.visited==false)
         { temp.visited = true;
           //System.out.println(temp.data + ",");
           queue.add(temp);
         }   
    }
    
  
  }


  } //end of bfs

}
