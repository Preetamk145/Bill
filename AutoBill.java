package BillingProject;

public class AutoBill
{
	int tax=12,extra=500,food=800,bill;
	int extpeople,noofdays;
	String type;
	static int count=1;
	public AutoBill(int extpeople,int noofdays,String type)
	{
		this.extpeople=extpeople;
		this.noofdays=noofdays;
		this.type=type;
		count+=count;
	}
	public int billNumber()
	{
		return this.count;
	}

	public int validateNoOfExtraPerson()
	{
		return extpeople;
	}
	public int validateTypeOfRoom()
	{
		if(type=="STANDARD")
			return 2500;
		if(type=="DELUX")
			return 3500;
		if(type=="COTTAGE")
			return 5500;
		return -1;
	}
	public int calculateBill()
	{
		bill=(this.noofdays*this.validateTypeOfRoom())+(this.noofdays*food)+(extra*this.validateNoOfExtraPerson());
		return bill;
	}
}