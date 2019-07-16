
public class CollatzSequence {
	boolean isEven(int n) {
		return n%2 == 0;
	}
	
	boolean isOdd(int n) {
		return n%2 == 1;
	}
	
	boolean isNotValidArgument(String[] args) {
		int firstArgument;
		if(args.length != 1) {
			return true;
		}
		try {
			firstArgument = Integer.parseInt(args[0]);
		}catch(Exception e) {
			return true;
		}
		if(firstArgument >= 100)
			return true;
		return false;
	}
	
	void generateCollatz(int n) {
		System.out.print(n + " ");
		do {
			if(isEven(n)) {
				n = n/2;
				System.out.print(n + " ");
			}
			else if(isOdd(n)){
				n = 3*n + 1;
				System.out.print(n + " ");
			}
		}while(n != 1);
	}
	
	public static void main(String args[]) {
		int firstArgument;
		CollatzSequence collatz = new CollatzSequence();
		if(collatz.isNotValidArgument(args)) {
			System.out.println("Only One Number Required");
		}else {
			firstArgument = Integer.parseInt(args[0]);
			collatz.generateCollatz(firstArgument);
		}
	}
}
