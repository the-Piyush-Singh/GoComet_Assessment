package com.qa;

import com.microsoft.playwright.*;

public class TestPlaywright {
    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false));

        Page page = browser.newPage();
        page.navigate("https://casekaro.com/");
    }
}