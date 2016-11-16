import java.util.LinkedList;
import java.util.ArrayList;
class Node{
  int data;
  LinkedList<Node> adjList = new LinkedList<Node> ();

  Node(int data){
    this.data = data;
  }

}

class Edge{

  int weight ;
  int source;
  int dest;

  Edge(int u, int v, int w)
  {
    this.source = u;
    this.dest = v;
    this.weight = w;
  }

 


}

class Graph{
  ArrayList<Node> vertices = new ArrayList<Node>();
  ArrayList<Edge> edges = new ArrayList <Edge> ();
  Node root;
  void addNode(Node temp)
  {
    vertices.add(temp);
  
  }
  void addNode(int[] nodeList )
  {
    for(int item : nodeList)
    {
      this.addNode(new Node(item));
    }
  
  }
  void addEdge(Node u, Node v, int w)
  {
    //bidirectional
    //
    u.adjList.add(v);
    v.adjList.add(u);
    Edge e = new Edge(u,v,w);
  
  }
  Node getNode(int id)
  {
    for (Node temp: this.vertices)
    { 
      if (temp.data == id)
        return temp;
    }
    return null;
  }

  void addEdge(int u, int v)
  {
    Node U = getNode(u);
    Node V = getNode(v);
    this.addEdge(U,V);
  
  }
  Graph(Node temp){
    this.root = temp;
    addNode(this.root);
  }
  



  //driver program 
  //
  public static void main(String[] args)
  {
    Graph g = new Graph(new Node(0));
    g.addNode(new int [] {1,7,2,8,6,3,5,4});
    g.addEdge(0,1);
  
  } //end of main
  




} 
