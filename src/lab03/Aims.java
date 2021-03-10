package lab03;
import java.util.Scanner;

public class Aims {
	
//	public static void menu() {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("=========MENU========");
//		System.out.println("1. Thêm vào giỏ hàng: ");
//		System.out.println("2. Xóa khỏi giỏ hàng: ");
//		System.out.println("3. Tổng tiền thanh toán: ");
//		System.out.println("4. Thoát chương trình!!");
//		
//		System.out.print("Mời bạn nhập lựa chọn: ");
//		int choose = scanner.nextInt();
//		
//		while(true) {
//			switch(choose) {
//				case 1:
//					
//			}
//		}
//	}
	
	public static void main(String[] args) {
		Order anOrder = new Order();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation", 18.99f);
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println("Total Cost is: ");
		System.out.println(anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd1);
		System.out.println(anOrder.totalCost());
	}
}
