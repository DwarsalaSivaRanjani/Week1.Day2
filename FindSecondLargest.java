package assignment.week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		int length=data.length;

		Arrays.sort(data);

		System.out.println("Sorted Array");
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		System.out.println("The Second Largest Number is:" + data[length - 2]);
	}
}



