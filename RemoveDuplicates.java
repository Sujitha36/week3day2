package assignmentweek3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "PayPal India";
String S=s.toUpperCase();
char[] ca=S.toCharArray();
Set<Character>charSet = new LinkedHashSet<Character>();
Set<Character>dupCharSet  = new LinkedHashSet<Character>();
for (int i = 0; i < ca.length; i++) {
	  if (charSet.contains(ca[i])) 
	  { 
		  dupCharSet.add(ca[i]);
	  }	
	  else {
		charSet.add(ca[i]);
	}
}
charSet.removeAll(dupCharSet);
charSet.remove(' ');
System.out.println("List after removing duplicates : "+charSet);
System.out.println("Duplicate values are : "+dupCharSet);

	}
}
