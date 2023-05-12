package com.hrms.lib;
import org.openqa.selenium.WebDriver;


public class Global {
	WebDriver driver;
	//std rule : To provide TestData  & Objects of Whole application public WebDriver driver;
	//************TestData
	// DT Var VV
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String un = "nareshit";
	public String pw = "nareshit";
	public String efn = "bhavani";
	public String eln = "aerolla";
	//************Objects/Elements
	public String txt_loginname ="txtUserName";
	public String txt_password ="txtPassword";
	public String btn_login ="Submit";
	public String link_logout="Logout";
	public String frame_empinfo="rightMenu";
	public String btn_Add = "//input[@value='Add']";
	public String txt_lastname ="txtEmpLastName";
	public String txt_firstname ="txtEmpFirstName";
	public String btn_save ="btnEdit";
	public String btn_edit ="EditMain";
	public String btn_back ="backbutton";
	public String checkbox ="chkLocID";
}

