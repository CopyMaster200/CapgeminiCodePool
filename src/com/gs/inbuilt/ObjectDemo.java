package com.gs.inbuilt;

import com.gs.prog.Students;

public class ObjectDemo {

	public static void main(String[] args) {
		Object obj = new Object();
		Object obj1 = obj;
		
		//In toString() method we will get class name and Hex representation of hash code of object.
		System.out.println("toString() : "+obj.toString());
		System.out.println(obj.getClass().getName()+"@"+Integer.toHexString(obj.hashCode()));
		
		/*hashcode() - For every object, JVM generates a unique number which is hashcode.
		 * It returns the hash value that is used to search the objects in the collection.
		 * The main advantage of saving objects based on hash code is that searching becomes easy.
		*/
		
		System.out.println("hashcode() : "+obj.hashCode());
		
		/* equals(Object obj) - By default it will compare the obj with "this" object.
		 * It is always suggested whenever we override equals method we have to override hashcode method also
		 * to maintain the contract of different objects will have different hash codes.
		*/
		Students stu = new Students(1, "Jack", 50);
		Students stu2 = new Students(2, "John", 55);
		System.out.println(stu.equals(stu2));
		
		/* getClass() - It returns the class object of “this” object and is used to get the actual runtime 
		 * class of the object. It can also be used to get metadata of this class.
		 * */
		System.out.println("getClass() : "+obj.getClass());
		System.out.println("getClass() : "+stu.getClass());
		
		
	}

}

