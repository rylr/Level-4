package arrays;

public class Sorting {
	public static void sort(String[] words) {
		String hold = "";
		
		for(int i = 0; i < words.length; i++) {
			for(int j = 1; j < words.length - i; j++) {
				int place = words[j].compareTo(words[j-1]);
				if(place < 0) {
					hold = words[j];
					words[j] = words[j-1];
					words[j-1] = hold;
				}
			}
		}
	}
}
