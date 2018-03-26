package task4;

public class Demo implements Cloneable{
	   
    public String name;
    public int id;
         
    Demo(String name, int id) 
    {
             
        this.name = name;
        this.id = id;
    }
    //Indicates whether some other object is "equal to" this one.
    public boolean equals(Object obj)
    {
         
    if(this == obj)
            return true;
         
    if(obj == null || obj.getClass()!= this.getClass())
            return false;
         
     
        Demo demo=(Demo) obj;
         
       
        return (demo.name == this.name && demo.id == this.id);
    }
     
  //Returns a hash code value for the object. This method is supported for the benefit of hash tables such as those provided by HashMap
    public int hashCode()
    {
         
        return this.id;
    }
    
    public Object clone() throws
    CloneNotSupportedException
{
return super.clone();
}
     

}
