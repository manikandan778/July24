package org.selrevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRevise {
		
	public static void main(String [] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\ManiSelnium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		WebElement entirewebtable = driver.findElement(By.xpath("//table[@id='customers']"));
		List<WebElement> allrowsfirsttable = entirewebtable.findElements(By.tagName("tr"));
		for(int i=0; i<allrowsfirsttable.size();i++) {
			
			WebElement individualrow = allrowsfirsttable.get(i);
			if(i==0) {
				List<WebElement> allheadingelements = individualrow.findElements(By.tagName("th"));
				for (int j=0;j<allheadingelements.size();j++) {
					String text = allheadingelements.get(j).getText();
					System.out.print(text+"\t");
				}
				System.out.println();
				
			}
			
			else{
				List<WebElement> allheadingelements1 = individualrow.findElements(By.tagName("td"));
				for (int h=0;h<allheadingelements1.size();h++) {
					WebElement IndividualData = allheadingelements1.get(h);
					System.out.print(IndividualData.getText()+"\t");
				}
				
				System.out.println();
				
			}
		}
	
	
	
	}
	
	
}
