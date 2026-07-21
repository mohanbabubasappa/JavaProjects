package com.basics;

public class Variables {
	
	static int i=10;
	String name="mohan";
	boolean status=true;
	char c='A';
	
	
	void method(){
		int j=100;
		String car="benz";
		System.out.println(j);
		System.out.println(car);
	}
	

	public static void main(String[] args) {
		Variables v=new Variables();
		System.out.println(i);
		System.out.println(v.name);
		System.out.println(v.status);
		v.method();
	}

}
