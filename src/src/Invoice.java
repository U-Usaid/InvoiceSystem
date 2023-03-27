package src;

import java.io.Serializable;
import java.util.ArrayList;

public class Invoice implements Serializable {

int invoiceNo;
String customerName;
int phoneNo;
String invoiceDate;
double total;
double paidAmount;
double balance;

ArrayList<Item> itemListInvoice = new ArrayList<Item>();
}
