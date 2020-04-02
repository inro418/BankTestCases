package tests;

import org.testng.annotations.Test;

public class Day4 {

	@Test
	public void CarLoanMacSignIn(){
		System.out.println("Car Loan mac SignIn");
	}
	
	@Test
	public void HomeLoanMacSignIn(){
		System.out.println("Home Loan mac SignIn");
	}
	
	@Test
	public void BusinessLoanMacSignIn(){
		System.out.println("Business Loan mac SignIn");
	}
	
	@Test
	public void SchoolLoanMacSignIn(){
		System.out.println("School Loan mac SignIn");
	}
	
	@Test 
	public void HolidayLoanMacSignIn(){
		System.out.println("Holiday Loan mac SignIn");
	}
	
	@Test
	public void InsuranceLoanMacSignIn(){
		System.out.println("Insurance Loan mac SignIn");
	}
	
	@Test (groups ={"Smoke"})
	public void MortgageLoanMacSignIn(){
		System.out.println("Mortgage Loan mac SignIn");
	}
	
	@Test
	public void FarmLoanMacSignIn(){
		System.out.println("Farm Loan mac SignIn");
	}
	 
}
