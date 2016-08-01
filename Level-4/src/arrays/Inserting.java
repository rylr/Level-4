package arrays;

public class Inserting {
	public static int[] insertAt(int[] before, int index, int value) {
		int[] after = new int[before.length + 1];
		
		for(int i = 0; i < after.length; i++) {
			if(i < index) {
				after[i] = before[i];
			}
			
			else if(i == index) {
				after[i] = value;
			}
			
			else if(i > index) {
				after[i] = before[i-1];
			}
		}
		return after;
	}
	
	public static void insertAlphabetically(String[] before, String insert) {
		String[] after = new String[before.length + 1];

		boolean flag = false;
		
		for(int i = 0; i < after.length; i++) {
			int prev = insert.compareTo(before[i]);
			
			if(prev < 0)
				after[i] = insert;
			
			else if(prev < 0 && flag == false) {
				after[i] = insert;
				flag = true;
			}
			else if(flag == true) {
				after[i] = before[i-1];
			}
		}

		for(int j = 0; j < after.length; j++)
			System.out.println(after[j]);
			
			
			
			
			/*
			
			if(i < index) {
				after[i] = before[i];
			}
			
			else if(i == index) {
				after[i] = value;
			}
			
			else if(i > index) {
				after[i] = before[i-1];
			}
		}
		
		
		
		for(int i = 1; i < before.length - 1; i++) {
			int prev = before[i].compareTo(before[i-1]);
			//int next = before[i].compareTo(before[i+1]);
			if(prev < 0) {
				
			}
		}
		*/
		
		
	}
}