package iqbalvai;

public class thisconcept {
	
	static int a;
	
	
	public static void main (String[]args){
	
	
		
		
	thisconcept abc=new thisconcept();
    abc.class1(20);
    System.out.println(a);
    
	thisconcept xyz=new thisconcept();
	xyz.class2(500);
	

	}
	
	public void class1  (int a) {
	this.a=a;}
	
	
	
		
		
		public void class2 (int b) {
		
			System.out.println(a+b);
			
			
		}
	
}
		
	


 