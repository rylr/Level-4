package threads;

public class Test {
	public static void main(String[] args) throws InterruptedException{
		int[] primes1 = new int[1000];
		int[] primes2 = new int[1000];
		
		Thread t1 = new Thread(() -> { 
			boolean running = true;
			int count = 1;
			int num = 3;
			primes1[0] = 2;
			while(running) {
				if(isPrime(num)) {
					primes1[count] = num;
					count++;
				}
				num++;
				
				if(count == 1000)
					running = false;
			}
			System.out.println("Thread t1 Complete");
		});
		
		Thread t2 = new Thread(() -> { 
			boolean running = true;
			int count = 1;
			int num = 3;
			primes2[0] = 2;
			while(running) {
				if(isPrime2(num)) {
					primes2[count] = num;
					count++;
				}
				num+=2;
				
				if(count == 1000)
					running = false;
			}
			System.out.println("Thread t2 Complete");
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("ngjhg");
	}
	
	static boolean isPrime(int num) {
		for(int i = 2; i < num; i++)
			if(num % i == 0)
				return false;
		return true;
	}
	
	static boolean isPrime2(int num) {
		for(int i = 2; i < Math.sqrt(num); i++)
			if(num % i == 0)
				return false;
		return true;
	}
}
