package loops;

public class DoubleMoney {
	public static void main(String[] args) {
		int money = 1;
		int iterations = 0;
		while(money < 1000000) {
			++iterations;
			money = 2 * money;
		}
		System.out.println(iterations);
	}
}
