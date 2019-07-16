
public class C2F {
	float celsiusToFahrenheit(float celsius) {
		return celsius*9/5 + 32;
	}
	float fahrenheitToCelsius(float fahrenheit) {
		return (fahrenheit - 32)*5/9;
	}
	boolean isNotValidArgument(String[] args) {
		float firstArgument, secondArgument;
		if(args.length != 2) {
			return true;
		}
		try {
			firstArgument = Float.parseFloat(args[0]);
			secondArgument = Float.parseFloat(args[1]);
		}catch(Exception e) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		float firstArgument, secondArgument;
		C2F c2f = new C2F();
		if(c2f.isNotValidArgument(args)) {
			System.out.println("Only Two Number Required");
		}else {
			firstArgument = Float.parseFloat(args[0]);
			secondArgument = Float.parseFloat(args[1]);
			if(firstArgument == 0) {
				System.out.println(c2f.celsiusToFahrenheit(secondArgument));
			}else {
				System.out.println(c2f.fahrenheitToCelsius(secondArgument)); 
			}
		}
		
	}

}
