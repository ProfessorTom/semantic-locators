package com.google.semanticlocators;

import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 * Provides WebDriver instances to the test. This constant is kept in a separate class so internal +
 * open source code can differ.
 */
final class WebDrivers {
  // Use a string to identify browsers so the test names are readable
  public static final ImmutableMap<String, WebDriver> DRIVERS;

  static {
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("--headless");

    FirefoxOptions firefoxOptions = new FirefoxOptions();
    firefoxOptions.addArguments("--headless");

    DRIVERS =
        ImmutableMap.of(
            "chrome", new ChromeDriver(chromeOptions),
            "firefox", new FirefoxDriver(firefoxOptions));
  }

  private WebDrivers() {}
}
