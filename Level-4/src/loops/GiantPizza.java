package loops;

public class GiantPizza {
	public static void main(String[] args) {
		int slices = 1046;
		int iterations = 0;
		while(slices > 1) {
			++iterations;
			slices = slices / 2;
		}
		System.out.println(iterations);
	}
}
