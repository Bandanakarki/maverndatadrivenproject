package test;
import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddContact;
import page.Techfios_homepage;
import page.Techfios_login;
import reader.ReadData;
import util.BrowserFactory;


public class AddContactTest {


	ReadData readExcelData= new ReadData();
		
		String Username;
		String Password;
		String  full_name;
	 	String company_name;
	 	String	email;
	 	String	phone;
	 	String address;
	 	String city;
	 	String state;
	 	String 	zip;
		
		
		public AddContactTest() throws IOException{
			
		String userdata[][]=readExcelData.getLogInDataFromExcelFile();
		for(int j=1; j<userdata.length;j++)
		{
			Username=userdata[j][0];
			Password=userdata[j][1];
			full_name=userdata[j][9];
			company_name=userdata[j][10];
			email=userdata[j][11];
			phone=userdata[j][12];	
			address=userdata[j][13];
			city =userdata[j][14];
			state=userdata[j][15];
			zip=userdata[j][16];
		}		
		}
		
		@Test
		public void AddContactTest() throws IOException{
			
			WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
			Techfios_login login = PageFactory.initElements(driver, Techfios_login.class);
			login.login_techfios(Username, Password);
			
			Techfios_homepage home = PageFactory.initElements(driver, Techfios_homepage.class);		
			home.gototab();
		
			AddContact info = PageFactory.initElements(driver, AddContact.class);	
			info.AddContacts(full_name,company_name,email,phone,address,city,state,zip);
			
				
			
			driver.close();
			driver.quit();
		}

}

