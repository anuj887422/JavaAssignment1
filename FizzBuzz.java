public class FizzBuzz {
	boolean isDivisibleByThree(int n){
		return n%3 == 0;
	}
	boolean isDivisibleByFive(int n) {
		return n%5 == 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz fizzBuzz = new FizzBuzz();
		for(int i =1 ; i<=100;i++) {
			if(fizzBuzz.isDivisibleByThree(i) && fizzBuzz.isDivisibleByFive(i))
				System.out.print("FizzBuzz ");
			else if(fizzBuzz.isDivisibleByThree(i))
				System.out.print("Fizz ");
			else if(fizzBuzz.isDivisibleByFive(i))
				System.out.print("Buzz ");
			else
				System.out.print(i + " ");
		}
		System.out.println();
	}

}
