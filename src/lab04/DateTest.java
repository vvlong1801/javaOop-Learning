package lab04;

public class DateTest {
	public static void main(String[] args) {
		MyDate md = new MyDate(10,3,1990);
		MyDate md1 = new MyDate(10,4,1990);
		MyDate md2 = new MyDate(10,3,1980);
		MyDate[] listDate = {md,md1,md2};
		DateUtils du = new DateUtils();
		du.sortingDate(listDate);
		for(MyDate d: listDate) {
			d.printDate();
		}
	}
}
