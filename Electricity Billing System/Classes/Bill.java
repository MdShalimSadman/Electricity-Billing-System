package Classes;
public abstract class Bill{
	public Bill(){
		
	public void recharge(){
	}
	System.out.println("recharge method for prepaid");
	}
	public void setValidity(boolean validity){
		System.out.println("setValidity for postpaid");
	}
	public boolean getValidity(){
		System.out.println("getValidity for postpaid");
		return true;
	}
	
	public abstract void calculateBills();//OOP CONCEPT : ABSTRACTION
}