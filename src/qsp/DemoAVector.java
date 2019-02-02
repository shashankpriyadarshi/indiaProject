package qsp;
import java.util.*;

public class DemoAVector {

	public static void main(String[] args) {
	ArrayList<String> lst = new ArrayList<String>();
	lst.add("pune");
	lst.add("begaluru");
	lst.add("mumbai");
	
	ListIterator<String> litr = lst.listIterator();
	
	while(litr.hasNext()) {
		String city = litr.next();
		int pi  = litr.nextIndex();
		int ni = litr.previousIndex();
		System.out.println(pi+"----"+city+"-----"+ni);
		
		
		
	}
		
		

	}

}
