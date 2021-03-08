package lab01;

public class Quadratic {
	private double a;
	private double b;
	private double c;
	public Quadratic(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
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
	public void setC(double c) {
		this.c = c;
	}
	public double getC() {
		return this.c;
	}
	
	public String solve(){
		if(this.a==0) {
			FirstDegreeEquation fde = new FirstDegreeEquation(this.b,this.c);
			return fde.solve(this.b,this.c);
		}
		else {
			double delta = this.b*this.b - 4*this.a*this.c;
			double x1;
			double x2;
			if(delta>0) {
				x1=(double)((-this.b + Math.sqrt(delta))/(2*this.a));
				x2=(double)((-this.b-Math.sqrt(delta))/(2*this.a));
				return "Phương trình có 2 nghiệm là: x1 = " + x1 + " và x2 =" + x2;
			}else if(delta == 0) {
				x1 = (-this.b/(2*this.a));
				return "Phương trình có nghiệm kép: x1 = x2 = " + x1;
			}else{
				return "Phương trình vô nghiệm!";
			}
		}
	}
	
}
