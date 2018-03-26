package task4;
import java.util.*;
public class TestDemo {

	public static void main(String[] args)throws CloneNotSupportedException {
	Demo d1=new Demo("john", 4);
	Demo d2=new Demo("john", 4);
	
if(d1.equals(d2)) {
	System.out.println("Both objects are equal using equals()");
}else {
	System.out.println("Both objects are not equal using equals()");}

	// comparing above created Objects.
 if(d1.hashCode() == d2.hashCode()){
	 System.out.println("Both objects are equal using hashcode");
    }else {
    	System.out.println("Both objects are not equal using hashcode");}
//textually representation of the object.
System.out.println("tostring of the object :"+d1.toString());

//getClass() method returns the runtime class of an object.
// print the class of d1
System.out.println("current running class object is: " + d1.getClass());


//Object cloning refers to creation of exact copy of an object. 
//It creates a new instance of the class of current object and initializes all
//its fields with exactly the contents of the corresponding fields of this object.
Demo d3=(Demo)d1.clone();
System.out.println("d1 id :"+d1.id+"  d3 id :"+d3.id);
d3.id=5;

System.out.println("d1 id :"+d1.id+"  d3 id :"+d3.id);


//finalize() is called by the garbage collector on an object when garbage 
//collection determines that there are no more references to the object.

//System.out.println("Finalizing...");
//d3.finalize();
//
//System.out.println("Finalized.");

	
	
	}

}
