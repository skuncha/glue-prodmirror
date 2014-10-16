package happyPathTests.pages;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import net.thucydides.core.Thucydides;
import net.thucydides.core.csv.CSVTestDataSource;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Srinivasa.Kuncha
 * @see CreateDirectOrders
 */
public class SalesforceGlueAccountPage  extends PageObject {
	int i=0;
	int j=0;
	int synctimeforSOPID = 5;
	String ref;
	String financeID;
	String clientURL;
	ArrayList<String> arraylist = new ArrayList<String>(); 

/***********************************************************************WEB ELEMENTS************************************************************************************/
	
	private WebElementFacade salutation() 		 { return element(By.id("00ND0000005jggD"));							}
	private WebElementFacade firstname() 		 { return element(By.id("00ND0000005jgg9"));							}
	private WebElementFacade parentAccount()     { return element(By.cssSelector("#acc3"));								}
	private WebElementFacade phoneNumber()       { return element(By.cssSelector("#acc10"));							}
	private WebElementFacade accountName()       { return element(By.cssSelector("#acc2"));								}
	private WebElementFacade selectAccountType() { return element(By.id("p3")); 										}
	private WebElementFacade selectTypeOfAccount() { return element(By.id("acc6")); 									}
	private WebElementFacade billingStreet()     { return element(By.cssSelector("#acc17street"));       				}
	private WebElementFacade billingPostCode()   { return element(By.cssSelector("#acc17zip"));							}
	private WebElementFacade newButton() 		 { return element(By.cssSelector("input[value=' New ']"));				}
	private WebElementFacade readAccountName()   { return element(By.xpath(".//*[@id='contactHeaderRow']/div[2]/h2"));  }
	private WebElementFacade mainCate()           { return element(By.name("j_id0:j_id1:j_id27:j_id36"));				}
	private WebElementFacade subCate()            { return element(By.name("j_id0:j_id1:j_id27:subcategory"));			}
	private WebElementFacade minorCate()          { return element(By.name("j_id0:j_id1:j_id27:minor"));				}
	private WebElementFacade saveIndCate()        { return element(By.name("j_id0:j_id1:j_id27:j_id28:j_id29"));		}
	private WebElementFacade newAccountButtonChild() { return element(By.cssSelector("input[value='New Account']"));	}
	private WebElementFacade continueButt()          { return element(By.cssSelector("input[value='Continue']")); 		}
	private WebElementFacade type() 				{ return element(By.xpath("//div[@id='ep']/div[2]/div[3]/table/tbody/tr/td[4]/div/span/select/option[2]"));  }
	private WebElementFacade searchCustomerName() 	{ return element(By.xpath("//td[contains(label,'Customer Name or Aliases')]/input"));		}
	private WebElementFacade createDirectOrder() 	{ return element(By.cssSelector("input[value='Create Direct Order']"));						}
	private WebElementFacade billingSelection() 	{ return element(By.id("j_id0:j_id1:i:f:pb:d:Billing_Selection.input"));					}
	private WebElementFacade billingOption() 	    { return element(By.id("j_id0:j_id1:i:f:pb:d:Billing_Options.input"));						}
	private WebElementFacade billingSelectionNext() { return element(By.id("j_id0:j_id1:i:f:pb:pbb:bottom:next"));								}
	private WebElementFacade finish() 				{ return element(By.cssSelector("input[value='Finish']"));									}
	private WebElementFacade CCICustomerMail()      { return element(By.cssSelector("input[value='Create CCI Customer-Mail']"));				}
	private WebElementFacade accountType() 			{ return element(By.id("j_id0:j_id1:i:f:pb:d:Account4Contact.input"));		}
	private WebElementFacade emailAddress() 		{ return element(By.id("j_id0:j_id1:i:f:pb:d:EmailAddress.input"));			}
	private WebElementFacade contactNext() 			{ return element(By.id("j_id0:j_id1:i:f:pb:pbb:bottom:next"));				}
	private WebElementFacade conSalutation() 		{ return element(By.id("j_id0:j_id1:i:f:pb:d:Salutation.input"));			}
	private WebElementFacade conFirstName() 		{ return element(By.id("j_id0:j_id1:i:f:pb:d:FirstName.input"));			}
	private WebElementFacade conLastName() 			{ return element(By.id("j_id0:j_id1:i:f:pb:d:LastName.input"));				}
	private WebElementFacade conPhonenumebr() 		{ return element(By.id("j_id0:j_id1:i:f:pb:d:Phone.input"));				}
	private WebElementFacade orderId() 				{ return element(By.xpath("//*[@id='salesforce-plugin']/article/aside[1]/div/div/pre"));		}
	
	@FindBy(how = How.LINK_TEXT, using = "Accounts")
	private WebElement accounts;
	@FindBy(how = How.XPATH, using = "//div[@class='pbBottomButtons']//input[@value='Search']")
	private WebElement customerSearchButton;
	@FindBy(how = How.CSS, using = "input[value=' Save ']")
	private WebElement saveButton;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "AM-")
	private WebElement accountMapping;
	private WebElementFacade customerRef()        { return element(By.xpath("//*[@id='00ND0000005WVcQ_ileinner']"));		}
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "-Mail Advertising")
	private WebElement financeAccount;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "W8 5TT")
	private WebElement privateAdvFinanceAccount;
	private WebElementFacade FinanceAccNum()     { return element(By.xpath(".//*[@id='ep']/div[2]/div[2]/table/tbody/tr[3]/td[2]"));}
	private WebElementFacade CCIMailCustomerID() { return element(By.xpath(".//*[@id='ep']/div[2]/div[2]/table/tbody/tr[5]/td[4]"));}
	private WebElementFacade SOPID() 			 { return element(By.xpath(".//*[@id='ep']/div[2]/div[2]/table/tbody/tr[9]/td[2]"));}
	@FindBy(how = How.XPATH, using = "//input[@title='New Relationship']")
	private WebElement newRelationship;
	private WebElementFacade accountB_Name() 	  { return element(By.id("CF00ND0000003g0n9"));							}
	private WebElementFacade billing() 			  { return element(By.id("00ND0000003g0nB"));							}
	@FindBy(how = How.XPATH, using = "//td[@id='bottomButtonRow']/input[@title='Save']")
	private WebElement saveRelationship;
	private WebElementFacade billingRef()        { return element(By.xpath("//*[@id='j_id0:j_id1:i:f:pb:d:Billing_AgenciesList.input']/option[1]"));}
	private WebElementFacade selectBillingRef()  { return element(By.xpath("//*[@id='j_id0:j_id1:i:f:pb:d:Account4Contact.input']/option[1]"));		}
	private WebElementFacade busyIntegrating() 	 { return element(By.xpath("//*[@id='j_id0:j_id1:i:f:pb:d:Msg']"));				                    }
	private WebElementFacade syncNext() 		 { return element(By.id("j_id0:j_id1:i:f:pb:pbb:bottom:next"));				                        }
	private WebElementFacade searchGlue() 		 { return element(By.id("phSearchButton"));				                         	 				}
	private WebElementFacade orderlink() 		 { return element(By.xpath("//*[@id='Order_body']/table/tbody/tr[2]/th/a"));						}
	private WebElementFacade orderID() 			 { return element(By.xpath("//*[@id='ep']/div[2]/div[2]/table/tbody/tr[10]/td[2]"));                }
    private WebElementFacade searchTerms()		 { return element(By.xpath("//div/input"));                 										}
    private WebElementFacade orderPurchaseNo()   { return element(By.id("Order.Identification:order.purchaseOrderNo"));								}
    private WebElementFacade orderNote()         { return element(By.id("Order.Identification:order.note"));					   					}
    private WebElementFacade orderUrgentNote()   { return element(By.id("Order.Identification:order.message"));										}
    private WebElementFacade orderSalesRepId()   { return element(By.id("Order.SalesTerritory:order.primarySalesRep.id"));							}
    private WebElementFacade addPackage()   	 { return element(By.xpath("//h4/a/span/input"));													}
    private WebElementFacade title() 			 { return element(By.id("Order.Schedule:sched.titleCode"));											}
    private WebElementFacade selectPublication() { return element(By.id("Order.Schedule:sched.publicationCode"));									}
    private WebElementFacade webSiteCategory()   { return element(By.id("Order.Schedule:sched.webSiteCategoryCode"));								}
    private WebElementFacade selectSection()     { return element(By.id("Order.Schedule:sched.sectionCode"));										}
    private WebElementFacade webSite()   		 { return element(By.id("Order.Schedule:sched.webSiteCode"));										}
    private WebElementFacade selectSubSection()  { return element(By.id("Order.Schedule:sched.subSectionCode"));									}
    private WebElementFacade selectZone()   	 { return element(By.id("Order.Schedule:"));														}
    private WebElementFacade distribution()   	 { return element(By.id("rder.Schedule:sched.distributionCode"));									}
    private WebElementFacade noOfInserts()   	 { return element(By.id("Order.Schedule:sched.noOfInserts"));										}
    private WebElementFacade saveOrder()   	     { return element(By.xpath("//nav[button='Save']/button[2]"));										}
    private WebElementFacade selectModule()   	 { return element(By.id("Order.Schedule.Material:material.moduleCode"));							}
    private WebElementFacade nextMonth()   	 	 { return element(By.xpath("//thead/tr[1]/th/span[4]/span[3]/i"));									}
    private WebElementFacade selectPrice()   	 { return element(By.xpath(".//*[@id='SchedulingAccordion']/div/div[3]/div[1]/h4/a/span"));			}
    private WebElementFacade selectRevenue()   	 { return element(By.id("Order.Price:UserRevenue"));												}
    private WebElementFacade updateRevenue()   	 { return element(By.xpath("//fieldset/div/div[2]/div/div/span/button"));							}
    private WebElementFacade acceptOrder()   	 { return element(By.xpath("//nav[button='Accept']/button[3]"));									} 
    
/***********************************************************************WEB ELEMENTS************************************************************************************/
	public void type(String mytype) {
    	Select droplist = new Select(find(By.id("acc6")));   
    	droplist.selectByVisibleText(mytype);
    }
    
    public void newAccount() {
    	newButton().click();
    }
     
    public void newAccountChild(String keyword) {
    	
    	waitFor(8).second();
    	searchCustomerName().type(keyword);
    	customerSearchButton.click();
    }
    
    public void newAccountButtonFromSearchResultsSection() {
    	waitFor(6).second();
    	newAccountButtonChild().click();
    }
    
    public void accountMapping(){
    	
    	accountMapping.click();
    	waitFor(3).seconds();
    	getDriver().navigate().back();
    	waitFor(8).seconds();
    }
    
    public void accountCreation(){
    		waitFor(6).seconds();
    		accounts.click();
    		waitFor(6).seconds();
			newButton().click();
			waitFor(4).seconds();
			searchCustomerName().type("xyz");
	    	customerSearchButton.click();
	    	waitFor(4).seconds();
	    	newAccountButtonChild().click();
	    	waitFor(3).seconds();
    }
    
    public void CCIMailIntegration(){
    	
    	CCICustomerMail().click();
    	waitFor(8).seconds();
		getDriver().switchTo().alert().accept();  
		waitFor(15).seconds();
		getDriver().switchTo().alert().accept(); 
		waitFor(8).seconds();
    }
    
/**************************************************************CSVFile*****************************************************/
    public void read_input(String fileLoc) {
    	System.out.println("\n");
		File filePath = new File(fileLoc);
		if (filePath.isFile()) {
			String file = filePath.getAbsolutePath();
			try {
				CSVTestDataSource testDataSrc = new CSVTestDataSource(file);
				for (Map<String, String> record : testDataSrc.getData()) {
				
/************** Select Agency Type ******************************************/  
					
				    selectAccountType().selectByVisibleText(record.get("type"));
				    continueButt().click();
				    long timeNow = System.currentTimeMillis();
/************** Supply User Account details ********************************/  
				  
				    waitFor(5).seconds();
				    String str = record.get("accountType");
				    selectTypeOfAccount().selectByVisibleText(record.get("accountType"));
			    	accountName().type(record.get("lastName") + " - "+ timeNow);
			    	phoneNumber().type(record.get("phone"));
			    	billingStreet().type(record.get("billingStreet"));
			    	billingPostCode().type(record.get("postalCode"));

					    	if (type().getText().equalsIgnoreCase("Brand")) {
								parentAccount().type(record.get("parentAccount"));
								waitABit(1000);
							}
			    	 
					    	if (str.equalsIgnoreCase("Private Advertiser")) {
					    		 salutation().selectByVisibleText(record.get("salutation"));
				    		     firstname().type(record.get("firstName"));
					    	}
			    	
					    	if (str.equalsIgnoreCase("Direct Advertiser") || str.equalsIgnoreCase("Charity") || str.equalsIgnoreCase("Brand")|| str.equalsIgnoreCase("Client") || str.equalsIgnoreCase("DMGT Group")) 
					    	{
					    		waitABit(1000);
								saveButton.click();
								String Name = readAccountName().getText();
						    	arraylist.add(Name);
						    	clientURL = getDriver().getCurrentUrl();
						    	waitFor(6).seconds();
/**************************************************************************/ 
									    	if (str.equalsIgnoreCase("Client") || str.equalsIgnoreCase("DMGT Group")) 
									    	{
										    		String readClientAccountName = readAccountName().getText();
										    		clientURL = getDriver().getCurrentUrl();
										    		accountCreation();
										    		selectAccountType().selectByVisibleText("Agency"); //Create Billing a/c
										    		continueButt().click();
										    		waitFor(3).seconds();
													accountName().type("Billing Agency " + timeNow);
										    		phoneNumber().type(record.get("phone"));
											    	billingStreet().type(record.get("billingStreet"));
											    	billingPostCode().type(record.get("postalCode"));
											    	waitFor(1).seconds();
													saveButton.click();
													waitFor(8).seconds();
													CCIMailIntegration(); // CCIMail Integration
													financeAccount.click(); 
													waitFor(5).seconds();
													String id = SOPID().getText();
													while(id.equals(" ")) {
															waitFor(2).seconds();
															getDriver().navigate().back();
															waitFor(20).seconds();
															financeAccount.click();
															waitFor(5).seconds();
															id = SOPID().getText();
															synctimeforSOPID = synctimeforSOPID + 25;
														}
													financeID = id;
													System.out.print("***** " +j + ". " + "A/C Name : "+arraylist.get(i) +  " +  SOPID : " +financeID + " + ");
													getDriver().navigate().back();
													waitFor(8).seconds();
													newRelationship.click(); 
													waitFor(3).seconds();
													accountB_Name().type(readClientAccountName);
											    	billing().selectByVisibleText("Billing");
											    	saveRelationship.click();
											    	waitFor(6).seconds();
											    	getDriver().get(clientURL); // Back to client account page
											    	waitFor(6).seconds();
									    	}
/************** Select Industry Category **********************************/
							    	getDriver().switchTo().frame("066D0000000kh27");
							    	WebElement editable = getDriver().switchTo().activeElement();
							    	editable.findElement(By.cssSelector("input[name='j_id0:j_id1:j_id27:j_id28:j_id31']")).click();
							    	waitFor(4).seconds();
						    	   	mainCate().selectByVisibleText(record.get("mainCategory"));
						    	   	waitFor(4).seconds();
							 	    subCate().selectByVisibleText(record.get("subCategory"));
							 	    waitFor(4).seconds();
							 	    minorCate().selectByVisibleText(record.get("minorCategory"));
							 	    waitFor(5).seconds();
							 	    saveIndCate().sendKeys(Keys.RETURN);
							 	    waitFor(4).seconds();
								    getDriver().switchTo().defaultContent();
					    	}
						    	else 
						    	{
						    	saveButton.click();
						    	String Name = readAccountName().getText();
						    	arraylist.add(Name);
						    	clientURL = getDriver().getCurrentUrl();
						    	waitFor(6).seconds();
						    	}
					    	 
									if (str.equalsIgnoreCase("Direct Advertiser") || str.equalsIgnoreCase("Charity") || str.equalsIgnoreCase("Brand")|| str.equalsIgnoreCase("Private Advertiser")){
										
										 CCIMailIntegration(); // CCIMail Integration
										 waitFor(8).seconds();
										 accountMapping(); /**************  Account Mapping  *******************************************/
										 
												if (str.equalsIgnoreCase("Private Advertiser")){
													privateAdvFinanceAccount.click();   /***** DEPENDENDT ON POSTCODE SUPPLIED*************/
													waitFor(5).seconds();
													String id = SOPID().getText();
													while(id.equals(" ")) {
															waitFor(2).seconds();
															getDriver().navigate().back();
															waitFor(20).seconds();
															privateAdvFinanceAccount.click();
															waitFor(5).seconds();
															id = SOPID().getText();
															synctimeforSOPID = synctimeforSOPID + 25;
													}
												} 
												else 
													{ 
														financeAccount.click(); 
													}	
												
												waitFor(5).seconds();
												String id = SOPID().getText();
												while(id.equals(" ")) {
														waitFor(2).seconds();
														getDriver().navigate().back();
														waitFor(20).seconds();
														financeAccount.click();
														waitFor(5).seconds();
														id = SOPID().getText();
														synctimeforSOPID = synctimeforSOPID + 25;
													}
										 financeID = id;
										 ref =CCIMailCustomerID().getText();
										System.out.print("***** " +j + ". " +"A/C Name : "+arraylist.get(i) + " +  A/C ID : " +ref + " +  SOPID : " +SOPID().getText() + " + ");
										getDriver().navigate().back();
									}
									else {
										CCIMailIntegration();
										accountMapping.click();
								    	waitFor(3).seconds();
								    	ref = customerRef().getText();
								    	getDriver().navigate().back();
								    	waitFor(8).seconds();
									}
						waitFor(5).seconds();
						createDirectOrder().click();
								
/**************  Select Order Type *************************************************************/
				    	
						if (str.equalsIgnoreCase("Direct Advertiser") || str.equalsIgnoreCase("Charity") || str.equalsIgnoreCase("Client") || str.equalsIgnoreCase("DMGT Group")) 
				    	{
							waitFor(6).seconds();
							
							    	if (str.equalsIgnoreCase("Client") || str.equalsIgnoreCase("DMGT Group"))
							    	{
							    		
							    		billingRef().click();
							    		billingSelectionNext().click();
							    		waitFor(5).seconds();
								    		try {
								    			 while(busyIntegrating().getText()!=null) {
								    				 
								    				 waitFor(30).seconds();
								    				 syncNext().click();
								    				 synctimeforSOPID = synctimeforSOPID + 30;
								    			 }
								    		} catch (Exception e) {}
							    	}
							    	else {
							    		
							    		billingSelection().selectByVisibleText("Direct");
									 	billingSelectionNext().click();  
							    	}
				    	}	
					if (str.equalsIgnoreCase("Brand"))
					{
						waitFor(3).seconds();
			    		billingOption().selectByVisibleText("Direct");
			    		billingSelectionNext().click(); 
			    	}
/**************  Create Contact ******************************************************************/
					 	
					 	waitFor(4).seconds();
						conSalutation().selectByVisibleText(record.get("salutation"));
		    		    conFirstName().type(record.get("firstName"));
		    		    conLastName().type(timeNow + record.get("lastName"));
				    	emailAddress().type(record.get("email"));
					   	conPhonenumebr().type(record.get("phone"));
					   	
/**************  Associate Account*****************************************************************/				    	
				    	
					   	if (str.equalsIgnoreCase("Client") || str.equalsIgnoreCase("DMGT Group")) 
					   	{
				    		selectBillingRef().click();
				    		waitFor(1).seconds();
				    		i++;
				    	}
						   	else 
						   	{
						   		String endUseraccount = arraylist.get(i);
								accountType().selectByVisibleText(endUseraccount);
								waitFor(1).seconds();
								i++;
						   	}
						contactNext().click();
						waitFor(1).seconds();
						finish().click();
						
/************** Launch OrderPlugin and Create Order*************************************************/
						
						 waitFor(20).seconds();
						 
						 /*String sourceURL =getDriver().findElement(By.xpath("//*[@id='j_id0:j_id8']/div[2]/iframe")).getAttribute("src");
						 String[] firstsplit = sourceURL.split("authorizationcode=");
						 System.out.println("FIRST SPLIT                 ----> " +firstsplit[1]);
						 String[] secondpartsplit = firstsplit[1].split("\\&clientid=");
						 String acode = secondpartsplit[0];
						 String add = "&clientid=";
						 String orderinfo =secondpartsplit[1];
						 System.out.println("AUTH CODE                      =>  "+acode);	
						 acode ="2RF5up";
						 String sampleURL = "https://test.cci-webaccess-dmgmedia.co.uk/salesforce/plugin/orders/create?userid=srinivasa.kuncha&group=Mail Display Sales&profile=ANL Credit&accountid="; 
						 String customerid = "&advertiserid=";
						 String confirmationURL= "&confirmationurl=";
						 String authcode="&authorizationcode=";
						 String redirect = "&bookings=[{\"packagename\":\"DM Display\",\"dates\":[\"2014-11-12\"]}]";
						 String OrderURL=sampleURL.concat(financeID).concat(customerid).concat(ref).concat(confirmationURL).concat(clientURL).concat(authcode).concat(acode).concat(add).concat(orderinfo).concat(redirect);
						 System.out.println("Srini Redirect URL  =>  "+OrderURL);*/
						 
/************************************************************************************************************/
//					     getDriver().get(OrderURL);
/************************************************************************************************************/
							getDriver().switchTo().frame(getDriver().findElement(By.tagName("iframe")));
							WebElement element = getDriver().switchTo().activeElement();
							waitFor(2).seconds();
							String packageType = record.get("package");
							element.findElement(By.xpath("//td[div="+"'"+packageType+"'"+"]")).click();
							waitFor(5).seconds();
							
								/*******************Order Information***********************/
								 orderPurchaseNo().sendKeys(record.get("PONumber"));
								 orderNote().sendKeys(record.get("orderNote"));
								 orderUrgentNote().sendKeys(record.get("urgentNote"));
								 orderSalesRepId().sendKeys("Tom Leader");
								 
							    /******************Package Selection**************************/
									 addPackage().click();
									 waitFor(4).seconds();
									 addPackage().click();
							    	 waitFor(6).seconds();
							    /******************Supply Package Details************************/
								 if (packageType.equalsIgnoreCase("DM Display") || packageType.equalsIgnoreCase("TMOS Display")|| packageType.equalsIgnoreCase("Mail Display Inserts")) 
								 {
							    	 title().selectByVisibleText(record.get("title"));
									 selectPublication().selectByVisibleText(record.get("publication"));
							    	 waitFor(3).seconds();
							    	 selectSection().selectByVisibleText(record.get("section"));
							    	 waitFor(6).seconds();
							    	 selectSubSection().selectByVisibleText(record.get(record.get("subsection"))); // subsection
							    	 waitFor(4).seconds();
							    	 selectZone().selectByVisibleText(record.get("zones"));
							    	 waitFor(6).seconds();
							    	 selectModule().selectByVisibleText(record.get("module"));
							    	 waitFor(5).seconds();
							    	 nextMonth().click();
									 waitFor(3).seconds();
								 }
								 if (packageType.equalsIgnoreCase("MailPlus")) {
									 
									 webSiteCategory().selectByVisibleText(record.get("websitecategory"));
									 waitFor(3).seconds();
									 webSite().selectByVisibleText(record.get("website"));
									 waitFor(4).seconds();
									 selectSection().selectByVisibleText(record.get("section"));
							    	 waitFor(4).seconds();
									 selectZone().selectByVisibleText(record.get("adunit"));
									 waitFor(6).seconds();
									 nextMonth().click();
									 waitFor(3).seconds();
								 }
								 if (packageType.equalsIgnoreCase("Mail Display Inserts")) {
									 
									 title().selectByVisibleText(record.get("title"));
									 selectPublication().selectByVisibleText(record.get("publication"));
							    	 waitFor(3).seconds();
							    	 selectSection().selectByVisibleText(record.get("section"));
							    	 waitFor(4).seconds();
									 noOfInserts().type("2");
									 element.findElement(By.xpath("//tbody/tr[6]/td[4]")).click();
								 }
								 if (packageType.equalsIgnoreCase("Mail Display Non-Print")) {
									 
								 }
								 element.findElement(By.xpath("//tbody/tr[6]/td[5]")).click(); /**************** Date Field*****************/
						    	 	waitFor(5).seconds();
						    	 Thucydides.takeScreenshot();
						    	 saveOrder().click();
						    	 	waitFor(10).seconds();
						    	
								 /***************** Price Details **************************/
						    	 if (packageType.equalsIgnoreCase("DM Display") || packageType.equalsIgnoreCase("TMOS Display")|| packageType.equalsIgnoreCase("Mail Display Inserts")) 
								 {
								    	 selectPrice().click();
								    	 waitFor(5).seconds();
								    	 selectRevenue().sendKeys(record.get("revenue"));
								    	 waitFor(2).seconds();
								    	 updateRevenue().click();
								    	 waitFor(2).seconds();
								 }
/************************************ Accept Order *************************************************/	
									    	 acceptOrder().click();
									    	 if(str.equalsIgnoreCase("Private Advertiser") || str.equalsIgnoreCase("Direct Advertiser")|| str.equalsIgnoreCase("Brand")) {
									    	 waitFor(3).seconds();
									    	 WebElement prepaymentwindow1 = getDriver().switchTo().activeElement();
									    	 waitFor(1).seconds();
									    	 prepaymentwindow1.findElement(By.xpath("//input[@value='Prepay']")).click();
									    	 waitFor(3).seconds();
									    	 WebElement prepaymentwindow2 = getDriver().switchTo().activeElement();
									    	 waitFor(1).seconds();
									    	 prepaymentwindow2.findElement(By.xpath("//input[@value='OK']")).click();
									    	 }
									    	 
									    	 waitFor(16).seconds();
/*************************************************************************************************/
						    	 try {
							    	 WebDriverWait wait1 = new WebDriverWait(getDriver(), 5);
							    	 if(wait1.until(ExpectedConditions.alertIsPresent())!=null)
							    	      getDriver().switchTo().alert().accept();
							    	 }
							    	 catch (Exception e) {}
						    	 
						    	 getDriver().switchTo().defaultContent();
/************************************************************************************************/						
				    	 						
				    	 				    	if (readAccountName().isVisible()) {
				    	 				    		waitFor(1).minutes();
				    	 				    		searchTerms().type(financeID);
				    	 				    		searchGlue().click();
				    	 				    		waitFor(3).seconds();
				    	 				    		try {
				    	 				    		if (orderlink().isVisible())
				    	 				    		{ 
				    	 				    			clickOn(orderlink());
				    	 				    			System.out.print(" Order ID : " + orderID().getText());
				    	 				    		}
				    	 				    		}catch (Exception e) { System.out
															.print(" *** ORDER ID DIDN'T SYNC BACK TO GLUE WITH IN 60 SECONDS"); }
				    	 				    		accountCreation();
				    	 				    		System.out.println("\n*****     SYNC WAIT TIME FOR SOPID IS  : "+synctimeforSOPID + " SECONDS");
				    	 				    		j++;
				    	 				    		synctimeforSOPID =10;
				    	 				    	}
/**********************************************************************************************/	
			}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			waitABit(1000);
		}
	}
}
