package com.conctructors;

public class Students {
	
	int rollNumber;
	String name;
	
	public Students(){
		System.out.println("Hi! This is mohanbabu");
	}
	
	public Students(int i,String n){
		rollNumber=i;
		name=n;
	}
	
	public void display(){
		System.out.println("RollNumber is: "+rollNumber+" Name is: "+name);
	}
	
	public static void main(String[] args) {
		Students s=new Students();
		Students s1=new Students(10,"ram");
		Students s2=new Students(11,"raj");
		Students s3=new Students(12,"rao");
		
		s1.display();
		s2.display();
		s3.display();
	}

}
