package tests;

import org.testng.annotations.Test;

public class Day3 {

	@Test
	public void CarLoanAPISignIn(){
		System.out.println("Car Loan API SignIn");
	}
	
	@Test
	public void HomeLoanAPISignIn(){
		System.out.println("Home Loan API SignIn");
	}
	
	@Test (groups ={"Smoke"})
	public void BusinessLoanAPISignIn(){
		
		System.out.println("Business Loan API SignIn");
	}
	
	@Test
	public void SchoolLoanAPISignIn(){
		System.out.println("School Loan API SignIn");
	}
	
	@Test 
	public void HolidayLoanAPISignIn(){
		System.out.println("Holiday Loan API SignIn");
	}
	
	@Test 
	public void InsuranceLoanAPISignIn(){
		System.out.println("Insurance Loan API SignIn");
	}
	
	@Test
	public void MortgageLoanAPISignIn(){
		System.out.println("Mortgage Loan API SignIn");
	}
	
	@Test
	public void FarmLoanAPISignIn(){
		System.out.println("Farm Loan API SignIn");
	}
	 
}
