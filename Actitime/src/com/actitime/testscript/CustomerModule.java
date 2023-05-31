package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
import com.actititme.generic.BaseClass;
import com.actititme.generic.FileLib;
@Listeners(com.actititme.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {

	@Test
	public void createCustomer() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Reporter.log("createCustomer",true);
		FileLib f=new FileLib();
		String customerName = f.getExcelData("CreateCustomer", 1, 3);
		String customerDescription = f.getExcelData("CreateCustomer", 1, 4);
		HomePage h=new HomePage(driver);
		h.setTask();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNew().click();
		t.getNewCust().click();
		t.getCustName().sendKeys(customerName);
		t.getCustDescription().sendKeys(customerDescription);
		t.getSelectCustomer().click();
		t.getBigBangCompany().click();
		t.getCreateCustomerBtn().click();
		Thread.sleep(5000);
		String actualCustomer=t.getActualCustomerCreated().getText();
		Assert.assertEquals(actualCustomer, customerName);
		
	}
}
