package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Dmitry on 14.05.2016.
 */
public class NavigationHelper extends HeplerBase{


    public NavigationHelper(FirefoxDriver wd) {
       super(wd);
    }

    public void gotoGroupPage() {
       click(By.linkText("groups"));
    }
}
