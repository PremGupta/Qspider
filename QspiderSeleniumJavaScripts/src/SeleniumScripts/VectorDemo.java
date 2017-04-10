package SeleniumScripts;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		
		//Initial size is 3, increament is 2
 Vector v=new Vector(3,2);
 System.out.println("Initial size : "+v.size());
 System.out.println("Initial Capacity : "+v.capacity());
 v.addElement(new Integer(1));
 System.out.println("szie after 1 addition : "+v.size());
 System.out.println("Capacity after 1 addition : "+v.capacity());
 v.addElement(new Integer(2));
 System.out.println("szie after 2 addition : "+v.size());
 System.out.println("Capacity after 2 addition : "+v.capacity());
 v.addElement(new Integer(3));
 System.out.println("szie after 3 addition : "+v.size());
 System.out.println("Capacity after 3 addition : "+v.capacity());
 v.addElement(new Integer(4));
 System.out.println("szie after 3 addition : "+v.size());
 System.out.println("Capacity after 4 addition : "+v.capacity());
 v.addElement(new Double(5.45));
 System.out.println("Current Capacity : "+v.capacity());
 v.addElement(new Double(6.08));
 v.addElement(new Double(7));
 System.out.println("Current Capacity : "+v.capacity());
 v.addElement(new Float(9.4));
 v.addElement(new Integer(10));
 System.out.println("Current Capacity : "+v.capacity());
 v.addElement(new Integer(11));
 v.addElement(new Integer(12));
 System.out.println("First Element :"+(Integer)v.firstElement());
 System.out.println("Last Element :"+(Integer)v.lastElement());
 
 if (v.contains(new Integer(3)))
	 System.out.println("Vector contains 3");
	 
	 //enumerate the elements in the vector
 Enumeration vEnum =v.elements();
System.out.println("\n Elements in vector : ");
 while (vEnum.hasMoreElements()) {
	System.out.println(vEnum.nextElement()+ "");
	System.out.println();
	
}
	

	}

}