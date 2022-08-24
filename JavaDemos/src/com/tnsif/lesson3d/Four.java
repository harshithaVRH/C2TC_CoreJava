// program to demonstrate import package.*;
package com.tnsif.lesson3d;
import com.tnsif.lesson3b.*;
import com.tnsif.lesson3c.*;
import com.tnsif.lesson3a.One;

public class Four {
	void dispOutput()
	{
		System.out.println("I am Four");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		One obj = new One();	
		obj.dispOutput();

		Two obj1 = new Two();	
		obj1.dispOutput();
		
		Three obj2 = new Three();
		obj2.dispOutput();
		
		Four obj3 = new Four();
		obj3.dispOutput();

	}

}
