package com.example.seleniumAutomate;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.time.LocalTime;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@SpringBootApplication
public class SeleniumAutomateApplication {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://thechefkart.easyhrworld.com/employee");

		String userName = "//*[@id=\"username\"]";
		WebElement searchBoxElement = driver.findElement(new By.ByXPath(userName));
		searchBoxElement.sendKeys("your easy hr email");

		String password = "//*[@id=\"password\"]";
		WebElement passwordBoxElement = driver.findElement(new By.ByXPath(password));
		passwordBoxElement.sendKeys("your easy hr password");

		// *[@id="btnCheckIn"]
		String loginButton = "//*[@id=\"btnSignin\"]";
		WebElement loginButtonElement = driver.findElement(new By.ByXPath(loginButton));
		loginButtonElement.click();

		String checkInButton = "//*[@id=\"btnCheckIn\"]";
		WebElement checkInButtonElement = driver.findElement(new By.ByXPath(checkInButton));

		String checkoutButton = "//*[@id=\"btnCheckOut\"]";
		WebElement checkOutButtonElement = driver.findElement(new By.ByXPath(checkoutButton));

		LocalTime now = LocalTime.now();
		now = now.

		LocalTime morningStartTime = LocalTime.parse("09:00");
		LocalTime morningEndTime = LocalTime.parse("10:00");
		Boolean isBetween1 = now.isAfter(morningStartTime) && now.isBefore(morningEndTime);

		LocalTime eveningStartTime = LocalTime.parse("18:00");
		LocalTime eveningEndTime = LocalTime.parse("00:00");
		Boolean isBetween2 = now.isAfter(eveningStartTime) && now.isBefore(eveningEndTime);

		if (isBetween1) {
			checkInButtonElement.click();
		} else if (isBetween2) {
			checkOutButtonElement.click();
		} else {
			System.out.println("Not in working hours");
		}

	}

}
