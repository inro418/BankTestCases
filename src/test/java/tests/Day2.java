package tests;

import org.testng.annotations.Test;

public class Day2 {

	@Test
	public void CarLoanMobileSignIn(){
		// To get exclude remove this mark / from <class name="tests.Day2"/> to this <class name="tests.Day2">   
		
		System.out.println("Car Loan Mobile SignIn");
	}
	
	@Test(enabled = false) // it mean to exclude HomeLoanMobileSignIn
	public void HomeLoanMobileSignIn(){
		System.out.println("Home Loan Mobile SignIn");
	}
	
	@Test(groups ={"Smoke"})
	public void BusinessLoanMobileSignIn(){
		System.out.println("Business Loan Mobile SignIn");
	}
	
	@Test(dependsOnMethods ={"FarmLoanMobileSignIn"})  // it mean FarmLoanMobileSignIn executed before SchoolLoanMobileSignIn
	public void SchoolLoanMobileSignIn(){
		System.out.println("School Loan Mobile SignIn");
	}
	
	@Test
	public void HolidayLoanMobileSignIn(){
		System.out.println("Holiday Loan Mobile SignIn");
	}
	
	@Test
	public void InsuranceLoanMobileSignIn(){
		System.out.println("Insurance Loan Mobile SignIn");
	}
	
	@Test
	public void MortgageLoanMobileSignIn(){
		System.out.println("Mortgage Loan Mobile SignIn");
	}
	
	@Test
	public void FarmLoanMobileSignIn(){
		System.out.println("Farm Loan Mobile SignIn");
	}
}
