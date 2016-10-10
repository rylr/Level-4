package loops;

import java.util.Stack;

public class SequenceFinder {
	public static void main(String[] args) {
		int n = 50;
		boolean operator = true;
		Stack<Integer> seq = new Stack<Integer>();
		seq.push(n);
		while(n > 0) {
			if(n % 2 == 0) {
				n /= 2;
				operator = true;
			}
			else if(n % 2 == 1) {
				n -= 1;
				n /= 2;
				operator = false;
			}
			seq.push(n);
			if(operator == true)
				System.out.print('A');
			else if(operator == false)
				System.out.print('B');
		}
		System.out.println();
		int x = seq.size();
		for(int i = 0; i <= x-1; i++) {
			System.out.println(seq.pop());
		}
	}
}	