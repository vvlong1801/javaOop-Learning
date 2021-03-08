package lab01;

public class SecondDegreeEquation {
	private double a1;
	private double a2;
	private double b1;
	private double b2;
	private double c1;
	private double c2;
	public SecondDegreeEquation(double a1, double a2, double b1, double b2, double c1, double c2) {
		this.a1 = a1;
		this.a2 = a2;
		this.b1 = b1;
		this.b2 = b2;
		this.c1 = c1;
		this.c2 = c2;
	}
	public void setA1(double a1){
		this.a1 = a1;
	}
	public double getA1() {
		return this.a1;
	}
	public void setA2(double a2){
		this.a2 = a2;
	}
	public double getA2() {
		return this.a2;
	}
	public void setB1(double b1){
		this.b1 = b1;
	}
	public double getB1() {
		return this.b1;
	}
	public void setB2(double b2){
		this.b2 = b2;
	}
	public double getB2() {
		return this.b2;
	}
	public void setC1(double c1){
		this.c1 = c1;
	}
	public double getC1() {
		return this.c1;
	}
	public void setC2(double c2){
		this.c2 = c2;
	}
	public double getC2() {
		return this.c2;
	}
	public String solve() {
		double D, D1, D2;
		D = this.a1*this.b2 - this.a2*this.b1;
		D1 = this.c1*this.b2 - this.b1*this.c2;
		D2 = this.a1*this.c2 - this.a2*this.c1;
		if(D!=0) return "Nghiệm của hệ phương trình là (x;y) = " + "("+(D1/D)+" ; "+(D2/D)+")";
		else return "Hệ phương trình có vô số nghiệm";
	}
}
