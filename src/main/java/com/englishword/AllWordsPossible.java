package com.englishword;

public class AllWordsPossible {

	public static void main(String[] args) {
		String s = "working";
		initiate(s);
	}

	static void initiate(String s) {
		permute("", s);
		System.out.println("----------------------------------------- ");
		combo("", s);
		System.out.println("----------------------------------------- ");
	}

	static void combo(String prefix, String s) {
		int N = s.length();

		// System.out.println(prefix.trim());
		Dictionary.isEnglishWord(prefix.trim());

		for (int i = 0; i < N; i++)

			combo(prefix + s.charAt(i), s.substring(i + 1));

	}

	static void permute(String prefix, String s) {
		int N = s.length();

		if (N == 0)

			// System.out.println( prefix);
			Dictionary.isEnglishWord(prefix.trim());
		for (int i = 0; i < N; i++) {

			permute(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, N));
		}

	}

	}


