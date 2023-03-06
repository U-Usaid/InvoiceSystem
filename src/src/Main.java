package src;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Menu myMenu = new Menu();
		SubMenu mySubMenu = new SubMenu();
		Shop myShop = new Shop();
		Item myItem = new Item();
		Invoice myInovoice = new Invoice();
		Scanner sc = new Scanner(System.in);
		
		myMenu.menu();
		System.out.println("select option: ");
		int select = sc.nextInt();
		
		
		switch (select) {
		case 1:
			boolean sMenu1 = true;
			while (sMenu1) {
				mySubMenu.subMenu1();
				System.out.println("select option: ");
				int option = sc.nextInt();
				
				if (option == 1) {
					
				}
				else if (option == 2) {
					System.out.println("enter shop name :");
					myShop.shopName = sc.next();
				}
				else if (option == 3) {
					
				}
			}
			
		break;	
		case 2:
			boolean sMenu2 = true;
			while (sMenu2) {
				mySubMenu.subMenu2();
				System.out.println("select option: ");
				
			}
			
		break;	
		case 3:
			
			
			
		break;
		case 4:
			
		break;
		case 5:
			
			
		break;
		case 6:
			
			
		break;
		case 7:
		
			
			
			
		break;
		case 8:
			
			
			
			
			
		break;	
		}
			

	}

}
