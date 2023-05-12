package com.hrms.lib;
import org.openqa. selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Global2 {
	//standard rule:To provide TestData&Objects of Whole application
	public WebDriver driver;
	//************TestData
	//   DT   Var     VV
	public String url ="http://183.82.103.245/nareshit/login.php";
	public String un ="nareshit";
	public String pw ="nareshit";
	//***********Objects/Elements
	public String txt_loginname ="txtUserName" ;
	public String txt_password = "txtPassword";
	public String btn_login = "Submit";
	public String link_logout ="Logout";
}

	

