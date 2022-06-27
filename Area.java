package Classes;
public class Area{
	
	CustomerBill[] customer;   //OOP CONCEPT : ASSOCIATION
	private int customerCount;
	
	//general attributes:
	String areaName;
	String areaId;
	
	//constructors:
	public Area(){
		customer=new CustomerBill[100];
	}
	public Area(String areaName, String areaId){
		this.areaName=areaName;
		this.areaId=areaId;
		customer=new CustomerBill[100];
	}
	
	//setter getters:
	
	//setters:
	public void setAreaName(String areaName){
		this.areaName=areaName;
	}
	public void setAreaId(String areaId){
		this.areaId=areaId;
	}
	
	//getters:
	public String getAreaName(){
		return areaName;
	}
	public String getAreaId(){
		return areaId;
	}
	
	//methods:
	public void addCustomerBill(CustomerBill customerBill){
		customer[customerCount++]=customerBill;
	}
	public void removeCustomer(CustomerBill c){ 
		for(int i=0;i<customerCount;i++){           
			if(c==customer[i]){
				customer[i]=null;
			}
		}
	}
	public void showAllCustomerBills(){
		for(int i=0;i<customerCount;i++){
			if(customer[i]!=null){
			   customer[i].showInfo();
			}
		}
	}
	//show info
	public void showInfo(){
		System.out.println();
		System.out.println("Area name : "+areaName);
		System.out.println("Area Id:"+areaId);
		System.out.println("Customer bills of "+areaName+" are : \n");
		this.showAllCustomerBills();
	}
}