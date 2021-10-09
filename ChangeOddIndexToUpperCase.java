package assignment.week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";
		char[] ch = test.toCharArray();

		for (int i = 0; i < ch.length; i++) {

			if (i % 2 == 0) {
				// System.out.println(ch[i]);
				System.out.println(Character.toUpperCase(ch[i]));
			}
		}

	}

}
