import java.util.*;
class BankAccountClass{
	static String bankName="HDFC";
	static int totalaccounts=0;
	String accountHolderName="";
	final int accountNumber;
	public BankAccountClass(String accountHolderName,int accountNumber)
	{
		totalaccounts++;
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
	}
	public static int getTotalAccounts()
	{
		return totalaccounts;
	}
	public void displayAccountInfo()
	{
		System.out.println("The account holder name is "+ accountHolderName);
		System.out.println("The account number is "+ accountNumber);
	}
}
public class BankAccount{
	public static void main(String[] args){
    BankAccountClass obj=new BankAccountClass("Ashish Singh",12348758);
	if(obj instanceof BankAccountClass)
	{
	System.out.println(BankAccountClass.getTotalAccounts());
	obj.displayAccountInfo();
	}
	}
}