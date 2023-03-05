package src;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean mainMenu = true;
		
		while (mainMenu) {
			System.out.println("Main Menu");
			System.out.println("==============");
			System.out.println("[1] Shop Settings");
			System.out.println("[2] Manage Shop Items");
			System.out.println("[3] Create New Invoice");
			System.out.println("[4] Report: statistics");
			System.out.println("[5] Report All Invoice");
			System.out.println("[6] Search invoice");
			System.out.println("[7] Program Statistics");
			System.out.println("[8] Exit");
			String menu = sc.next();
			
			switch (menu) {
			
			case "1":
				boolean case1 = true;
				while (case1) {
					System.out.println("[1] Load Data");
					System.out.println("[2] Set Shop Name");
					System.out.println("[3] Set Invoice Header");
					System.out.println("[4] Go Back");
					int subMenu1 = sc.nextInt();
					
				}
			break;
			case "2":
				boolean case2 = true;
				while (case2) {
					System.out.println("[1] Add Items");
					System.out.println("[2] Delete Items");
					System.out.println("[3] Change Item Price");
					System.out.println("[4] Report All Items");
					System.out.println("[5] Go Back");
					int subMenu2 = sc.nextInt();
				}
			break;	
			}
		}

	}

}
