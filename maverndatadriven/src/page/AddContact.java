package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;




public class AddContact {

	WebDriver driver;
	
	public  AddContact(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.ID, using="account")
	WebElement full_name;
	
	@FindBy(how=How.ID,using="company")
	WebElement company_name;
	
	@FindBy(how=How.ID, using="email")
	WebElement email_address;
	@FindBy(how=How.ID,using="phone")
	WebElement phone_no;
	@FindBy(how=How.ID,using="address")
	WebElement addressbar;
	@FindBy(how=How.ID,using="city")
	WebElement city_name;
	@FindBy(how=How.ID,using="state")
	WebElement state_name;
	@FindBy(how=How.ID,using="zip")
	WebElement zipcode;
	
	@FindBy(how=How.ID,using="submit")
	WebElement submit;
	
     public void AddContacts(String account,String company,String email,String phone,String address,String city,String state,String zip)
     {
		
    	full_name.sendKeys(account);
    	company_name.sendKeys(company);
         email_address.sendKeys(email);
 		phone_no.sendKeys(phone);
 		addressbar.sendKeys(address);
 		city_name.sendKeys(city);
 		state_name.sendKeys(state);
 		zipcode.sendKeys(zip);
 		submit.click();
     }

	
		
	}


