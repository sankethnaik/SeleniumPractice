package com.kasua.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.kasua.generic.BaseClass;

import basics.DemoDashboards;

public class DashboardModule extends BaseClass {
	
	@Test
	public void createDashBoard() throws EncryptedDocumentException, IOException {
		String expectedComponent = f.getExcelData("Dashboards",1,0);
		System.out.println(expectedComponent);
		String expReport=f.getExcelData("Dashboards",1,1);
		System.out.println(expReport);
		
		DemoDashboards d=new DemoDashboards();
		
		
	}
	
	

}
