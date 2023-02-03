import java.util.Scanner;
import Interfaces.*;
import Classes.*;
public class MainActivity{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		//customers:
			//for c:
		
		String name1;
		System.out.println("enter 1st customer's name: ");
		name1=input.nextLine();
		
		Scanner input1=new Scanner(System.in);
		String id1;
		System.out.println("enter 1st customer's id: ");
		id1=input1.nextLine();
		
		Scanner input2=new Scanner(System.in);
		String area1;
		System.out.println("enter 1st customer's area (please write the first letter in capital): ");
		area1=input2.nextLine();
		
		Scanner input3=new Scanner(System.in);
		String areaId1;
		System.out.println("enter 1st customer's area id:(For Mirpur: 222,For Boshundhora: 333) ");
		areaId1=input3.nextLine();
		CustomerBill c=new PostpaidBill(name1,id1,area1,areaId1);
		
		//Areas:
		Area a =new Area("Mirpur ","222");
		a.setAreaName("Mirpur");
		Area a2 = new Area("Boshundhora","333");
		a2.setAreaName("Boshundhora");
		
	
	
	
		c.calculateBills();
		//association part for c:
		if(c.getAreaName().equals(a.getAreaName())&&c.getAreaId().equals(a.getAreaId())){
			a.addCustomerBill(c);
			c.setArea(a);
			if(c.getValidity()==false){
				a.removeCustomer(c);
			}
		}
		else if(c.getAreaName().equals(a2.getAreaName())&&c.getAreaId().equals(a2.getAreaId())){
			a2.addCustomerBill(c);
			c.setArea(a2);
			if(c.getValidity()==false){
				a2.removeCustomer(c);
			}
		}
		
		//for c2 :
		Scanner input4=new Scanner(System.in);
		String name2;
		System.out.println("enter 2nd customer's name: ");
		name2=input4.nextLine();
		
		Scanner input5=new Scanner(System.in);
		String id2;
		System.out.println("enter 2nd customer's id: ");
		id2=input5.nextLine();
		
		Scanner input6=new Scanner(System.in);
		String area2;
		System.out.println("enter 2nd customer's area (please write the first letter in capital): ");
		area2=input6.nextLine();
		
		Scanner input7=new Scanner(System.in);
		String areaId2;
		System.out.println("enter 2nd customer's area id: (For Mirpur 222, For Boshundhora 333 ) ");
		areaId2=input7.nextLine();
		
		CustomerBill c2=new PrepaidBill(name2,id2,area2,areaId2,0);
		
		
		
		
		c2.recharge();
		//association part for c1:
		if(c2.getAreaName().equals(a.getAreaName())&&c2.getAreaId().equals(a.getAreaId())){
			a.addCustomerBill(c2);
			c2.setArea(a);
			
		}
		else if(c2.getAreaName().equals(a2.getAreaName())&&c2.getAreaId().equals(a2.getAreaId())){
			a2.addCustomerBill(c2);
			c2.setArea(a2);
			
		}
		
		//area showinfo part:
		a.showInfo();
		a2.showInfo();
	}
}