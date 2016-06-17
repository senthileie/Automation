package com.indeed.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class indeedjobsearch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//currently using Firefox
		System.setProperty("Webdriver.firefox.driver","c:\\Selenium downloads\\chromedriver.exe");
		//Create firefox driver to drive the browser
		WebDriver driver = new FirefoxDriver();
		
		//To use Chrome uncomment the below 2 lines.
		//System.setProperty("webdriver.chrome.driver","c:\\Selenium downloads\\chromedriver.exe");
		//Create Chrome driver to drive the browser
		//WebDriver driver = new ChromeDriver();
		
		//Open Indeed home page
		driver.get("http://www.quotecarinsurance.ie/");
		//driver.manage().window().maximize() 
		driver.manage().window().maximize();
		//Find what field and Selenium
		Thread.sleep(1000);
		//Click on the Car Quote button, click on the check box and click on the I Accept button
		driver.findElement(By.className("button-1-car")).click();
		driver.findElement(By.name("checkbox")).click();
		driver.findElement(By.className("button-input")).click();
		
		//Enter the Policy details
		//"control_Person-Title_1" the values are Mr, Mrs, Ms, Miss, Dr
		driver.findElement(By.id("control_Person-Title_1")).sendKeys("Mrs");
		//"control_Person-FirstName_1"
		driver.findElement(By.id("control_Person-FirstName_1")).sendKeys("Senthil Kumar");		
		//"control_Person-Surname_1"
		driver.findElement(By.id("control_Person-Surname_1")).sendKeys("Velusamy");
		//"control_Person-Address1_1"
		driver.findElement(By.id("control_Person-Address1_1")).sendKeys("No 105");
		//"control_Person-Address2_1"
		driver.findElement(By.id("control_Person-Address2_1")).sendKeys("Elliskey");
		//"control_Person-Address3_1" 
		driver.findElement(By.id("control_Person-Address3_1")).sendKeys("Dublin 8");
		//"control_Person-SIDistrict_1" Value Dublin 1 DX1
		driver.findElement(By.id("control_Person-SIDistrict_1")).sendKeys("Dublin 8 DX8");
		//"control_Person-ContactTelephone_1"
		driver.findElement(By.id("control_Person-ContactTelephone_1")).sendKeys("0000000000");
		//"control_Person-ContactEmail_1"
		driver.findElement(By.id("control_Person-ContactEmail_1")).sendKeys("abc.xyz@gmail.com");
		//"control_Broker-HomeOwner" Value No, Yes
		driver.findElement(By.id("control_Broker-HomeOwner")).sendKeys("No");
		//"control_Policy-HoldingBroker_1" No, Yes
		driver.findElement(By.id("control_Policy-HoldingBroker_1")).sendKeys("No");
		//"control_Broker-Source" value Facebook
		driver.findElement(By.id("control_Broker-Source")).sendKeys("Facebook");
		//"controlDD_Policy-CoverDate_1" value 15
		driver.findElement(By.id("controlDD_Policy-CoverDate_1")).sendKeys("16");
		//"controlMM_Policy-CoverDate_1" Value 06
		driver.findElement(By.id("controlMM_Policy-CoverDate_1")).sendKeys("07");
		//"controlYYYY_Policy-CoverDate_1" Value 2016
		driver.findElement(By.id("controlYYYY_Policy-CoverDate_1")).sendKeys("2016");
		Thread.sleep(1000);
		driver.findElement(By.className("Next")).click();
		
		
		//Next PAge
		//"control_Policy-NumberOfPeople_1"
		driver.findElement(By.id("control_Policy-NumberOfPeople_1")).sendKeys("1");
		//"control_Person-HasNonMotorConv_1" Value Yes,No
		driver.findElement(By.id("control_Person-HasNonMotorConv_1")).sendKeys("No");
		//"control_Person-Gender_1" Velue Female, Male
		driver.findElement(By.id("control_Person-Gender_1")).sendKeys("Male");
		//"control_Person-ResPeriod_1"
		driver.findElement(By.id("control_Person-ResPeriod_1")).sendKeys("4");
		//"control_Person-ResUnit_1" Value Year, Months
		driver.findElement(By.id("control_Person-ResUnit_1")).sendKeys("Year");
		//"control_Person-Occupation-OccType_1-1" Value Computer Manager
		driver.findElement(By.id("control_Person-Occupation-OccType_1-1")).sendKeys("Computer Manager");
		//"control_Person-Occupation-BusType_1-1" Value Computer Services 
		driver.findElement(By.id("control_Person-Occupation-BusType_1-1")).sendKeys("Computer Services");
		//"control_Person-Occupation-EmpStat_1-1" Value Employed
		driver.findElement(By.id("control_Person-Occupation-EmpStat_1-1")).sendKeys("Employed");
		//"control_Person-PrivateMileage_1"
		driver.findElement(By.id("control_Person-PrivateMileage_1")).sendKeys("4000");
		//"control_Person-LicType_1" Value Provisional
		driver.findElement(By.id("control_Person-LicType_1")).sendKeys("Provisional");
		//"control_Person-LicCountry_1" Value Ireland
		driver.findElement(By.id("control_Person-LicCountry_1")).sendKeys("Ireland");
		//"control_Person-LicHeld_1"
		driver.findElement(By.id("control_Person-LicHeld_1")).sendKeys("1");
		//"control_Person-LicUnit_1" Value Months, Year
		driver.findElement(By.id("control_Person-LicUnit_1")).sendKeys("Year");
		//"control_Person-InfInd_1" Value No
		driver.findElement(By.id("control_Person-InfInd_1")).sendKeys("No");
		//"control_Person-OtherVehInd_1" Value No
		driver.findElement(By.id("control_Person-OtherVehInd_1")).sendKeys("No");
		Thread.sleep(1000);
		driver.findElement(By.className("Next")).click();
	}

}
