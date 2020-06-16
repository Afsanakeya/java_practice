package iqbalvai;

public class encap2  {

private int rollno;

private String Name;
	


	
	
public int getRollno() {
	return rollno;
}





public void setRollno(int rollno) {
	this.rollno = rollno;
}





public String getName() {
	return Name;
}





public void setName(String name) {
	Name = name;
}





public static void main(String[] args) {


encap2 abc=new encap2();
abc.setRollno(2);

abc.setName("keya");
	
	
	
	System.out.println(abc.getRollno());
	System.out.println(abc.getName());
	
	
	}}
