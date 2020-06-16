package iqbalvai;
public class MethodConcept {
	
	static int abc=100;

	
	public static void teststatic(){
		
		System.out.println("This is the static method 1"+abc);
		
	}
		
	public void test2(){
		
		System.out.println("This is a non static method 22"+abc);
	}
	
	
	public void calmethod(){
		
		System.out.println(20+30);
		
	}
		
public void calparameter(int a,int b,int c){
		
		System.out.println(a+b+c);
		int xy=200;
		
		System.out.println(a+b+c+xy);
	}
public int return1(int a,int b){
		
		
		int xy=200+a+b;
		return xy;
		

	}
public static void main(String[] args) {
		
		MethodConcept mc=new MethodConcept();
		
	//	teststatic();
		//mc.test2();
		//mc.teststatic();
		//mc.calmethod();
		//mc.calparameter(100, 200, 300);
		//mc.calparameter(4000, 4345,100);
		//System.out.println(abc);
		
		int tt=mc.return1(100, -100)-abc;
		System.out.println(tt);
		
		//System.out.println(mc.return1(100, 200));
		System.out.println("Pronting Method Return1:"
				+ ""+" "+mc.return1(-100,100));
		

	}
}