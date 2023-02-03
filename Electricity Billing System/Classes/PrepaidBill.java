package Classes;
import java.util.Scanner;
import Interfaces.IPrepaid;
public class PrepaidBill extends SummarizedBill implements IPrepaid{
	Scanner input = new Scanner(System.in);
	double balance;
	public PrepaidBill(){
		super();
	}
	public PrepaidBill(String customerName,String customerId,String areaName,String areaId,double balance){
		super(customerName,customerId,areaName,areaId);
		this.balance=balance;
	}
	public void recharge(){
		System.out.println("How much you want to recharge?");
		double amount=input.nextDouble();
		balance=balance+amount;
		System.out.println("your balance is "+balance);
		System.out.println("Do you want to check the balance after usage? \n 1.Yes \n 2.No ");
		int answer = input.nextInt();
		if(answer==1){
			this.calculateBills();
			this.balanceAfterUsage();
		}
	}
	public void calculateBills(){
		super.calculateBills();
	}
	public void balanceAfterUsage(){
		super.showBill();
		balance=balance-totalCharge;
		if(balance>0){
		 System.out.println("Your remaining balance is :"+balance+" Taka");
		}
		else if(balance<=0){
			System.out.println("Your balance is 0 taka. Please recharge");
		}
	}
}