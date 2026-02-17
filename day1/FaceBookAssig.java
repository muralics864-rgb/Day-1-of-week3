package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAssig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);

		driver.manage().window().maximize();
		driver.get(" https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Dua");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Niha");

		WebElement dat = driver.findElement(By.id("day"));
		WebElement mon = driver.findElement(By.id("month"));
		WebElement yer = driver.findElement(By.id("year"));

		Select chooseDate = new Select(dat);
		chooseDate.selectByIndex(2);

		Select chooseMonth = new Select(mon);
		chooseMonth.selectByIndex(7);

		Select chooseYear = new Select(yer);
		chooseYear.selectByVisibleText("1990");

		// Selecting Sex

		driver.findElement(By.xpath("//label[text()='Male']")).click();

		// updating phone number

		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8056374784");

		// updating password

		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Niha@2025");
	}

}
