import java.util.Scanner;
import java.math.*;

public class CheckPerfectNumber {
	boolean isPerfectNumber(int n) {
		int sum=1;
		for(int i=2;i <= Math.sqrt(n);i++) {
			if(n%i == 0)
				sum = sum + i + n/i;
		}
		if(sum == n)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input;
		input = sc.nextInt();
		CheckPerfectNumber checkPerfectNumber = new CheckPerfectNumber();
		if(checkPerfectNumber.isPerfectNumber(input))
			System.out.println("Given Number is Perfect Number");
		else
			System.out.println("Given Number is Not a Perfect Number");
	}

}
