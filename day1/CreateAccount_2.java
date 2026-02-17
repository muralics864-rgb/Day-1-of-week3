package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount_2 {

	public static void main(String[] args) throws InterruptedException {
		
		

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		 driver.findElement(By.id("username")).sendKeys("DemoCSR");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
	 driver.findElement(By.className("decorativeSubmit")).click();
	 driver.findElement(By.xpath("//img[@src='/opentaps_images/integratingweb/crm.png']")).click();
	 driver.findElement(By.xpath("//a[text()='Create Account']")).click();
	 driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Test Dua Account8");
	 driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
	 
	WebElement slctIndu = driver.findElement(By.xpath("//select[@name='industryEnumId']"));	
	Select slctIndustry = new Select(slctIndu);
	slctIndustry.selectByIndex(3);
	
	WebElement src = driver.findElement(By.xpath("//select[@id='dataSourceId']"));
	Select slctSrc = new Select(src);
	slctSrc.selectByValue("LEAD_EMPLOYEE");
	
	 WebElement marketing = driver.findElement(By.xpath("//select[@id='marketingCampaignId']"));
	Select slctMarketing = new Select(marketing);
	slctMarketing.selectByIndex(6);
	
	WebElement state = driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
	Select slctState = new Select(state);
	slctState.selectByValue("TX");
	
	WebElement oner = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
	Select slctOwner = new Select(oner);
	slctOwner.selectByVisibleText("S-Corporation");
	
	driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	Thread.sleep(4000);
	
	String title = driver.findElement(By.xpath("//span[contains(text(),'Test Dua Account8')]")).getText();
	
	if(!title.isEmpty())
	{
		System.out.println("Account Title is "+title);
	}
	else
	{
		System.out.println("Account title is not present");
	}
	
	driver.close();
	
	
	
	
	}

}
