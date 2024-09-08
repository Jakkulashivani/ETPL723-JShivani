package com.evergent.corejava.exceptionhandling;
/*3. All Exceptions are executed while abnormal condiotions only
 * 4. Normal flow it won't execute any exceptions.
 * 5.once any exceptions are occurring in java then remaining lines of code is unreachable.
 */
public class ExceptionDemo2 {
	String name="null";
	public void myData()
	{
		try {
			System.out.println("One");
			System.out.println(name.length());
			System.out.println("End");
		}
		catch(NullPointerException e)
		{
			System.out.println("I can handle "+e);
		}
	}
	public static void main(String[] args) {
		ExceptionDemo2 ed2=new ExceptionDemo2();
		ed2.myData();
	}

}
