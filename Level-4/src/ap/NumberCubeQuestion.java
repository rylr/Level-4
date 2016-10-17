package ap;

public class NumberCubeQuestion {
	public static int[] getCubeTosses(NumberCube cube, int numTosses) {
		return cube.getValues();
	}

	public static int getLongestRun(int[] values) {
		int ctr = 0;
		int index = 0;
		int maxCount = 0;

		for (int i = 0; i < values.length - 1; i++) {
			int a = values[i];
			int b = values[i + 1];

			if (a == b) {
				if (ctr == 0)
					index = i;
				ctr++;
			} else {
				if (ctr > maxCount)
					maxCount = ctr;
				ctr = 0;
			}
		}
		return index;
	}
}
