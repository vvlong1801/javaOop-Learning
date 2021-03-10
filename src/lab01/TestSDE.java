package lab01;

import java.util.Scanner;

public class TestSDE {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		double a1,a2,b1,b2,c1,c2;
		System.out.println("Nhập các hệ số cho hệ phương trình: ");
		System.out.println("a1, b1, c1, a2, b2, c2: ");
		a1 = scanner.nextDouble();
		b1 = scanner.nextDouble();
		c1 = scanner.nextDouble();
		a2 = scanner.nextDouble();
		b2 = scanner.nextDouble();
		c2 = scanner.nextDouble();
		SecondDegreeEquation sde = new SecondDegreeEquation(a1,a2,b1,b2,c1,c2);
		System.out.println(sde.solve());
	}
}
