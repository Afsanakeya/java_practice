package iqbalvai;

public class callingmethod {

//create a non static method with return value
public int add()	{
	
int a=10, b=20;
int x=sub();
int res=a+b+x;
return res;
}
	
//create a non static method with no return value
public void add2() {
	int a=12, b=22;
	callingmethod xyz=new callingmethod();
	int c=xyz.add();
	System.out.println(a+b+c);
	}
	
//create a static method with return value

public static int sub() {

int x=100, y=50;
callingmethod obj=new callingmethod();
int t=obj.add();
int z=x-y-t;

return z;
}

//create a static method with no return value
public static void sub2() {
int x=13, y=34;
int p=sub();//calling static method
System.out.println(x-y-p);
}

public static void main(String[] args) {

//create object
callingmethod abc =new callingmethod();

//calling non static method
int result=abc.add();
System.out.println(result);	//30
//or
System.out.println(abc.add());//30

abc.add2();//34

//calling static method
int a=callingmethod.sub();//34
System.out.println(a);
callingmethod.sub2();//-21

//calling static within static method

sub2();//-71

//calling static in non static method

int res=abc.add();//calling non static method
System.out.println(res);//80

//calling non static in non static method
abc.add2();
//calling non static in static method
int s=callingmethod.sub();
System.out.println(s);
}

}
