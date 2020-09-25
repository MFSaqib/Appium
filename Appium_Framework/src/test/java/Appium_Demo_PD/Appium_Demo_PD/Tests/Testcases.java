package Appium_Demo_PD.Appium_Demo_PD.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcases extends BaseClass{

	@Test(priority=1)
	public void addition() 
	
	{
		WebElement sev = driver.findElement(By.id("com.oneplus.calculator:id/digit_7"));
		WebElement add = driver.findElement(By.id("com.oneplus.calculator:id/op_add"));
		WebElement nine = driver.findElement(By.id("com.oneplus.calculator:id/digit_9"));
		WebElement equals = driver.findElement(By.id("com.oneplus.calculator:id/eq"));
		WebElement Add_result = driver.findElement(By.id("com.oneplus.calculator:id/result"));
		
		sev.click();
		add.click();
		nine.click();
		equals.click();
		
		String result1 = Add_result.getText();
		System.out.println("Addition Resultis .."+result1);
		
	}
	
	@Test(priority=2)
	public void Subtraction() 
	{
		WebElement sev = driver.findElement(By.id("com.oneplus.calculator:id/digit_7"));
		WebElement sub = driver.findElement(By.id("com.oneplus.calculator:id/op_sub"));
		WebElement nine = driver.findElement(By.id("com.oneplus.calculator:id/digit_9"));
		WebElement equals = driver.findElement(By.id("com.oneplus.calculator:id/eq"));
		WebElement Sub_result = driver.findElement(By.id("com.oneplus.calculator:id/result"));
		
		sev.click();
		sub.click();
		nine.click();
		equals.click();
		
		String result2 = Sub_result.getText();
		System.out.println("Addition Resultis .."+result2);
		
	}
	
	@Test(priority=3)
	public void Multiply() 
	{
		WebElement sev = driver.findElement(By.id("com.oneplus.calculator:id/digit_7"));
		WebElement mul = driver.findElement(By.id("com.oneplus.calculator:id/op_mul"));
		WebElement nine = driver.findElement(By.id("com.oneplus.calculator:id/digit_9"));
		WebElement equals = driver.findElement(By.id("com.oneplus.calculator:id/eq"));
		WebElement mul_result = driver.findElement(By.id("com.oneplus.calculator:id/result"));
		
		sev.click();
		mul.click();
		nine.click();
		equals.click();
		
		String result3 = mul_result.getText();
		System.out.println("Addition Resultis .."+result3);
	}
}
