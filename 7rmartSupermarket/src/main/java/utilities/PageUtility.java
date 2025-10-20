package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void selectByVisibleText(WebElement element, String visibleText)
	{
		Select select=new Select(element);
		select.selectByVisibleText(visibleText);
	}
	public void selectByIndex(WebElement element, int index)
	{
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	public void selectByValue(WebElement element, String value)
	{
		Select select=new Select(element);
	    select.selectByValue(value);
	}
	public void dragAndDrop(WebElement element, WebElement element1)
	{
		Actions actions=new Actions(null);
		actions.dragAndDrop(element, element1).perform();
	}
	public void rightClick(WebElement element)
	{
		Actions actions=new Actions(null);
		actions.contextClick(element).perform();
	}
	public void doubleClick(WebElement element)
	{
		Actions actions=new Actions(null);
	    actions.doubleClick(element).perform();
	}
	public void mouseOver(WebElement element)
	{
		Actions actions=new Actions(null);
	    actions.moveToElement(element).perform();
	}
	public void clickUpdate(WebElement driver, WebElement update)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", update);
	}
	}


