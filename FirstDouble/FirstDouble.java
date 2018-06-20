import java.util.*;

public class FirstDouble {

	public static void main(String[] args) {
		HashMap<Character, Character> hm = new HashMap<Character, Character>();
		String s = "abcdefghijklmnsa";

		for (int i = 0; i < s.length(); i++) {
			if (!hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), s.charAt(i));
			} else {
				System.out.println(s.charAt(i));
				break;
			}
		}
	}
}