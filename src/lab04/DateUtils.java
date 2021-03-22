package lab04;

public class DateUtils {
	public DateUtils() {
		super();
	}
	public static int compareDate(MyDate date_1, MyDate date_2) {
		if(date_1.getYear()>date_2.getYear()) return 1;
		else if(date_1.getYear()==date_2.getYear()) {
			if(date_1.getMonth()>date_2.getMonth()) return 1;
			else if(date_1.getMonth()==date_2.getMonth()) {
				if(date_1.getDay()>date_2.getDay()) return 1;
				else if(date_1.getDay()==date_2.getDay()) return 0;
				else return -1;
			} else return -1;
		}else return -1;
	}
	
	public static void changePosDate(MyDate date_1, MyDate date_2) {
		MyDate temp = new MyDate();
		temp = date_1;
		date_1 = date_2;
		date_2 = temp;
	}
	public void sortingDate(MyDate[] listDate) {
		for(int i=0; i< listDate.length;i++) {
			for(int j=i; j< listDate.length;j++) {
				if(compareDate(listDate[j], listDate[i])<0)
					changePosDate(listDate[i], listDate[j]);
			}
		}
	}
}
