package com.evergent.corejava.string.immutable;
final class ImmutableString{
	private final String value;

	public ImmutableString(String value) {
		this.value = value;
	}
	public String toString()
	{
		return value;
	}
	
}
public class MyData {
	public static void main(String[] args) {
		ImmutableString str=new ImmutableString("hello String world...");
		System.out.println(str.toString());
	}
	

}