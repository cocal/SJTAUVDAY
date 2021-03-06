package poj;
import java.io.*;
import java.util.*;
import java.math.BigDecimal;

//java poj格式参考 ....
/**
 * 
 * 95.123 12 
 * 0.4321 20 
 * 5.1234 15 
 * 6.7592 9 
 * 98.999 10 
 * 1.0100 12
 * 提交Poj得把类名改为 Main 
 * 不需要package
 */

public class poj1001 {

	public static void main(String args[]) {
		Scanner cin = new Scanner(System.in);

		BigDecimal num;
		int n;
		String r;

		while (cin.hasNextBigDecimal()) {
			num = cin.nextBigDecimal();
			n = cin.nextInt();
			num = num.pow(n);
			r = num.stripTrailingZeros().toPlainString();
			if (r.startsWith("0."))
				r = r.substring(1);

			System.out.println(r);
		}
	}
}