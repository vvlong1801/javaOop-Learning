package lab04;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered=0;
	private MyDate dateOrdered = new MyDate();
	public Order() {
		super();
	}
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}

	
	public MyDate getDateOrdered() {
		return dateOrdered;
	}

	public void setDateOrdered(MyDate dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered >= MAX_NUMBERS_ORDERED) {
			System.out.println(disc.getTitle() + " isn't create!! "+"The ordered is almost full");
			return;
		}
		else {
			for(int i=0; i<MAX_NUMBERS_ORDERED; i++) {
				if(itemsOrdered[i]==null) {
					itemsOrdered[i]=disc;
					qtyOrdered++;
					System.out.println(disc.getTitle() + " is created;");
					break;
				}
			}
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2 ) {
		this.addDigitalVideoDisc(dvd1);
		this.addDigitalVideoDisc(dvd2);
	}
	
	public void addDigitalVideoDisc (DigitalVideoDisc [] dvdList) {
		for(DigitalVideoDisc dvd : dvdList) {
			if(dvd!=null) this.addDigitalVideoDisc(dvd);
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i=0; i<MAX_NUMBERS_ORDERED ;i++) {
			if(itemsOrdered[i].getTitle().equals(disc.getTitle())) {
				itemsOrdered[i] = null;
				qtyOrdered--;
				System.out.println(disc.getTitle() + " is removed!!");
				return;
			}
		}
		System.out.println("not find " + disc.getTitle() +"!!");
	}
	
	public float totalCost() {
		float total=0;
		for(int i=0; i<MAX_NUMBERS_ORDERED; i++) {
			if(itemsOrdered[i]!=null) total +=itemsOrdered[i].getCost();
		}
		return total;
	}
	
	public void show() {
		System.out.println("**********************Order**********************");
		System.out.println(this.dateOrdered);
		for(int i=0; i< MAX_NUMBERS_ORDERED;i++) {
			if(itemsOrdered[i]==null) continue;
			System.out.println("DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " +itemsOrdered[i].getDirector()+" - "+itemsOrdered[i].getLength()+": "+itemsOrdered[i].getCost()+"$");
		}
		System.out.println(this.totalCost());
		System.out.println("*************************************************");
	}
}