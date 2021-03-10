package lab01;

public class FirstDegreeEquation {
	private double a;
	private double b;
	public FirstDegreeEquation(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getA() {
		return this.a;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getB() {
		return this.b;
	}
	public  String solve(double a, double b) {
		if(a==0) {
			if(b==0) return "Phương trình vô số nghiệm!";
			else return "Phương trình vô nghiệm";
		}else {
			return "Phương trình có nghiệm: x = " + (-b/a);
		}
	}
}
