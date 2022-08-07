package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home extends pageBase{

	public Home(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//@FindBy(xpath="//*[@id=\"mount_0_0_ua\"]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]/div/svg/g/image")
	//WebElement sidemenu;
	
	
	//@FindBy(xpath = "//*[@id=\"mount_0_0_ua\"]/div/div[1]/div/div[2]/div[4]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div[1]/div[2]/div/div[5]/div/div[1]/div[2]/div/div/div/div/span")
	//WebElement logout;
	@FindBy(css="svg.pzggbiyp")
	WebElement navLabel;
	@FindBy(css ="span.d2edcug0.hpfvmrgz.qv66sw1b.c1et5uql.lr9zc1uh.a8c37x1j.fe6kdd0r.mau55g9w.c8b282yb.keod5gw0.nxhoafnm.aigsh9s9.d3f4x2em.iv3no6db.jq4qci2q.a3bd9o3v.ekzkrbhg.oo9gr5id.hzawbc8m")
	WebElement logoutclick;
    
	 public void userLogout() throws InterruptedException {
			
			//clickButton(sidemenu);
			//clickButton(logout);
		 clickButton(navLabel);
		Thread.sleep(2000);
		 //driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		    clickButton(logoutclick);
		 
		// WebDriverWait wait = new WebDriverWait(driver, 8);
		

		 //Wait
		 
		 
		}
	
}
