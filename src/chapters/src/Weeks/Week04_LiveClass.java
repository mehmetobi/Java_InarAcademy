package Weeks;
/*
* length(): Returns the length of the specified string.
* 
* substring(): Returns the substring from the specified string.
* 
* equalsIgnoreCase(): Compares two strings ignoring case differences.
* 
* contains(): Checks if a string contains a substring.
* 
* trim(): Returns thesubstring after removing any leading and trailing
* whitespace from the specified string.
* 
* charAt(): Returns the character at specified index.
* 
* toLowerCase(): Converts string characters to lower case.
* 
* toUpperCase():Converts string characters to upper case. concat():
* Concatenates two strings.
* 
* split(): Split/divide the string at the specified regex.
* 
* compareTo():Compares two strings on the basis of the Unicode value of each
* string character.
* 
* compareToIgnoreCase(): Similar to compareTo, but it also ignores case
* differences. 
*/

public class Week04_LiveClass {

	public static void main(String[] args) {
		stringMetotdeneme();
		substring();
		_equalsIgnoreCase();
		_contains();
		_trim();
		charAt();
		toLowerCase();
		toUpperCase();
		print_wovel("emre");
	}

	public static void stringMetotdeneme() {

		String temp = "I love Inar Academy";

		int lenght_of_word = temp.length();

		System.out.println(lenght_of_word);

	}

	public static void substring() {

		String temp = "Inar Academy";

		String new_word = temp.substring(2);

		System.out.println(new_word);

	}

	public static void _equalsIgnoreCase() {

		String temp = "I love Inar Academy";

		boolean is_correct = temp.equalsIgnoreCase("I love Inar Academy");

		System.out.println(is_correct);

	}

	public static void _contains() {

		String temp = "I love Inar Academy";

		boolean is_correct = temp.contains("emre");

		System.out.println(is_correct);

	}

	public static void _trim() {

		String temp = "I love Inar Academy   ";

		String new_word = temp.trim();

		System.out.println(new_word);

	}

	public static void charAt() {

		String temp = "I love Inar Academy   ";

		char new_word = temp.charAt(5);

		System.out.println(new_word);

	}
	public static void toLowerCase() {

		String temp = "I love Inar Academy   ";

		String new_word = temp.toLowerCase();

		System.out.println(new_word);

	}
	public static void toUpperCase() {

		String temp = "I love Inar Academy   ";

		String new_word = temp.toUpperCase();

		System.out.println(new_word);

	}
public static String _stringecevirme (int x ) {
	
	String temp = "" + x;
	
	return temp;
	
}

public static void _test1() {
	
	int x = -123;
	System.out.println(_stringecevirme(x));
	
}

public static void _test2() {
	
	int x = 123;
	System.out.println(_stringecevirme(x));
	
}

public static void _test3() {
	
	int x = 0;
	System.out.println(_stringecevirme(x));
	
}

public static void print_wovel(String word) {
	
	String lower_word = word.toLowerCase();
	int length_of_word = lower_word.length();
	
	for(int i = 0; i < length_of_word; i++) {
		char letter = lower_word.charAt(i);
		if(letter == 'b' || letter == 'c' || letter == 'd' ||letter == 'f' ||letter == 'g' ||letter == 'h' || 
				letter == 'j' || letter == 'k' || letter == 'l' || letter == 'm' || letter == 'n' || 
				letter == 'p' || letter == 'r' || letter == 's' || letter == 't' || letter == 'x' || letter == 'y' ||letter == 'z') {
			System.out.print(letter);
		}
		
	}
		
}



}
