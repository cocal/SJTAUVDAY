package poj;

import java.text.DecimalFormat;
import java.util.Scanner;

public class poj1004 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int len = 12;
		double sum = 0;
		while (len-- != 0) {
			sum += in.nextDouble();
		}
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("$" + df.format(sum / 12));
	}
}

