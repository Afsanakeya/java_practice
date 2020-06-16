package iqbalvai;
//Create a method with passing three int parameters and multiply all values inside of the method and 


//return the multiply value then call this method to the main method & add 100 with it and print 

public class parameters2 {

	
	
public int calparameter(int a,int b,int c){
		
		int x=a*b*c;
		return x;
	}	
	
	
	
	
public static void main(String[] args) {
parameters2 p2=new parameters2();

int sum = p2.calparameter(10, 20, 2)+100;

System.out.println("Printing Int Value:"+" "+sum);
	
	
	
	
	
	
	}

}
