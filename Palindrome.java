package assignment.week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				System.out.println("This is not a palindrome");
				System.exit(0);
			}
			i++;
			j--;

		}
		System.out.println("This is a palindrome");

	}
}
