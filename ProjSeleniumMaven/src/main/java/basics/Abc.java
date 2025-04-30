package basics;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Abc {
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
	    driver = new ChromeDriver();
	    baseUrl = "https://www.blazedemo.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testRecord04142542717Pm() throws Exception {
	    // Label: Test
	    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1440,812 | ]]
	    driver.get("https://www.atlassian.com/software/jira");
	    // ERROR: Caught exception [unknown command [waitFor]]
	    driver.findElement(By.cssSelector("button._4cvr1h6o._bfhk6ota._19itidpf._2rko1l7b._16qs1yxe._syaz1blv._80omtlke._1e0c1txw._ect41kw7._1wyb1kw7._zulp1kwk._4t3i1ylp._1bah1h6o._ca0q1kwk._u5f3oqnp._n3td1kwk._19bvoqnp._1bsb1osq._jomr90jo._irr390jo._1ah3t94y > span")).click();
	    driver.get("https://accounts.google.com/o/oauth2/v2/auth?response_type=code&client_id=596149463257-9oquqfivs9on8t8erq23c8qso6vk3cp1.apps.googleusercontent.com&code_challenge=FAOJXBhfUFuuDE54_JuqISAgN1ajtb7SBOjMaZe31gk&code_challenge_method=S256&redirect_uri=https%3A%2F%2Fid.atlassian.com%2Flogin%2Fgoogle&scope=openid%20email%20profile&state=eyJjc3JmVG9rZW4iOiI4MDlhODBjNzUyYzhlOTZiZmNkNWE2NDZmMTAyYTA0ZDhhNTk5MWM1ODExYmFhYWFlNDIxMWI4NzIwZjUzNTRiIiwiYW5vbnltb3VzSWQiOiIxNGExMjNmYy01MTAzLTQzYWUtYTgyNS04ZWFlYTVmMDQwNjgiLCJxdWVyeSI6Ij9hcHBsaWNhdGlvbj13YWMtLW90cC1qaXJhJmNvbnRpbnVlPWh0dHBzJTNBJTJGJTJGd3d3LmF0bGFzc2lhbi5jb20lMkZ0cnklMkZjbG91ZCUyRnNpZ251cCUzRmJ1bmRsZSUzRGppcmEtc29mdHdhcmUlMjZlZGl0aW9uJTNEZnJlZSUyNmFwcGxpY2F0aW9uJTNEd2FjLS1vdHAtamlyYSUyNnNvY2lhbC1zaWdudXAtbG9naW4lM0R0cnVlJnByb21wdD1zZWxlY3RfYWNjb3VudCZhdGxPcmlnaW49ZXlKcElqb2ljM1JoZEdsakxYVjFhV1F0Wm05eUxYUmxjM1JwYm1jaUxDSndJam9pZDJGakxYTnBaMjUxY0MxbmIyOW5iR1VpZlEifQ%3D%3D&prompt=select_account");
	    // ERROR: Caught exception [unknown command [waitFor]]
	    driver.findElement(By.cssSelector("[data-email=\"engg.comps.kshitij@gmail.com\"]")).click();
	    // ERROR: Caught exception [unknown command [waitFor]]
	    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=div:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > c-wiz:nth-of-type(1), div:nth-of-type(2) > div:nth-of-type(1) > div:nth-of-type(1) > button[type="button"] > span:nth-of-type(1)]]
	    driver.get("https://id.atlassian.com/login/authorize?continue=https%3A%2F%2Fwww.atlassian.com%2Ftry%2Fcloud%2Fsignup%3Fbundle%3Djira-software%26edition%3Dfree%26application%3Dwac--otp-jira%26social-signup-login%3Dtrue&application=wac--otp-jira&token=eyJraWQiOiJtaWNyb3MvaWQtYXV0aGVudGljYXRpb24vcGxkYXFoZ2sydTM3N2Q3OSIsImFsZyI6IlJTMjU2In0.eyJtYXJrZWRWZXJpZmllZCI6ImZhbHNlIiwibG9naW5UeXBlIjoiZ29vZ2xlTG9naW4iLCJjb250YWluZXJUeXBlIjoiZ2xvYmFsIiwiaXNzIjoibWljcm9zL2lkLWF1dGhlbnRpY2F0aW9uIiwidXNlcklkIjoiNjE5MDk5NjljNTEwYmMwMDZiMDBkZjAyIiwidHJhbnNhY3Rpb25JZCI6InVzLWVhc3QtMXxmNzhmMWFhZC1mZDczLTQ4OTktYjM2Ny0wZTkwYTQ4YTBmMTUiLCJhdWQiOiJsaW5rLXNpZ25hdHVyZS12YWxpZGF0b3IiLCJuYmYiOjE3NDQ2Mjc3ODksInNjb3BlIjoiTG9naW4iLCJ2ZXJpZmljYXRpb25UeXBlIjoidmVyaWZ5IiwiZXhwIjoxNzQ0NjI3OTA5LCJpYXQiOjE3NDQ2Mjc3ODksImp0aSI6IjhmNjQxNzM3LTYwNWUtNGQ2MS1hMDBiLTExNDBkZWRiYjE5ZSIsImhhc2hlZENzcmZUb2tlbiI6IjgwOWE4MGM3NTJjOGU5NmJmY2Q1YTY0NmYxMDJhMDRkOGE1OTkxYzU4MTFiYWFhYWU0MjExYjg3MjBmNTM1NGIifQ.LfYl5yRSTJ25hIKXOl96dwdu1QpI9gCo780BVlejES2OvQ3g1EGS-WJeDQJe2GWnC7pAoO5dCUgIWXUzCnDyufqLx8FsGCGVFmHwxcyeo9CGzSv0V6qtJr0Qt13o4Q8qaHxQ5r7dtttkv2mZX1gtXMx5uHFW4onzfmnRiCULu3TpCLopT-Ya28tHlqt7_IR42lD9Unk0StFWV3_JLPCcHMZDo1C6HpBfJM9OcOpWbPsYb2flSsXGExF3HqCftmPKKbJUItthW-hpxNnYsisA3romxPrNkTctZW2-AecZgtffKIux8aCydlGbTpB-Su1mEGrhtpn7CA5hwS7mr-h4NA&state=eyJoYXNoZWRDc3JmVG9rZW4iOiI2MWE4MmQ1MjYzNjljMjgwMDMyN2M0MmRhZDg4YmI4Yzg3ZTY3OWZlM2Q3MTgyNTVhOGFmNTI3ZDZhMDk0OTY5In0%3D");
	    driver.get("https://www.atlassian.com/try/cloud/signup?bundle=jira-software&edition=free&application=wac--otp-jira&social-signup-login=true");
	    // ERROR: Caught exception [unknown command [waitFor]]
	    driver.findElement(By.cssSelector("[data-product-key=\"jira\"]")).click();
	    // ERROR: Caught exception [unknown command [waitFor]]
	    driver.findElement(By.cssSelector("button:nth-of-type(5)")).click();
	    // ERROR: Caught exception [unknown command [waitFor]]
	    driver.findElement(By.cssSelector("button:nth-of-type(6) > span")).click();
	    // ERROR: Caught exception [unknown command [waitFor]]
	    driver.findElement(By.cssSelector("button._4cvr1h6o._1bah1h6o._vchhusvi._1e0c116y._k48pbfng._ect4lnmy._vwz41k92._ca0q19bv._u5f31tcg._n3td19bv._19bv1tcg._y3gn1h6o._4bfu1r31._1hmsglyw._ajmmnqa1._2rko1ylp._v564fnf5._1ah31l7b._d0altlke._syazu67f._bfhkdoyu._19itglyw._mizu5a6q._ra3xnqa1._128myh40._irr36tgj._1wyb1j6v._4t3i184x._1tke1ylp._1ul953f4._p12f122r")).click();
	    driver.get("https://id.atlassian.com/login?continue=https%3A%2F%2Fenggcompskshitij.atlassian.net%2Fjira%2Fland%3Fsrc%3Dsignup%26templateId%3Dcom.atlassian.jira-core-project-templates%253Ajira-work-management-process-control-team-managed%26tt%3DOPS%26persona%3DProject%2BManagement%2BGeneric%26jtbd%3D0&application=jira");
	    driver.get("https://enggcompskshitij.atlassian.net/welcome/software?tt=OPS&persona=Project%20Management%20Generic&src=signup&templateId=com.atlassian.jira-core-project-templates:jira-work-management-process-control-team-managed&jtbd=0");
	    // ERROR: Caught exception [unknown command [waitFor]]
	    driver.findElement(By.id("project-name-text-field-:r24:")).click();
	    // ERROR: Caught exception [unknown command [waitFor]]
	    driver.findElement(By.id("project-name-text-field-:r24:")).clear();
	    driver.findElement(By.id("project-name-text-field-:r24:")).sendKeys("KanbanProj");
	    // ERROR: Caught exception [unknown command [waitFor]]
	    driver.findElement(By.cssSelector("span._85i5v77o._1q51v77o._y4ti1b66._bozg1b66")).click();
	    // ERROR: Caught exception [unknown command [waitFor]]
	    driver.findElement(By.cssSelector("span._85i5v77o._1q51v77o._y4ti1b66._bozg1b66")).click();
	    // ERROR: Caught exception [unknown command [waitFor]]
	    driver.findElement(By.cssSelector("label:nth-of-type(3) > [name=\"segmentation-radio-group\"]")).click();
	    // ERROR: Caught exception [unknown command [waitFor]]
	    driver.findElement(By.cssSelector("button._mizu194a._1ah31bk5._ra3xnqa1._128m1bk5._1cvmnqa1._4davt94y._19itglyw._vchhusvi._r06hglyw._80omtlke._2rkosqtm._11c82smr._v5649dqc._189eidpf._1rjc12x7._1e0c116y._1bsb1wug._p12f1osq._kqswh2mm._4cvr1q9y._1bah1h6o._gy1p1b66._1o9zidpf._4t3iviql._k48p1wq8._y4tiutpp._bozgutpp._y3gn1h6o._s7n4nkob._14mj1kw7._9v7aze3t._1tv3nqa1._39yqe4h9._11fnglyw._18postnw._bfhkomb0._syaz15cr._105315cr._f8pj15cr._30l315cr._9h8h15cr._irr31wqm._1di617hq._4bfu18uv._1hmsglyw._ajmmnqa1._1a3b18uv._4fprglyw._5goinqa1._9oik18uv._1bnxglyw._jf4cnqa1._1nrm18uv._c2waglyw._1iohnqa1 > span._v564g17y._1reo15vq._18m915vq._16jlkb7n._1o9zkb7n._1bto1l2s._o5721q9c")).click();
	    // ERROR: Caught exception [unknown command [waitFor]]
	    driver.findElement(By.cssSelector("div.css-1pfevi5 > button.css-1dw4iom > span.css-178ag6o")).click();
	    // ERROR: Caught exception [unknown command [waitFor]]
	    driver.findElement(By.cssSelector("button._mizu194a._1ah31bk5._ra3xnqa1._128m1bk5._1cvmnqa1._4davt94y._19itglyw._vchhusvi._r06hglyw._80omtlke._2rkosqtm._11c82smr._v5649dqc._189eidpf._1rjc12x7._1e0c116y._1bsb1wug._p12f1osq._kqswh2mm._4cvr1q9y._1bah1h6o._gy1p1b66._1o9zidpf._4t3iviql._k48p1wq8._y4tiutpp._bozgutpp._y3gn1h6o._s7n4nkob._14mj1kw7._9v7aze3t._1tv3nqa1._39yqe4h9._11fnglyw._18postnw._bfhkomb0._syaz15cr._105315cr._f8pj15cr._30l315cr._9h8h15cr._irr31wqm._1di617hq._4bfu18uv._1hmsglyw._ajmmnqa1._1a3b18uv._4fprglyw._5goinqa1._9oik18uv._1bnxglyw._jf4cnqa1._1nrm18uv._c2waglyw._1iohnqa1 > span._v564g17y._1reo15vq._18m915vq._16jlkb7n._1o9zkb7n._1bto1l2s._o5721q9c")).click();
	    // ERROR: Caught exception [unknown command [waitFor]]
	    driver.findElement(By.cssSelector("span:nth-child(4) > a > span")).click();
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      //fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
}
