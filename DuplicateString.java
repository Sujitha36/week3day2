package assignmentweek3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateString {

		String text = "Selenium for automation test in test leaf selenium";
		String[] str = text.split(" ");
		List<String> A = new ArrayList<String>();
		List<String> D = new ArrayList<String>();
		public void list() {
		for (int i = 0; i < str.length; i++) {
			if (A.contains(str[i])) {
				D.add(str[i]);
			} 
			else {
				A.add(str[i]);
			}
		}
	
		System.out.println("String using list : "+A+"\n");
		
		}
		
		public void set() {
			Set<String> A= new LinkedHashSet<String>();
for (int i = 0; i < str.length; i++) {
	A.add(str[i]);
	A.remove(false);
}
System.out.println("String using set : "+A);

				
		}
		public static void main(String[] args) {
			DuplicateString ob=new DuplicateString();
			ob.list();
			ob.set();
	}

}
