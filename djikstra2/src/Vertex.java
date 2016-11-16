public class Vertex {

  final private String id;
  final private String name;

  public Vertex(String id, String name)
  {
    this.id = id;
    this.name = name;
  
  }

  public String getId(){
    return this.id;
  }

  public String getName(){
    return this.name; 
  }
  @Override
  public String toString(){
    return this.name; 
  
  }
  @Override
  public boolean equals(Object obj){
    if (this ==  obj) return true;
    if (obj == null) return false;
    if (this.getClass() != obj.getClass()) return false;
    Vertex other = (Vertex) obj;
    if (this.id == null)
    {
      if (other.id != null) return false;
    }
    else if (this.id.equals(other.id)==false)
      return false;

    return true;

  }
  @Override
  public int hashCode(){
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id==null)?0:id.hashCode()) ;
    return result;
  
  }

  
  } //end of class


