public class Edge{
  private final String id;
  private final Vertex source;
  private final Vertex destination;
  private final int weight;


  Edge(String id, Vertex u, Vertex v, int w)
  {
    this.id = id;
    this.source = u;
    this.destination = v;
    this.weight = w;
  
  }


  public Vertex getSource(){ return this.source;}
  public Vertex getDestination(){ return this.destination;}
  public int getWeight(){ return this.weight;}
  public String getId(){ return this.id;}

  @Override
  public String toString(){
    return this.source + " " + this.destination; 
  
  }


} //end of class
