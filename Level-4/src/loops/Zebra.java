package loops;

public class Zebra {
	public static void main(String[] args) {
		int i = 2;
		while(true) {
			if(i % 2 == 0)
				System.out.println("black");
			else if(i % 2 == 1)
				System.out.println("white");
			i++;
		}
	}
}
