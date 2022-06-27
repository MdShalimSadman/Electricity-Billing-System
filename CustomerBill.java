package Classes;
import java.util.Scanner;
public class CustomerBill extends Bill{
	Scanner input = new Scanner(System.in);
	int numberOfTypes;
	int numberOfDevice;
	double power;
	double time;
	double work=0;
	static int perUnitCharge =2;   //OOP CONCEPT : STATIC KEYWORD
    double totalCharge;
    int monthDays;
    int year; 	
	int month;
	
	
	Area area;
	//general attributes:
	
	private String customerName;   //OOP CONCEPT : ENCAPSULATION
	private String customerId;
	private String areaName;
	private String areaId;
	//Array attributes:
	int n;
	double[] arr;
	String[] arr2;
	
	//constructors:
	public CustomerBill(){
		this.setN();
		arr=new double[n];
		arr2=new String[n];
	}
	public CustomerBill(String customerName,String customerId,String areaName,String areaId){  //OOP CONCEPT : CONSTRUCTOR OVERLOADING
		this.setN();
		arr=new double[n];
		arr2=new String[n];
		this.customerName=customerName;
		this.customerId=customerId;
		this.areaName=areaName;
		this.areaId=areaId;
	}
	
	//Setter getters:
	
	//setters:
	public void setCustomerName(String customerName){
		this.customerName=customerName;
	}
	public void setCustomerId(String customerId){
		this.customerId=customerId;
	}
	public void setAreaName(String areaName){
		this.areaName=areaName;
	}
	public void setAreaId(String areaId){
		this.areaId=areaId;
	}
	
	//getters:
	public String getCustomerName(){
		return customerName;
	}
	public String getCustomerId(){
		return customerId;
	}
	public String getAreaName(){
		return areaName;
	}
	public String getAreaId(){
		return areaId;
	}
	
	
	//methods
	public void setN(){
		 System.out.println("enter the number of types of devices");
		 n=input.nextInt();
	}
	public void powerUnit(){
		int unit;
		System.out.println("enter the unit :");
		System.out.println("1. Killo wat \n 2.Mega wat \n 3.wat");
		unit=input.nextInt();
		if(unit==2){
			power = power*1000;
		}
		else if(unit==3){
			power=power/1000;
		}
		
	}
	public void timeUnit(){
	   double timeunit;
	   System.out.println("Enter the time unit :");
	   System.out.println("1.hour \n 2.minute \n  3.second");
	   timeunit=input.nextDouble();
	   if(timeunit==2){
	        time=time*60;
	   }
	   else if(timeunit==3){
	        time=time*3600;
		}
	}
    public void calculateMonth(){
		System.out.println("Enter the year ");
		year = input.nextInt();
		System.out.println("Enter the month number of which the bill is :");
		System.out.println("1. January \n 2.February \n 3.March \n 4.April \n 5.May \n 6.June \n 7.July \n 8.August \n 9.September \n 10.October \n 11.November \n 12.December ");
		month=input.nextInt();
		if(month==4 ||month==6||month==9||month==11){
			monthDays=30;
		}
		else if(month==2){
			if(year%4==0){
				monthDays=29;
			}
			else {
				monthDays=28;
			}
		}
		else{
			monthDays=31;
		}
	}
	public void calculateBills(){
		System.out.println("what is the type of your bill? \n 1.Postpaid \n 2.Prepaid ");
		int billType=input.nextInt();
	    if(billType==1){
		   this.calculateMonth();
		}
		for(int i=0;i<n;i++){
			System.out.println("Enter the name of "+(i+1)+"th device");
			Scanner input1=new Scanner(System.in);
			String nameOfDevice;
			nameOfDevice=input1.nextLine();
		    arr2[i]=nameOfDevice;
			System.out.println("Enter the number of "+nameOfDevice);
			numberOfDevice=input.nextInt();
			
			System.out.println("Enter the POWER "+nameOfDevice+" take ");
			power = input.nextDouble();
			this.powerUnit();
			if(billType==1){
			  System.out.println("Enter the time the "+nameOfDevice+" is used per day ");
			  time=input.nextDouble();
			  this.timeUnit();
			  double individualWork=(power*numberOfDevice*time*monthDays);
			  arr[i]=individualWork;  //shows how much work an individual device does. for example light or fan.
			  work=work+ individualWork;
			}
			else if(billType==2){
			  System.out.println("Enter the time the "+nameOfDevice+" has been used after recharge");
			  time=input.nextDouble();
			  this.timeUnit();
			  double individualWork=(power*numberOfDevice*time);
			  arr[i]=individualWork;  //shows how much work an individual device does. for example light or fan.
			  work=work+ individualWork;
			}
			
			
			
			
		}
	}
	public void showBill(){
		System.out.println("The total Energy is :"+work+" Unit");
		totalCharge=work*perUnitCharge;
		System.out.println("bill is "+totalCharge+" taka");
	}
	
	//association:
	public void setArea(Area area){
		this.area=area;
	}
	public Area getArea(){
		return area;
	}
	//showInfo:
	public void showInfo(){
		System.out.println("Customer name : "+customerName);
		System.out.println("Customer Id : "+customerId);
		System.out.println("Customer's Area : "+areaName);
		System.out.println("Area id: "+areaId);
		this.showBill();
	}
	
}