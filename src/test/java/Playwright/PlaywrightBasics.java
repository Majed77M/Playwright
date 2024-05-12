package Playwright;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import javax.swing.text.html.HTML;

public class PlaywrightBasics {
public static void main (String[] args){
Playwright playwright = Playwright.create();
String connection =playwright.toString();
System.out.println(connection);
BrowserType.LaunchOptions lp= new BrowserType.LaunchOptions();
lp.setChannel("chrome");
lp.setHeadless(false);
Browser browser =playwright.chromium().launch(lp);
Page page = browser.newPage();
page.navigate("https://vc.tasheer.com/");
String title = page.title();
System.out.println(title);
browser.close();
playwright.close();
    }


}
