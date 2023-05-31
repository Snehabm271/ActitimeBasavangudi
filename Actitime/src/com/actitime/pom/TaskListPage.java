package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCust;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class=\"inputFieldWithPlaceholder newNameField inputNameField\"]")
	private WebElement custName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement custDescription;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomer;
	
	/*@FindBy(xpath="//span[@class='customerSelectorPlaceholder selectorWithPlaceholderContainer']//input")
	private WebElement enterProject;*/
	
	/*@FindBy(xpath="(//div[@class='itemRow cpItemRow '])[1]")
	private WebElement DhsCompany;*/
	@FindBy(xpath="//div[text()='Big Bang Company'  and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustomerCreated;
	


	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNew() {
		return addNew;
	}

	public WebElement getNewCust() {
		return newCust;
	}

	public WebElement getCustName() {
		return custName;
	}

	public WebElement getCustDescription() {
		return custDescription;
	}

	public WebElement getSelectCustomer() {
		return selectCustomer;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getBigBangCompany() {
		return bigBangCompany;
	}
	public WebElement getActualCustomerCreated() {
		return actualCustomerCreated;
	}
	
	
	/*public void setenterProject()
	{
		enterProject.sendKeys(null);
	}*/

	/*public WebElement getEnterProject() {
		return enterProject;
	}*/

/*	public WebElement getDhsCompany() {
		return DhsCompany;
	}*/
	
	
}
