package marek.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    public AbstractPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    protected void sikovnaFinta() { pomocnaMetodaProFintu();}
    private void pomocnaMetodaProFintu(){

    }

}