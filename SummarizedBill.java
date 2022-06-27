package Classes;
public class SummarizedBill extends CustomerBill{      //OOP CONCEPT : Inheritance 
	
	public SummarizedBill(){
		super();
	}
	public SummarizedBill(String customerName,String customerId,String areaName,String areaId){
		super(customerName,customerId,areaName,areaId);
	}
	double max;
	String maxDevice;
	double min;
	String minDevice;
	public void calculateBills(){
		super.calculateBills();
		max=arr[0];
		maxDevice=arr2[0];
		for(int j=0;j<n;j++){
			
			System.out.println("the "+arr2[j]+" uses "+((arr[j]/work)*100)+" % energy");
			
			if(arr[j]>max){
				max=arr[j];
				maxDevice=arr2[j];
			}
			
			
		}
		min=arr[0];
		minDevice=arr2[0];
		for(int j=0;j<n;j++){
			
			if(min>arr[j]){
				min=arr[j];
				minDevice=arr2[j];
			}
			
			
		}
		
		System.out.println("The maximum power is used "+max+" killo watt by "+maxDevice);
		System.out.println("The minimum power is used "+min+" killo watt by "+minDevice);
	}
}