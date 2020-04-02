package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {

	@Test(groups = { "Smoke" })
	public void CarLoanWebSignIn() {
		System.out.println("Car Web signIn");
	}

	@Test
	public void HomeLoanWebSignIn() {
		System.out.println("Home Loan Web SignIn");
	}

	@Parameters({ "URL" })// This is to print the URL in the testng.xml console
	@Test
	public void BusinessLoanWebSignIn(String urlname) {
		System.out.println("Business Loan Web SignIn"); 
	    System.out.println(urlname);
	}

	@Test()
	public void SchoolLoanWebSignIn() {
		System.out.println("School Loan Web SignIn");
	}

	@Test
	public void HolidayLoanWebSignIn() {
		System.out.println("Holiday Loan Web SignIn");
	}

	@Test
	public void InsuranceLoanWebSignIn() {
		System.out.println("Insurance Loan Web SignIn");
	}

	@Test()
	public void MortgageLoanWebSignIn() {
		System.out.println("Mortgage Loan Web SignIn");
		System.out.println("I will failed executed Listeners Pass code");
		Assert.assertTrue(false);
	}

	@Test
	public void FarmLoanWebSignIn() {
		System.out.println("Farm Loan Web SignIn");
	}
}
