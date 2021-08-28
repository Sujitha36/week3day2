package assignmentweek3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCollections {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = {"Aspire systems", "Cts", "Wipro", "Hcl"};
		System.out.println("Array length is : " + array.length);
		List<String> Alist = new ArrayList<String>(Arrays.asList(array));
		Collections.sort(Alist);
		//System.out.println(List);
		  for (int i=(Alist.size()-1); i>=0; i--) { 
			  System.out.print(Alist.get(i)+" ");
		}	
	}
}
