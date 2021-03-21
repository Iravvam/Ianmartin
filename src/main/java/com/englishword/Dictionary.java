package com.englishword;

public class Dictionary {

	public static void isEnglishWord(String word) {

		String[] englishwords = { "a", "as", "and", "also", "am", "are", "ant", "ass", "also", "angle", "be", "but",
				"bye", "big", "bar", "bus", "bun", "burn", "bat", "ban", "can", "cat", "come", "cab", "car", "cow",
				"cold", "call", "card", "could", "do", "did", "don", "dog", "dour", "dart", "den", "dig", "dim", "door",
				"dumb", "ear", "eat", "eagle", "earn", "enter", "empty", "egg", "escape", "engine", "ensure", "fun",
				"for", "far", "fold", "firm", "fame", "funnel", "famous", "find", "found", "first", "go", "gum", "game",
				"gamble", "gun", "got", "get", "gone", "group", "gas", "grand", "gut", "his", "he", "him", "her", "how",
				"have", "humble", "horse", "hare", "hound", "hop", "hug", "i", "in", "inn", "inert", "invisible",
				"inside", "inept", "indeed", "intent", "ingot", "jug", "jam", "jar", "juggle", "just", "joke", "jazz",
				"jumble", "joker", "justice", "junior", "work", "king", "going", "working", "kin", "rig",  "on",
				"wig", "wing", "win", "Wring", "won", "worn", "ring" };

		for (int j = 0; j < englishwords.length; j++) {
			String A = englishwords[j];

			if (A.equals(word)) {
				System.out.println(A);
			}
			
		}

	}

}


