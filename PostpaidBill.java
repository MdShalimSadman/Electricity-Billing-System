package Classes;
import java.util.Scanner;
import Interfaces.IPostpaid;
public class PostpaidBill extends SummarizedBill  implements IPostpaid{
	Scanner input= new Scanner(System.in);
	int date;
	final int deadline=15;     //OOP CONCEPT : FINAL
	final int fine= 10; 
	int paymentMonth;
	double billWithFine;
	boolean validity;
	
	
	public PostpaidBill(){
		super();
	}
	public PostpaidBill(String customerName,String customerId,String areaName,String areaId){
		super(customerName,customerId,areaName,areaId);
	}
	public void setValidity(boolean validity){
		this.validity=validity;
	}
	public boolean getValidity(){
		return validity;
	}
	public void calculateBills(){
		super.calculateBills();
		this.calculateFine();
		
	}
	public void calculateFine(){
		System.out.println("please enter your payment date :");
		date=input.nextInt();
		System.out.println("Enter the present month number  :");
		System.out.println("1. January \n 2.February \n 3.March \n 4.April \n 5.May \n 6.June \n 7.July \n 8.August \n 9.September \n 10.October \n 11.November \n 12.December ");
		paymentMonth=input.nextInt();
		super.showBill();
		if(date<=deadline&&paymentMonth==month+1){
			System.out.println("you have no fine. Thanks for paying on time");
			this.setValidity(true);
		}
		else if(date>deadline&& paymentMonth==month+1){
			billWithFine=(double)totalCharge+fine;
			System.out.println("Your bill with fine : "+billWithFine);
			this.setValidity(true);
		}
		else if(date>deadline&& paymentMonth==month+2){
			billWithFine=(double)totalCharge+(fine*2);
			System.out.println("Your bill with fine : "+billWithFine);
			this.setValidity(true);
		}
		else if(date>deadline&& paymentMonth==month+3){
			billWithFine=(double)totalCharge+(fine*3);
			System.out.println("Your bill with fine : "+billWithFine);
			this.setValidity(true);
		}
		else{
			System.out.println("Sorry deadline is over and your line has been cuted ");
			this.setValidity(false);
		}
		
		
	}

}