package lab02;
import java.util.Scanner;
public class Triangle {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("Enter height of triangle: ");
		int n = Triangle.scanner.nextInt();
		for(int i=0;i<n;i++) {
			String line = "";
			for(int j=0;j<(n-i);j++) {
				line = line + " ";
			}
			for(int k=0;k<(2*i+1);k++) {
				line = line + "*";
			}
			System.out.println(line);
		}
	}
}
