package lab01;

import java.util.Scanner;

public class TestFDE {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		double a,b;
		System.out.println("Nhập hệ số a cho phương trình: ");
		a = scanner.nextDouble();
		System.out.println("Nhập hệ số b cho phương trình: ");
		b = scanner.nextDouble();
		FirstDegreeEquation eq = new FirstDegreeEquation(a,b);
		System.out.println(eq.solve(a,b));
	}

}
