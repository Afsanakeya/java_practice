package iqbalvai;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class array  {

	public static void main(String[] args) {

		List x=new ArrayList();	
		x.add(34);
		x.add(36);
		x.add(38);
		x.add("keya");
		System.out.println(x);
		x.remove(1);
		System.out.println(x);
		System.out.println(x.contains(33));
		x.clear();
		System.out.println(x);
		
		
		List y =new ArrayList();
		y.add(33);
		y.add(44);
		System.out.println(y);
		//System.out.println(x.get(0));
		/*for(int i=0;i<x.size();i++) {
	System.out.println(x.get(i));
}*/

		/*Iterator son=x.iterator();
 while(son.hasNext()) {
	 System.out.println(son.next());
 }
		 */


	}

}
