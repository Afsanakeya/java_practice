package iqbalvai;

public class parametrvalue {

	//Create a method with passing two parameters and call twice with different values in the main method 
	
public int calparameter(int a,int b){
		
		int x=a+b;
		return x;
	}	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		parametrvalue bad=new parametrvalue();
	
	
	System.out.println( bad.calparameter(100, 200));
	
	System.out.println(bad.calparameter(300, 500));
	
	
	
	}

}
