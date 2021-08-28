package assignmentweek3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,5,6,7,8};
		Arrays.sort(arr);
		List<Integer> missing= new ArrayList<Integer>();
		int min=arr[0];
		for (int i = 0; i < arr.length; i++)
		{
			missing.add(arr[i]);
		
			if(!missing.contains(min+i))
			{
				System.out.println("Missing value in Array is : "+(min+i));
				break;
			}
		}}}
