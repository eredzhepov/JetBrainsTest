package com.example.jetbrainstest.pages.toolboxpages;

import com.example.jetbrainstest.AllureLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.LoggerFactory;

import static com.example.jetbrainstest.MyWait.myWait;

public class ToolBoxFirefoxPage {
    WebDriver driver;
    AllureLogger LOG = new AllureLogger(LoggerFactory.getLogger(ToolBoxFirefoxPage.class));
    @FindBy(css = ".AddonTitle")
    private WebElement firfoxeSummary;
    public String getTitleText() {
        myWait(10).visible(firfoxeSummary);
        LOG.info("В заголовке текст: " + driver.getTitle());
        return driver.getTitle();
    }

    public ToolBoxFirefoxPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
