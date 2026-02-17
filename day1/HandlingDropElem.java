package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropElem {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");

		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//*[@id='button']/a/img")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yaju");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ved");

		WebElement dropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));

		Select dropSelect = new Select(dropDown);
		dropSelect.selectByIndex(4);
		
		WebElement dropDown1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select dropSelect1 = new Select(dropDown1);
		dropSelect1.selectByVisibleText("Automobile");
		
		WebElement dropDown2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select dropSelect2 = new Select(dropDown2);
		dropSelect2.selectByValue("OWN_CCORP");
		
		
	}

}
