# HealthCare
"HealthCare" is a website that supports charitable organizations by connecting volunteer doctors, gathering data on needed medicines and prevalent illnesses, providing transportation assistance to underprivileged patients, and furnishing pharmacies with vital information. Its goal is to improve healthcare access for underserved communities.

## Automation Testing

* Overview
  - Using Automation Testing with Selenium
  - How To Excute Test Cases
* Report

## Getting Started
- IntelliJ - https://www.jetbrains.com/idea/
- Maven - https://courses.in28minutes.com/p/maven-tutorial-for-beginners-in-5-steps
s
## Installing Tools
- GIT Repository For Installation : https://github.com/in28minutes/getting-started-in-5-steps

## Running Examples
- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one).
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the right project
- Choose the Spring Boot Application file (search for file with @SpringBootApplication)
- Right Click on the file and Run as Java Application
- You are all Set

### References

#### Selenium Standalone

- Manual Installation - https://github.com/lmc-eu/steward/wiki/Selenium-server-&-browser-drivers
- Automated Installation - https://www.npmjs.com/package/selenium-standalone
- URL - http://localhost:4444/wd/hub

##### Installation and Launch

- Step I : Install NPM
- Step II : Install selenium-standalone
Terminal or Command Prompt
```
# In Windows, Run CMD as Administrator

npm install selenium-standalone@latest -g
# If need use sudo npm install selenium-standalone@latest -g

selenium-standalone install
# if needed use sudo 
```
- Step III : Launch Selenium Standalone
```
selenium-standalone start
```

> By default, edge, google chrome, firefox and phantomjs are available when installed on the host system
```
# install a single driver within the default list (chrome, ie, edge, firefox) 
selenium-standalone install --singleDriverInstall=chrome
```

Reference 
- More Options - https://www.npmjs.com/package/selenium-standalone#command-line-interface

#### Selenium Grid
- URL -http://localhost:4444/grid/console

##### Installation and Launch
- Follow Step I and II of Selenium Standalone
- Step III

```
selenium-standalone start -- -role hub
selenium-standalone start -- -role node -hub http://localhost:4444/grid/register
selenium-standalone start -- -role node -hub http://localhost:4444/grid/register -port 5556

selenium-standalone start -- -role node -hub http://localhost:4444/grid/register -browser browserName=firefox

selenium-andalone start -- -role node -hub http://localhost:4444/grid/register -port 5556 -browser browserName=chrome,maxInstances=2
```

#### Code Snippets

##### Maven Dependencies

###### JUnit

```xml
  <dependencies>
  
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>3.13.0</version>
      <scope>test</scope>
    </dependency>

  
    <!-- https://github.com/bonigarcia/webdrivermanager -->
    <dependency>
      <groupId>io.github.bonigarcia</groupId>
      <artifactId>webdrivermanager</artifactId>
      <version>2.2.4</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>ch.qos.logback</groupId>
      <artifactId>logback-classic</artifactId>
      <version>1.0.13</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.12</version>
      <scope>test</scope>
    </dependency>
  
  </dependencies>
```
###### Test NG

```xml
  <dependencies>

    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>3.13.0</version>
      <scope>test</scope>
    </dependency>

    <!-- https://github.com/bonigarcia/webdrivermanager -->
    <dependency>
      <groupId>io.github.bonigarcia</groupId>
      <artifactId>webdrivermanager</artifactId>
      <version>2.2.4</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>ch.qos.logback</groupId>
      <artifactId>logback-classic</artifactId>
      <version>1.0.13</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.testng</groupId>
      <artifactId>testng</artifactId>
      <version>6.14.3</version>
      <scope>test</scope>
    </dependency>

  </dependencies>

```

###### Other Dependencies

```xml
    <dependency>
      <groupId>org.assertj</groupId>
      <artifactId>assertj-core</artifactId>
      <version>3.10.0</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>com.opencsv</groupId>
      <artifactId>opencsv</artifactId>
      <version>3.4</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.apache.poi</groupId>
      <artifactId>poi</artifactId>
      <version>3.6</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.apache.poi</groupId>
      <artifactId>poi-ooxml</artifactId>
      <version>3.6</version>
      <scope>test</scope>
    </dependency>

```

##### Java Code

###### Chrome Driver

```java
  WebDriverManager.edgedriver().setup();
  WebDriver driver = new EdgeDriver();
```

##### TestNG (testng.xml)

```
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="First Suite" verbose="1">
</suite>
```

#### Resources

##### Selenium IDE
- Selenium IDE will no longer work from Firefox 55
   - https://seleniumhq.wordpress.com/2017/08/09/firefox-55-and-selenium-ide/
- A new version of Selenium IDE for Selenium 3 is being built
   - https://seleniumhq.wordpress.com/2018/08/06/selenium-ide-tng/

##### Troubleshooting
- Troubleshooting Guide - https://github.com/in28minutes/in28minutes-initiatives/tree/master/The-in28Minutes-TroubleshootingGuide-And-FAQ
- Troubleshooting Guide for Maven Issues - https://github.com/in28minutes/in28minutes-initiatives/tree/master/The-in28Minutes-TroubleshootingGuide-And-FAQ#error---you-are-not-using-a-jdk

## Overview

## Step Wise Details

### 00 - Overview

- 00 - 00 Automation Testing with Java and Selenium
- 00 - 01 Automation Testing with Java and Selenium - Course Guide.pdf
- 00 - 02 How To Make Best use of the Course Guide?
- 00 - 03 Installing Java and IntelliJ

### 01 - Getting Started with Selenium, JUnit and TestNG
 
 - Step 01 - Getting Started with Selenium - An Overview
 - Step 02 - Installing Selenium IDE
 - Step 03 - Recording and Replaying Google Search with Selenium IDE
 - Step 04 - Exercise - Recording Facebook Login
 - Step 05 - Advanced Features in Selenium IDE
 - Step 06 - Alternative for Selenium IDE - Katalon Studio
 - Step 07 - Installing and Recording Tests with Katalon Studio
 - Step 08 - Advanced Features of Katalon Studio
 - Step 09 - Export Unit Tests and Set up new Maven Project
 - Step 10 - Adding Maven Dependencies for JUnit, Web Driver Manager and Web Driver
 - Step 11 - Fixing Driver Error with ChromeDriverManager
 - Step 12 - Exercise - Run Facebook JUnit Test
 - Step 13 - Running a Selenium Automation Test - What is happening in Background
 - Step 14 - Install TestNG Plugin and Create New Project with TestNG
 - Step 15 - Export and Run TestNG Test for Google and Facebook
 - Step 16 - Comparing TestNG and JUnit Tests and Course Overview

### 02 - TestNG vs JUnit

 - Step 01 - TestNG vs JUnit
 - Step 02 - Creating a Unit Test for SimpleClass
 - Step 03 - Adding Asserts to Unit Test
 - Step 04 - Exercise - Write more unit test Scenarios
 - Step 05 - Writing Selenium JUnit Automation Test for Google - Part 1
 - Step 06 - Writing Selenium JUnit Automation Test for Google - Part 2
 - Step 07 - Exploring WebDriver Interface
 - Step 08 - Writing Selenium JUnit Automation Test for Google - Part 3
 - Step 09 - Reducing Duplication with @Before and @After JUnit Annotations
 - Step 10 - Time for TestNG - Convert Unit Test to TestNG
 - Step 11 - TestNG Advanced Features - XML Suite and Test Reports
 - Step 12 - TestNG Advanced Features - Running Tests with Parameters defined in XML
 - Step 13 - TestNG Advanced Features - Running Tests in Parallel

### 03 - Getting Started with HTML, CSS and XPath

 - Step 01 - Why should you learn HTML and CSS
 - Step 02 - How does Web Work - Request, Response, HTML and Browser
 - Step 03 - Installing Web Editor - Brackets
 - Step 04 - First HTML File - Tags, HTML, Head and Body
 - Step 05 - Basic HTML Tags - Paragraph, Div, Heading - H1 to H6
 - Step 06 - Formatting Tags - Bold, Italicized and Quotes
 - Step 07 - Using Tags without closing tag - BR and HR
 - Step 08 - W3C Standards for HTML
 - Step 09 - Creating List of elements with UL LI and OL
 - Step 10 - Organizing Your Data Using Tables
 - Step 11 - Organizing Your Data Using Tables - Exercise Solutions
 - Step 12 - HTML Attributes and Links - Absolute and Relative
 - Step 13 - Image Tag in HTML - Local and Internet Links
 - Step 14 - Live Preview Feature in Brackets
 - Step 15 - Nesting of Divs and Understanding align Attribute
 - Step 16 - Getting Data from User using Forms - Text and TextArea
 - Step 17 - Attributes on Text Elements - Size, maxlength, value
 - Step 18 - Choosing among multiple options using Radio Buttons
 - Step 19 - Choosing among multiple options using Select Box
 - Step 20 - Choosing Yes or No with Check Box
 - Step 21 - Submitting a Form and Understanding GET and POST
 - Step 22 - Frames
 - Step 23 - Miscellaneous - Password Fields, File Input and Multi Select Box
 - Step 24 - CSS
 - Step 25 - CSS for input, select and text area
 - Step 26 - CSS attributes with color, background color
 - Step 27 - Grouping Form Elements with fieldset
 - Step 28 - Styling Fieldsets with CSS
 - Step 29 - Exercise - Styling Lists
 - Step 30 - Using an External CSS File
 - Step 31 - Understanding Class in CSS
 - Step 32 - Making best use of Class in CSS and Multiple Classes
 - Step 33 - Using id with CSS
 - Step 34 - Understanding CSS Selectors and Testing using $$ function
 - Step 35 - CSS Selectors - Identifying Input Element
 - Step 36 - XPath Expressions - Absolute and Relative
 - Step 37 - Using id and class in XPath Expressions
 - Step 38 - Using XPath on the Forms Page
 - Step 39 - A Review of XPath Expressions and CSS Selectors

### 04 - Setting up Web Application

 - Step 01 - Setting up Web Application
 - Step 02 - Refactoring Shortcuts To Learn
 - Step 03 - My Favorite Shortcuts - Ctrl + 1 and Ctrl + Space

### 05 - Selenium Automation - Locators

 - Step 01 - Locators
 - Step 02 - Setting up New Project with TestNG
 - Step 03 01 - Selenium Locators - Locate Elements By Id and WebElement Interface
 - Step 03 02 - Exercise - Selenium Locators - Locate Elements By Id
 - Step 04 - Selenium Locators - Locate Elements By Name - Part 1
 - Step 05 - Selenium Locators - Locate Elements By Name - Part 2
 - Step 06 - Abstracting @BeforeTest and @AfterTest to common super class AbstractChromeWebDriverTest
 - Step 07 - Debugging Errors - Element Not Found Exception
 - Step 08 - Selenium Locators - Locate Elements By Tag Name
 - Step 09 - Finding Multiple Matching Elements with findElements
 - Step 10 - Finding Multiple Matching input Elements
 - Step 11 - Slowing Tests using sleep for visualizing
 - Step 12 - Automation Test for Entering UserId and Password and Logging in from Login Page
 - Step 13 - Exercise - Create Automation Test fo Login Static Page
 - Step 14 - Selenium Locators - Locate Elements By Link Text
 - Step 15 - Selenium Locators - Locate Elements By Partial Link Text
 - Step 16 - Selenium Locators - Locate Elements By Class
 - Step 17 - Exercise - Selenium Locators - Locate Elements By Class
 - Step 18 - Selenium Locators - Locate Table Element
 - Step 19 - Exercise - Selenium Locators - Locate and Click Table Element
 - Step 20 - Understanding CSS Selectors for Table Data - td
 - Step 21 - Using XPath Expressions to Locate Table Elements
 - Step 22 - Choosing among multiple Selenium Locator Options
 - Step 23 - Improving Performance By Caching WebElements
 - Step 24 - Conclusion

### 06 - Selenium Automation - Playing with Form Elements
 - Step 01 - Playing with Form Elements
 - Step 02 - Reading and Setting values into Text Elements using Selenium Web Driver Interface
 - Step 03 - Reading and Setting values into TextArea Elements using Selenium Web Driver Interface
 - Step 04 - Reading value of CheckBox in Automation Tests
 - Step 05 - Setting value of CheckBox in Automation Tests
 - Step 06 - Creating Framework Utility Method for CheckBox in Automation Tests
 - Step 07 - Reading value of Radio Button in Automation Tests
 - Step 08 - Setting value of Radio Button in Automation Tests
 - Step 09 - Reading value of Select Box
 - Step 10 - Reading value of Multi Select Box
 - Step 11 - Setting value of Select Box in Automation Test
 - Step 12 - Conclusion

### 07 - Selenium Automation - Advanced Testing Scenarios

 - Step 01 - Setting up New Project with TestNG and Selenium
 - Step 02 - Reading CSS Styles
 - Step 03 - Exercise - Reading CSS Styles
 - Step 04 - Checking if an element is enabled using isEnabled and Exploring WebDriver Interface
 - Step 05 - More methods in WebDriver Interface - getAttribute, getLocation and getSize
 - Step 06 - Accessing Window Information using WebDriver manage window method
 - Step 07 - Window Navigation in Selenium Automation Test with WebDriver navigate method
 - Step 08 - Automation Testing Modal Windows using Sleep
 - Step 09 - Automation Testing Modal Windows with Implicit Wait
 - Step 10 01 - Automation Testing Modal Windows with Explicit Waits
 - Step 10 02 - Automation Testing Modal Windows with Explicit Waits - Events
 - Step 11 - Testing Alert Boxes with Selenium
 - Step 12 - Window Handles and Basics of Testing New Browser Window Launch
 - Step 13 - Finding the Handle of Newly Launched Window
 - Step 14 - Switching to Newly Launched Window
 - Step 15 - Writing Automation Tests for Frames
 - Step 16 - Taking Screenshot during Automation Test
 - Step 17 - Executing JavaScript Code in Selenium Test
 - Step 18 - Reviewing WebDriver Interface
 - Step 20 - Writing Automation Tests for Tables
 - Step 21 - Designing a basic framework for Tables
 - Step 22 - Using Actions Interface for Basic Actions with Keyboard and Mouse
 - Step 23 - More Actions Interface - Drag, Drop, Hold and Release

### 08 - Cross Browser Automation Testing

 - Step 01 - Cross Browser Automation Testing
 - Step 02 - Setting up a New Project and Running Tests in Edge
 - Step 03 - Running Automation Tests in Other Browser - Safari, Internet Explorer and Chrome
 - Step 04 - Running Headless Automation Test with PhanthomJS
 - Step 05 - Running Automation Tests with Edge Browser in Headless mode
 - Step 06 - Designing Cross Browser Automation Test Framework - Part 1
 - Step 07 - Designing Cross Browser Automation Test Framework - Part 2

### 09 - Thank You

- 99 00 Automation Testing with Java and Selenium

## Report

### This is a simple report for the result of some test cases

<body>
<table cellspacing="0" cellpadding="0" class="testOverview">
<tbody><tr><th>Test</th><th>Methods<br>Passed</th><th>Scenarios<br>Passed</th><th># skipped</th><th># failed</th><th>Total<br>Time</th><th>Included<br>Groups</th><th>Excluded<br>Groups</th></tr>
<tr><td style="text-align:left;padding-right:2em"><a href="#t1">AllScenarios</a></td><td class="numi">1</td><td class="numi">1</td><td class="numi">0</td><td class="numi_attn">3</td><td class="numi">8.6 seconds</td><td class="numi"></td><td class="numi"></td></tr>
</tbody></table>
<table cellspacing="0" cellpadding="0" class="methodOverview" id="summary">
<tbody><tr><th>Class</th><th>Method</th><th># of<br>Scenarios</th><th>Start</th><th>Time<br>(ms)</th></tr>
<tr id="t1"><th colspan="5">AllScenarios — failed</th></tr>
<tr class="failedodd"><td rowspan="2">DoctorScreenTests</td><td><a href="#m1"><b>DoctorTC2</b>  </a></td><td class="numi">1</td><td>1691337886941</td><td class="numi">0</td></tr><tr class="failedodd"><td><a href="#m2"><b>DoctorTC</b>  </a></td><td class="numi">1</td><td>1691337886936</td><td class="numi">1</td></tr>
<tr class="failedeven"><td>LoginScreenTests</td><td><a href="#m3"><b>LoginTC</b>  </a></td><td class="numi">1</td><td>1691337883818</td><td class="numi">3109</td></tr>
<tr><th colspan="5">AllScenarios — passed</th></tr>
<tr class="passedodd"><td>LoginScreenTests</td><td><a href="#m4"><b>AdminLoginTC</b>  </a></td><td class="numi">1</td><td>1691337883576</td><td class="numi">239</td></tr>
</tbody></table>
<h1>AllScenarios</h1>
<h2 id="m1">DoctorScreenTests:DoctorTC2</h2>
<div>
<div class="stacktrace">java.lang.NullPointerException: Cannot invoke "DoctorScreen.SeeMedicalConvoyButton()" because "this.doctorScreen" is null
	at DoctorScreenTests.DoctorTC2(DoctorScreenTests.java:26)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)
	at com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)
... Removed 24 stack frames</div>
</div>
<p class="totop"><a href="#summary">back to summary</a></p>
<h2 id="m2">DoctorScreenTests:DoctorTC</h2>
<div>
<div class="stacktrace">java.lang.NullPointerException: Cannot invoke "DoctorScreen.CreatePatientProfile()" because "this.doctorScreen" is null
	at DoctorScreenTests.DoctorTC(DoctorScreenTests.java:10)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)
	at com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)
... Removed 24 stack frames</div>
</div>
<p class="totop"><a href="#summary">back to summary</a></p>
<h2 id="m3">LoginScreenTests:LoginTC</h2>
<div>
<div class="stacktrace">org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#form2Example1"}
  (Session info: MicrosoftEdge=115.0.1901.188)
For documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception
Build info: version: '4.11.0', revision: '040bc5406b'
System info: os.name: 'Windows 10', os.arch: 'amd64', os.version: '10.0', java.version: '15.0.10'
Driver info: org.openqa.selenium.edge.EdgeDriver
Command: [c99ec7bc5b74f39bb66cc7592b4d119c, findElement {using=id, value=form2Example1}]
Capabilities {acceptInsecureCerts: false, browserName: msedge, browserVersion: 115.0.1901.188, ms:edgeOptions: {debuggerAddress: localhost:64383}, msedge: {msedgedriverVersion: 115.0.1901.188 (b51b39339c4..., userDataDir: C:\Users\Hamada\AppData\Loc...}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:64383/devtoo..., se:cdpVersion: 115.0.1901.188, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}
Session ID: c99ec7bc5b74f39bb66cc7592b4d119c
	at org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)
	at org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)
	at org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)
	at org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)
	at org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:196)
	at org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:171)
	at org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:518)
	at org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)
	at org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)
	at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)
	at org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:349)
	at LoginScreen.EnterEmail(LoginScreen.java:21)
	at LoginScreenTests.LoginTC(LoginScreenTests.java:13)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)
	at com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)
... Removed 29 stack frames</div>
</div>
<p class="totop"><a href="#summary">back to summary</a></p>
<h2 id="m4">LoginScreenTests:AdminLoginTC</h2>
<p class="totop"><a href="#summary">back to summary</a></p>

</body>

# Thank You ...
