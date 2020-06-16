package iqbalvai;

public class javamethod {

public int java() {
	int a=20;
	int b=30;
	int x=a+b;
	return x;
}
	
public void java2() {
	int a=100;
	int b=200;
	System.out.println(a+b);
}
	
public static int mc() {
	int x=300;
	int y=100;
	int z=x-y;
	return y;
	}
public static void  mc2() {
	int x=20;
	int y=10;
	System.out.println(x-y);
}
	
public static void main(String[] args) {
		
javamethod bd=new javamethod();//calling non static method
System.out.println(bd.java());
	
bd.java2();//calling non static method


System.out.println(bd.mc());//calling static method
bd.mc2();//calling static method





	}}
