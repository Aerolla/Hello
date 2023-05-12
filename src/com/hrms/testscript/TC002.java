package com.hrms.testscript;

import com.hrms.lib.General;

public class TC002 {
	public static void main(String args[]) {
		//Test Steps
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
	}
}

