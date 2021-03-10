package lab03;

public class Order {
	public static final int MAX_NUMBERS_ORDERED = 10;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered=0;
	
	public Order() {
		super();
	}
	
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}


	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}


	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered >= MAX_NUMBERS_ORDERED) System.out.println("The ordered is almost full");
		else {
			for(int i=0; i<MAX_NUMBERS_ORDERED; i++) {
				if(itemsOrdered[i]==null) {
					itemsOrdered[i]=disc;
					qtyOrdered++;
					break;
				}
			}
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i=0; i<MAX_NUMBERS_ORDERED ;i++) {
			if(itemsOrdered[i].getTitle().equals(disc.getTitle())) {
				itemsOrdered[i] = null;
				qtyOrdered--;
				break;
			}
		}
	}
	public float totalCost() {
		float total=0;
		for(int i=0; i<MAX_NUMBERS_ORDERED; i++) {
			if(itemsOrdered[i]!=null) total +=itemsOrdered[i].getCost();
		}
		return total;
	}
}