package Interfaces;     //OOP CONCEPT : INTERFACE
import Classes.Bill;
public interface IPostpaid{
	public void setValidity(boolean validity);
	public boolean getValidity();
	public void  calculateBills();
	public void calculateFine();
}