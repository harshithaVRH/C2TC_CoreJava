// program to demonstrate fully qualified name
package com.tnsif.lesson3c;
import com.tnsif.lesson3b.Two;

public class Three {
	
	public void dispOutput()
	{
		System.out.println("I am three");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Two obj = new Two();	
		obj.dispOutput();

		Three obj1 = new Three();	
		obj1.dispOutput();

	}

}
