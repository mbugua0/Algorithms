import java.util.ArrayList;
import java.util.Iterator;

public class VowelSubString {

	/**
	 * @param args
	 */
	/*
	 * Complete the 'findSubstring' function below.
	 * 
	 * The function is expected to return a STRING. The function accepts
	 * following parameters: 1. STRING s 2. INTEGER k
	 */

	public static String findSubstring(String s, int k) {
		// public static void findSubstring() {
		// Write your code here
		// String s= "caberqiitefg";
		// int k =5;
		int begin = 0;
		String sub = null;
		String solution = null;

		ArrayList<String> subs = new ArrayList<String>();

		int prev = 0;

		while (begin <= s.length() - k) {
			sub = s.substring(begin, begin + k);
			subs.add(sub);
			begin++;
		}
		Iterator<String> iter = subs.iterator();

		while (iter.hasNext()) {
			String find = iter.next();
			int count = 0;

			for (int i = 0; i < find.length(); i++) {
				char ch = find.charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
						|| ch == 'u') {

					count++;
				}
			}
			// System.out.println(find);
			// System.out.println(count);
			if (count > prev) {
				solution = find;
				prev = count;
			}
			find = null;
			count = 0;
		}
		if (solution == null) {
			return "Not found!";
			// System.out.println("Not found!");
		} else {
			return solution;
			// System.out.println(solution);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "caberqiitefg";
		int k = 5; //answer = 'erqii'
		//String s = "aeiouia";
		//int k =3; //answer = 'aei'

		String result = findSubstring(s, k);
		System.out.println(result);
		// findSubstring();
	}

}
