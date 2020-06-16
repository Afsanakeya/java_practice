package iqbalvai;
//-Create  three string, int & boolean variable at class level & call them in three static & non-static method 
public class createdata {
	
public static String staticStrinMethod() {
String st1="afsana ";
String st2="keya";
return st1+st2;
}

public String NonStaticStrngMthd() {
String st3="welcome";
String st4=" world";
return st3+st4;
	
}

public static int StaticintMthd() {
int a=10, b=20;
int x= a+b;
return x;
	
}
public int nonStsticintMthd() {
int a=10, b=20;
int x= a+b;
return x;
	
}	
	
	
public static boolean staticbooleanmtd() {
boolean bl=true;
boolean bl1=false;
return bl;

}

public boolean nonstaticbooleanmtd() {
boolean bl3=true;
boolean bl4=false;
return bl4;
}

public static void main(String[] args) {
createdata abc=new createdata();	

System.out.println("Printing Static String"+" "+staticStrinMethod());

System.out.println("printing non static string"+" "+abc.NonStaticStrngMthd());

System.out.println("printing static int"+" "+StaticintMthd());

System.out.println("printing non static int"+" "+abc.nonStsticintMthd());

System.out.println("printing static boolean"+staticbooleanmtd());

System.out.println("printing non static boolean"+" "+abc.nonstaticbooleanmtd());
}

}
