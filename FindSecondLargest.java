package assignmentweek3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {18,19,20,21,31};
		List<Integer> A=new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			A.add(data[i]);
		}
		Collections.sort(A);
		int l=A.size();
		System.out.println("Second Largest number is : "+(A.get(l-2)));
	}
}
