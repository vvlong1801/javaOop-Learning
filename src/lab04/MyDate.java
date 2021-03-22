package lab04;

public class MyDate {
	private int day;
	private int month;
	private int year;
	public MyDate() {
		super();
	}
	public MyDate(int day, int month, int year) {
		super();
		this.setDay(day);;
		this.setMonth(month);;
		this.setYear(year);
	}
	
	public MyDate(String day, String month, String year) {
		super();
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year);
	}
	
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day>0&&day<32) this.day = day;
		else System.out.println("Day is wrong");
	}
	
	public int getMonth() {
		return this.month;
	}
	public void setMonth(int month) {
		if(month>0&&month<13) this.month = month;
		else System.out.println("month is wrong");
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year>1900 && year<2200) this.year = year;
		else System.out.println("year isn't right");
		
	}
	
	public void setDay(String day) {
		if(this.convertDayToInt(day)==0) System.out.println("Setting day isn't right!!! ");
		else this.day = this.convertDayToInt(day);
	}
	public void setMonth(String month) {
		if(this.convertMonthToInt(month)==0) System.out.println("Setting month isn't right!!! ");
		else this.month = this.convertMonthToInt(month);
	}
	public void setYear(String year) {
		if(this.convertYearToInt(year)==0) System.out.println("Setting year isn't right!!! ");
		else if(this.convertYearToInt(year)>1900&&this.convertYearToInt(year)<2200) this.year = this.convertYearToInt(year);
		else System.out.println("year isn't right");
	}
	
	/* chuyen dinh dang*/
	public int convertDayToInt(String day) {
    	int dayConvert = 0;
    	switch (day) {
		case "first": dayConvert =  1;break;
		case "second": dayConvert =  2;break;
        case "third": dayConvert = 3;break;
		case "forth":  dayConvert = 4; break;
		case "fifth":  dayConvert = 5; break;
		case "sixth":  dayConvert = 6; break;
		case "seventh":  dayConvert = 7; break;
		case "eighth":  dayConvert = 8; break;
		case "ninth":  dayConvert = 9; break;
		case "tenth":  dayConvert = 10; break;
		case "eleventh":  dayConvert = 11; break;
		case "twelfth":  dayConvert = 12; break;
		case "thirteenth":  dayConvert = 13; break;
		case "fourteenth":  dayConvert = 14; break;
		case "fifteenth":  dayConvert = 15; break;
		case "sixteenth":  dayConvert = 16; break;
		case "seventeenth":  dayConvert = 17; break;
		case "eighteenth":  dayConvert = 18; break;
		case "nineteenth":  dayConvert = 19; break;
		case "twenty":  dayConvert = 20; break;
		case "twenty-first":  dayConvert = 21; break;
		case "twenty-second":  dayConvert = 22; break;
		case "twenty-third":  dayConvert = 23; break;
		case "twenty-fourth": dayConvert = 24;break;
		case "twenty-fifth" : dayConvert = 25;break;
		case "twenty-sixth":dayConvert = 26;break;
		case "twenty-seventh":dayConvert = 27;break;
		case "twenty-eighth": dayConvert = 28;break;
		case "twenty-ninth":dayConvert = 29;break;
		case "thirty":dayConvert = 30;break;
		case "thirty-first":dayConvert = 31;break;
		default:
			dayConvert = 0;
			break;
		}
		return dayConvert;
    }
	
	public int convertMonthToInt(String month) {
		int m=0;
		switch(month.toLowerCase()) {
    	case "january": m = 1; break;
		case "february": m = 2; break;
		case "march": m = 3;break;
		case "april":  m = 4; break;
		case "may":  m = 5; break;
		case "june":  m = 6; break;
		case "july":  m = 7; break;
		case "august":  m = 8; break;
		case "september":  m = 9; break;
		case "october":  m = 10; break;
		case "november":  m = 11; break;
		case "december":  m = 12; break;
		default:
			m = 0;
			break;
		}
		return m;
	}
	
	public String convertMonthToString() {
		switch(this.month) {
    	case 1: return "january";
		case 2: return "february";
		case 3: return "march";
		case 4: return "april";
		case 5: return "may";
		case 6: return "june";
		case 7: return "july";
		case 8: return "august";
		case 9: return "september";
		case 10: return "october";
		case 11: return "november";
		case 12: return "december";
		default:
			return null;
		}
	}
	
	public int convertYearToInt(String year) {
		int yearConvert;
		try {
			yearConvert = Integer.parseInt(year);
		}catch(NumberFormatException e){
			yearConvert =0;
		}
		return yearConvert;
	}
	
	/* kiem tra nam nhuan*/
	public boolean checkYearIsLeap(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
   		 return true;
        } else return false;
	}
	/* kiem tra date*/
	public boolean checkDate(MyDate date) {
		if(!date.checkYearIsLeap(date.getYear())&&date.getDay()>28) {
			System.out.println("Day is wrong because year is leap!!!");
			return false;
		}else return true;
	}
	
	public void printDate() {
		if(!this.checkDate(this)) return;
		else {
			if(this.getDay() == 1) System.out.println(this.convertMonthToString()+this.getDay()+" "+"st "+this.getYear());
	    	else if(this.getDay() == 2) System.out.println(this.convertMonthToString()+" "+this.getDay()+"nd "+this.getYear());
	    	else if(this.getDay() == 3) System.out.println(this.convertMonthToString()+" "+this.getDay()+"rd "+this.getYear());
	    	else System.out.println(this.convertMonthToString()+" "+this.getDay()+"th "+this.getYear());
		}
	}
}
