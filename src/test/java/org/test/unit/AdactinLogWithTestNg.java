package org.test.unit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinLogWithTestNg {
	
	
	WebDriver driver;

	@BeforeClass
	private void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
	}
	@Parameters({"username"})
	@Test(priority=0)
	private void username(String s) {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(s);

	}
	@Parameters({"password"})
	@Test(priority=1)
	private void password(String s) {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(s);
	}
	@Test(priority=2)
	private void login() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}
	@Test(priority=3)
	private void location() {
		WebElement location = driver.findElement(By.id("location"));
		Select select = new Select(location);
		select.selectByIndex(2);
	}
	@Test(priority=4)
	private void hotels() {
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select select1 = new Select(hotels);
		select1.selectByIndex(2);
	}
	@Test(priority=5)
	private void roomtype() {
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select select2 = new Select(roomtype);
		select2.selectByIndex(2);
	}
	@Test(priority=6)
	private void noofrooms() {
		WebElement noOfRooms = driver.findElement(By.id("room_nos"));
		Select select3 = new Select(noOfRooms);
		select3.selectByIndex(2);
	}
	@Parameters({"checkin"})
	@Test(priority=7)
	private void checkin(String s) {
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		checkin.sendKeys(s);
	}
	@Parameters({"checkout"})
	@Test(priority=8)
	private void checkout(String s) {
		WebElement checkout = driver.findElement(By.id("datepick_in"));
		checkout.sendKeys(s);
	}
	@Test(priority=9)
	private void adultroom() {
		WebElement adultroom = driver.findElement(By.id("adult_room"));
		Select select4 = new Select(adultroom);
		select4.selectByIndex(2);
	}
	@Test(priority=10)
	private void childrenroom() {
		WebElement childrenroom = driver.findElement(By.id("child_room"));
		Select select5 = new Select(childrenroom);
		select5.selectByIndex(1);

	}
	@Test(priority=11)
	private void search() {
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
	}
	@Test(priority=12)
	private void radiobtn() {
		WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
		radiobtn.click();
	}
	@Test(priority=13)
	private void continuebtn() {
		WebElement continuebtn = driver.findElement(By.id("continue"));
		continuebtn.click();
	}
	@Parameters({"firstname"})
	@Test(priority=14)
	private void firstname(String s) {
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys(s);
	}
	@Parameters({"lastname"})
	@Test(priority=15)
	private void lastname(String s) {
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("krish");
	}
	@Parameters({"address"})
	@Test(priority=16)
	private void address(String s) {
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("chennai");
	}
	@Parameters({"ccnum"})
	@Test(priority=17)
	private void ccnum(String s) {
		WebElement cc_num = driver.findElement(By.id("cc_num"));
		cc_num.sendKeys("1234567890123456");
	}
	@Test(priority=18)
	private void cctype() {
		WebElement cc_type = driver.findElement(By.id("cc_type"));
		Select select6 = new Select(cc_type);
		select6.selectByIndex(1);

	}
	@Test(priority=19)
	private void ccexpmonth() {
		WebElement cc_exp_month = driver.findElement(By.id("cc_exp_month"));
		Select select7 = new Select(cc_exp_month);
		select7.selectByIndex(12);
	}
	@Test(priority=20)
	private void ccexpyear() {
		WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
		Select select8 = new Select(cc_exp_year);
		select8.selectByIndex(12);

	}
	@Parameters({"ccCvv"})
	@Test(priority=21)
	private void ccCvv(String s) {
		WebElement cc_cvv = driver.findElement(By.id("cc_cvv"));
		cc_cvv.sendKeys(s);
	}
	@Test(priority=22)
	private void booknow() {
		WebElement book_now = driver.findElement(By.id("book_now"));
		book_now.click();
		
	}

}
