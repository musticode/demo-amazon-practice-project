package com.amazon.practice.driver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DriverOptions {
    /**
     * options will be set in runtime once
     *
     */
    private static ChromeOptions chromeOptions;
    private static FirefoxOptions firefoxOptions;


    public static ChromeOptions getChromeOptions(){
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        return chromeOptions;
    }

    public static FirefoxOptions getFirefoxOptions(){
        firefoxOptions = new FirefoxOptions();
        return  firefoxOptions;
    }

    /**
     *         firefoxOptions = new FirefoxOptions();
     *         firefoxProfile = new FirefoxProfile();
     *         //Accept Untrusted Certificates
     *         firefoxProfile.setAcceptUntrustedCertificates(true);
     *         firefoxProfile.setAssumeUntrustedCertificateIssuer(false);
     *         //Use No Proxy Settings
     *         firefoxProfile.setPreference("network.proxy.type", 0);
     */

}
