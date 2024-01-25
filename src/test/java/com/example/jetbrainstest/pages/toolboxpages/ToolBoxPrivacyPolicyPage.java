package com.example.jetbrainstest.pages.toolboxpages;

import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.example.jetbrainstest.MyWait.myWait;

public class ToolBoxPrivacyPolicyPage {
    WebDriver driver;

    AllureLogger LOG = new AllureLogger(org.slf4j.LoggerFactory.getLogger(ToolBoxPrivacyPolicyPage.class));
    @FindBy(css = "#jetbrains-privacy-policy strong")
    private WebElement privacySummary;

    public Boolean privacySummaryIsDisplayed(){
        myWait(10).visible(privacySummary);
       return privacySummary.isDisplayed();
    }
    public ToolBoxPrivacyPolicyPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
