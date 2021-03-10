package lab01;

import java.util.Scanner;

public class TestQuadratic {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		double a,b,c;
		System.out.println("Nhập hệ số a cho phương trình: ");
		a = scanner.nextDouble();
		System.out.println("Nhập hệ số b cho phương trình: ");
		b = scanner.nextDouble();
		System.out.println("Nhập hệ số b cho phương trình: ");
		c = scanner.nextDouble();
		Quadratic quadratic = new Quadratic(a,b,c);
		System.out.println(quadratic.solve());
	}
}
