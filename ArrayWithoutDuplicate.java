package assignmentweek3.day2;

import java.util.ArrayList;
import java.util.List;

public class ArrayWithoutDuplicate {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int[] arr = {2,3,5,8,9,1,3,4,9};
				List<Integer> array=new ArrayList<Integer>();
				List<Integer> Dup=new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
				Dup.add(arr[i]);
		}
			}
			array.add(arr[i]);
		}
		array.removeAll(Dup);
		System.out.println("Elements after removing Duplicats : "+array);
	}

}
