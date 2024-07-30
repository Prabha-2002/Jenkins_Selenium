package com.prabha.restapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.prabha.restapp.model.Owner;
import com.prabha.restapp.service.OwnerService;

class OwnerServiceImplTest {
	@Autowired
	private OwnerService impl;

	WebDriver driver;

	@BeforeEach
	void open() {
		driver = new ChromeDriver();

	}
//

//	@AfterEach
//	void close() {
//		driver.close();
//	}

//	@Test
//	void testAddOwner() {
//		driver.get("http://localhost:3000/owner");
//		driver.findElement(By.name("name")).sendKeys("ghfj");
//		driver.findElement(By.name("aadhar")).sendKeys("9087655");
//		driver.findElement(By.name("noofhouses")).sendKeys("8");
//		driver.findElement(By.id("submit")).submit();
//		assertSame("Data added Successfully", "Data added Successfully");
//	}

//	@Test
//	void testAddOwner1() {
//		driver.get("http://localhost:3000/owner");
//		driver.findElement(By.name("name")).sendKeys("");
//		driver.findElement(By.name("aadhar")).sendKeys("9087655");
//		driver.findElement(By.name("noofhouses")).sendKeys("8");
//		driver.findElement(By.id("submit")).submit();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		String txt = alert.getText();
//		alert.accept();
//		assertEquals("Enter the name ", txt);	}

//
////	@Test
////	void testGetOwner() {
////		assertNotNull(impl.getOwner(1));
////	}
//
////	@Test
////	void testGetAllOwners() {
////		assertNotNull(impl.getAllOwners());
////	}
//
	@Test
	void testUpdateOwner() {
		driver.get("http://localhost:3000/editowner/11");
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("anbu");
		driver.findElement(By.name("aadhar")).clear();
		driver.findElement(By.name("aadhar")).sendKeys("3546");
		driver.findElement(By.name("noofhouses")).clear();
		driver.findElement(By.name("noofhouses")).sendKeys("54");
		driver.findElement(By.id("upd")).submit();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		String txt = alert.getText();
		alert.accept();
		assertEquals("Owner details Updated Successfully", txt);
	}

//	@Test
//	void testDeleteOwner() {
//	    driver.get("http://localhost:3000/viewowner");
//	    driver.findElement(By.cssSelector("tr:nth-child(1) .ms-1").id("delete")).click();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(500));
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		String txt = alert.getText();
//		alert.accept();
//		assertEquals("Do you want to delete the owner records?", txt);
//	    driver.close();
//	}
////
}
