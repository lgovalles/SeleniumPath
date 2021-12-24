package com.epam.selenium.training.common.pages;

import com.epam.selenium.training.common.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class MainMenu extends BaseClass {

    // Select Elements
    @FindBy(how = How.CSS, using = "#menu-item-40")
    private WebElement shopLink;

    @FindBy(how = How.CSS, using = "#menu-item-50")
    private WebElement myAccountLink;

    @FindBy(how = How.CSS, using = ".cartcontents")
    private WebElement carrLink;

    public MainMenu() {
            PageFactory.initElements(new AjaxElementLocatorFactory(driver,30),this);
    }

    // Actions
    public void ClickOnShop(){
        shopLink.click();
    }

    public void ClickOnMyAccount(){
        myAccountLink.click();
    }

    public void ClickOnCarr(){
        carrLink.click();
    }

    public void NavigateBack(){
        driver.navigate().back();
    }
    public void NavigateTo(){
        driver.get(baseURL);
    }



}
