package com.selenium.locatePos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.DriverUtils1;

public class TestLocateByCssName {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    System.setProperty("browser.type", "firefox");
    WebDriver driver=DriverUtils1.getDriver();
    driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk.htm");
    Thread.sleep(2000);
    driver.findElement(By.id("xingMin")).sendKeys("zhangsan");
    Thread.sleep(2000);    
    driver.findElement(By.id("xingMin")).clear();
    System.out.println(driver.findElement(By.id("xingMin")).getAttribute("maxlength"));
    Thread.sleep(2000);
    driver.findElement(By.id("vcYffyqk")).sendKeys("aaaa\nbbbb\nccccc");
    Thread.sleep(2000);
    driver.quit();
	}

}
