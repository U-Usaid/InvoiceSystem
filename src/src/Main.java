package src;
import java.beans.Statement;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.*;
public class Main {
	
	
	public static void main(String[] args) {
		Menu myMenu = new Menu();
		SubMenu mySubMenu = new SubMenu();
		Shop myShop = new Shop();
		JDBC myJDBC = new JDBC();
		
		Scanner sc = new Scanner(System.in);
		boolean mainMenu = true;
		while(mainMenu) {
			
		
		myMenu.menu();
		System.out.println("Select Option: ");
		int select = sc.nextInt();
		
		
		switch (select) {
		case 1:
			boolean sMenu1 = true;
			while (sMenu1) {
				mySubMenu.subMenu1();
				System.out.println("Select Option: ");
				int option = sc.nextInt();
				
				if (option == 1) {
					
					
					boolean invoice = true;
					while (invoice) {
						
						System.out.println(myShop.itemList);
						System.out.println(myShop.invoiceList);
						
					/*	System.out.println("Enter name: ");
						myInovoice.customerName = sc.next();
						
						System.out.println("Enter Phone Number: ");
						myInovoice.phoneNo = sc.nextInt();
						
						System.out.println("Enter Invoice Date: ");
						myInovoice.invoiceDate = sc.next();
						
						System.out.println("Enter Number of Item: ");
						myInovoice.noOfItem = sc.nextInt();
						
						System.out.println("Enter Total Amount: ");
						myInovoice.total = sc.nextDouble();
						
						System.out.println("Enter Paid Amount: ");
						myInovoice.paidAmount = sc.nextInt();
						
						System.out.println("Enter Balance: ");
						myInovoice.balance = sc.nextInt();
						
						myShop.invoiceList.add(myInovoice);
						
						///next///
						
						System.out.println("Enter Item Name: ");
						myItem.itemName = sc.next();
						
						System.out.println("Enter Item ID: ");
						myItem.itemID = sc.nextInt();
						
						System.out.println("Enter Unit Price: ");
						myItem.unitPrice = sc.nextInt();
						
						System.out.println("Enter Quantity: ");
						myItem.quantity = sc.nextInt();
						
						System.out.println("Enter qty amount: ");
						myItem.qtyAmount = sc.nextInt();
						
						
						myShop.itemList.add(myItem);*/
						
						break;
					
				
					
					}
					
					
				}
				else if (option == 2) {
					System.out.println("Enter Shop Name :");
					myShop.shopName = sc.next();
					
					  try {
						FileWriter file = new FileWriter("shop.txt", true);
						 file.write("Shop Name: " + myShop.shopName+"\n");
						 file.write("----------------------------------"+"\n");
						 file.close();
						 System.out.println("Shop Name saved successfully");
						 
					
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					  }
				else if (option == 3) {
					System.out.println("Enter Header");
					System.out.println("=================== \n");
					
					String shopName = myShop.shopName;
					
					System.out.println("Enter Telephone Number: ");
					myShop.tel = sc.nextInt();
					int tel = myShop.tel;
					
					System.out.println("Enter Fax: ");
					myShop.fax = sc.nextInt();
					int fax = myShop.fax;
					
					System.out.println("Enter email: ");
					myShop.email = sc.next();
					String email = myShop.email;
					
					System.out.println("Enter Website: ");
					myShop.website = sc.next();
					String website = myShop.website;
					
					FileWriter file1;
					try {
						file1 = new FileWriter("shop.txt", true);
						file1.write("Telephone Number: " + myShop.tel+"\n");
						file1.write("Enter Fax: " + myShop.fax+"\n");
						file1.write("email: " + myShop.email+"\n");
						file1.write("Website: " + myShop.website+"\n");
						 file1.close();
						 System.out.println("Shop details saved successfully");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					myJDBC.creatShopTable();

					 String url = "jdbc:sqlserver://localhost:1433;databaseName=invoiceSystem;encrypt=true;trustServerCertificate=true";
				        String user = "sa";
				        String pass = "root";
				        Connection con = null;
				        try {
					Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			        DriverManager.registerDriver(driver);

			        con = DriverManager.getConnection(url, user, pass);


			        java.sql.Statement st = con.createStatement();
					
					 String sql1 = "insert into Shop values('" + shopName
			                 + "'," + tel + "," + fax + ", '"+ email +"','"+ website+"')";

					 Integer m = st.executeUpdate(sql1);
			         if (m >= 1) {
			             System.out.println("inserted successfully : " + sql1);
			         } else {
			             System.out.println("insertion failed");
			         }
			         
					
				        }catch (Exception e) {
							// TODO: handle exception
						}
					
					 
					
					
					 
					
				        
				}
				else if (option == 4) {
					
				break;
				}
				
				else {
					System.out.println("invalid input......(-_-)");
					break;
				}
				
			}
			
		break;	
		case 2:
			boolean sMenu2 = true;
			while (sMenu2) {
				mySubMenu.subMenu2();
				System.out.println("select option: ");
				int option = sc.nextInt();
				
				if (option == 1) {
					while (true) {
						Item myItem = new Item();
						myShop.itemList.add(myItem);
						
						System.out.println("Enter Item Name: ");
						myItem.itemName = sc.next();
						String itemName = myItem.itemName ;
						
						System.out.println("Enter Item ID: ");
						myItem.itemID = sc.nextInt();
						int itemID = myItem.itemID;
						
						System.out.println("Enter Unit Price: ");
						myItem.unitPrice = sc.nextInt();
						double unitPrice = myItem.unitPrice;
						
						System.out.println("Enter Quantity: ");
						myItem.quantity = sc.nextInt();
						int quantity = myItem.quantity;
						
						myItem.qtyAmount = myItem.unitPrice * myItem.quantity;
						System.out.println("The qty Amount is: " + myItem.qtyAmount);
						double qtyAmount = myItem.qtyAmount;
						
						
						System.out.println("Do You Want to Add More Information ? ");
						String answer = sc.next();
						
						myShop.itemList.add(myItem);
						
						if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
							
						}
						else if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {
							try {
								FileOutputStream itemFile =new FileOutputStream("itemFile.txt",true);
								         
								   ObjectOutputStream out = new ObjectOutputStream(itemFile);
						           out.writeObject(myItem);
								   out.close();
								   itemFile.close();
								   System.out.println("File Saved in itemFile.txt");
							}
							catch(IOException e) {
								System.out.println("error");
								e.printStackTrace();
							}
						myJDBC.creatItemTable();
						
						
						 String url = "jdbc:sqlserver://localhost:1433;databaseName=invoiceSystem;encrypt=true;trustServerCertificate=true";
					        String user = "sa";
					        String pass = "root";
					        Connection con = null;
					        try {
						Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
				        DriverManager.registerDriver(driver);

				        con = DriverManager.getConnection(url, user, pass);


				        java.sql.Statement st = con.createStatement();
						
						 String sql1 = "insert into Item values(" + itemID
				                 + ",'" + itemName + "'," + unitPrice + ", "+ quantity +","+ qtyAmount+")";

						 Integer m = st.executeUpdate(sql1);
				         if (m >= 1) {
				             System.out.println("inserted successfully : " + sql1);
				         } else {
				             System.out.println("insertion failed");
				         }
				         
						
					        }catch (Exception e) {
								// TODO: handle exception
							}
						
						
						
							break;
						}
						else {
							System.out.println("invalid input.......(-_-)");
							break;
						}
					}
				}
				else if (option == 2) {
					for (int i=0; i<myShop.itemList.size(); i++) {
						System.out.println("Enter item id you want to delete:");
						int id = sc.nextInt();
						if (id==myShop.itemList.get(i).itemID) {
						myShop.itemList.remove(i);
						System.out.println("items removed");
					
						
						
						String url = "jdbc:sqlserver://localhost:1433;databaseName=invoiceSystem;encrypt=true;trustServerCertificate=true";
				        String user = "sa";
				        String pass = "root";
				        Connection con = null;
				        try {
					Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			        DriverManager.registerDriver(driver);

			        con = DriverManager.getConnection(url, user, pass);


			        java.sql.Statement st = con.createStatement();
					
			    		
			    	
					 String sql1 = "DELETE FROM Item where itemID ="+id+";";

					 Integer m = st.executeUpdate(sql1);
			         if (m >= 1) {
			             System.out.println("Deleted successfully : " + sql1);
			         } else {
			             System.out.println("Deleting failed");
			         }
			         
					
				        }catch (Exception e) {
							// TODO: handle exception
						}
						
						
						
						}
						
						
						
						
						
						
			
						break;
						
					} 
				}
				else if (option == 3) {
					
					try {
					for (int i=0; i<myShop.itemList.size()-1; i++) {
						System.out.println((i+1) + ". " + myShop.itemList.get(i).itemName);
					}
					System.out.println("Choose Number of Item: ");
					int itemNo = sc.nextInt();
					itemNo = itemNo-1;
					System.out.println("Enter item id: ");
					int itid = sc.nextInt();
					myShop.itemList.get(itemNo).itemID = itid;
					System.out.println("Enter price: ");
					double price = sc.nextDouble();
					myShop.itemList.get(itemNo).unitPrice = price;
					System.out.println("item price has been updated...");
					
					
					String url = "jdbc:sqlserver://localhost:1433;databaseName=invoiceSystem;encrypt=true;trustServerCertificate=true";
			        String user = "sa";
			        String pass = "root";
			        Connection con = null;
			        
				Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
		        DriverManager.registerDriver(driver);

		        con = DriverManager.getConnection(url, user, pass);


		        java.sql.Statement st = con.createStatement();
				
		    		
		    	
				 String sql1 = "UPDATE Item "
				 		+ "SET unitPrice = " + price
				 		+ "WHERE itemID = " + itid + " ;";

				//  System.out.println("Updated successfully : " + sql1);
				 Integer m = st.executeUpdate(sql1);
		         if (m >= 1) {
		             System.out.println("Updated successfully : " + sql1);
		         } else {
		             System.out.println("Updating failed");
		         }
		         
				
			        }catch (Exception e) {
						// TODO: handle exception
					}
					
				}
				else if (option == 4) {
					for(int i=0; i<myShop.itemList.size()-1; i++) {
						System.out.printf("%20s %20s %20s %20s %20s\n", "id", "name", "price", "quantity", "qyt");
						System.out.printf("%20s %20s %20s %20s %20s\n", myShop.itemList.get(i).itemID, myShop.itemList.get(i).itemName, myShop.itemList.get(i).unitPrice, myShop.itemList.get(i).quantity, myShop.itemList.get(i).qtyAmount);

					}
					
			
					
				}
				else if (option == 5) {
					break;
				}
				else {
					System.out.println("invalid input.........(X_X)dumbass");
					break;
				}
				}
			
		break;	
		case 3:
			while (true) {
				Invoice myInovoice = new Invoice();
				System.out.println("Enter invoice number: ");
				int invoiceNo =sc.nextInt();

				System.out.println("Enter name: ");
				myInovoice.customerName = sc.next();
				String cName = myInovoice.customerName;
				
				System.out.println("Enter Phone Number: ");
				myInovoice.phoneNo = sc.nextInt();
				int phoneNo = myInovoice.phoneNo;
				
				System.out.println("Enter Invoice Date: ");
				myInovoice.invoiceDate = sc.next();
				String invoiceDate = myInovoice.invoiceDate;
				
				for(int i=0; i<myShop.itemList.size()-1; i++) {
					System.out.println( (i+1) + ") " + myShop.itemList.get(i).itemName);
				}
				

				Item myItem = new Item();
				myInovoice.total = myItem.quantity * myItem.unitPrice;
				double total = myInovoice.total;
				
				
				System.out.println("Enter Paid Amount: ");
				myInovoice.paidAmount = sc.nextInt();
				double paidAmount = myInovoice.paidAmount;
				
				myInovoice.balance = myInovoice.total - myInovoice.paidAmount;
				double balance = myInovoice.balance;
				
				
//				System.out.println("Shop Name: " + myShop.shopName);
//				System.out.println("Shop Phone Number: " + myShop.tel);
//				System.out.println("Shop Fax Number: " + myShop.fax);
//				System.out.println("Shop Website: " + myShop.website);
//				System.out.println("Shop Mail: " + myShop.email);
//				System.out.println("-------------------------------------------------------");
//				System.out.println("Customer Name: " + myInovoice.customerName);
//				
//
//				System.out.println("The Balance: " + myInovoice.balance);
				
				myShop.invoiceList.add(myInovoice);

				
				
				System.out.println("Do You Want to Add More Information ? ");
				String answer = sc.next();
				
				if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
					
				}
				else if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {
					try {
						
						FileOutputStream invoiceFile =new FileOutputStream("invoiceFile.txt");
				         
						   ObjectOutputStream out = new ObjectOutputStream(invoiceFile);
				           out.writeObject(myInovoice);
						   out.close();
						   invoiceFile.close();
						   System.out.println("File Saved in invoiceFile.txt");
						   break;
					}
					catch(IOException e) {
						System.out.println("error");
						e.printStackTrace();
					}
					
					
					myJDBC.creatInvoiceTable();
					
					
					
					 String url = "jdbc:sqlserver://localhost:1433;databaseName=invoiceSystem;encrypt=true;trustServerCertificate=true";
				        String user = "sa";
				        String pass = "root";
				        Connection con = null;
				        try {
					Driver driver = (Driver) Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			        DriverManager.registerDriver(driver);

			        con = DriverManager.getConnection(url, user, pass);


			        java.sql.Statement st = con.createStatement();
					
					 String sql1 = "insert into Invoice values(" + invoiceNo
			                 + ",'" + cName + "'," + phoneNo + ", "+ invoiceDate +","+ total+","+ paidAmount+","+ balance+")";

					 Integer m = st.executeUpdate(sql1);
			         if (m >= 1) {
			             System.out.println("inserted successfully : " + sql1);
			         } else {
			             System.out.println("insertion failed");
			         }
			         
					
				        }catch (Exception e) {
							// TODO: handle exception
						}
					
				        
				        
				        
					
					break;
				}
			}
			
			
		break;
		case 4:
			System.out.println("Statistics");
			System.out.println("Number of Items: " + myShop.itemList.size());
			System.out.println("Number of Invoice: " + myShop.invoiceList.size());
			System.out.println("Total Sales: " );
		break;
		case 5:
			for(int i=0; i<myShop.invoiceList.size(); i++) {
				System.out.printf("%20s %20s %20s %20s\n", "Customer Name", "Phone Number", "Invoice Date", "Total", "Balance");
				System.out.printf("%20s %20s %20s %20s\n", myShop.invoiceList.get(i).customerName, myShop.invoiceList.get(i).phoneNo, myShop.invoiceList.get(i).invoiceDate, myShop.invoiceList.get(i).total, myShop.invoiceList.get(i).balance);
				
			}
		break;
		case 6:
			System.out.println("search invoice: ");
			String search = sc.next();
			
			for (int i=0; i<myShop.invoiceList.size(); i++) {
				if (search.equals(myShop.invoiceList.get(i).customerName)) {
					
					System.out.printf("%20s %20s %20s %20s\n", "Customer Name", "Phone Number", "Invoice Date", "Total", "Balance");
					System.out.printf("%20s %20s %20s %20s\n", myShop.invoiceList.get(i).customerName, myShop.invoiceList.get(i).phoneNo, myShop.invoiceList.get(i).invoiceDate, myShop.invoiceList.get(i).total, myShop.invoiceList.get(i).balance);
					
				}
				
			}
			
			
			
			
		break;
		case 7:
		
			
			
			
		break;
		case 8:
			System.out.println("bye bye..");
			System.exit(0);
			
			
			
			
		break;	
		}
			
		}
	}

}
