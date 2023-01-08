package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary11;
import page.Login_page;

public class Login_test extends Baselibrary11{
	Login_page ob;
	@BeforeTest

	  public void getLaunchgithub()
	  {
		  getLaunchUrl("https://github.com/");
		  ob = new Login_page();
		  
	  }
	  @Test(priority=0)
	   public void getVerifyTitle() {
			ob.getVerifyTitle();
		}
	  @Test(priority=1)
	   public void clickonsign() {
	    	ob.clickonsign();
	    }
	  @Test(priority=2)
	    public void sendusername() throws InterruptedException {
	    	ob.sendusername();
	    }
	  @Test(priority=3)
	    public void sendpassword() throws InterruptedException {
	    	ob.sendpassword();
	    }
	  @Test(priority=4)
	    public void clickonsigninbutton() {
	    	ob.clickonsigninbutton();
	    }
	  @Test(priority=5)
	  public void clickonnewbutton() throws InterruptedException {
			Thread.sleep(1000);
		  ob.clickonnewbutton();
	  }
	  @Test(priority=6)
      public void Createrepo() throws InterruptedException {
			Thread.sleep(1000);
		  ob.Createrepo();
	  }
	  @Test(priority=7)
	  public void clickonissue() {
		  ob.clickonissue();
	  }
	  @Test(priority=8)
	  public void clickonnewissue() throws InterruptedException {
		  ob.clickonnewissue();
	  }
	  @Test(priority=9)
	  public void createnewissue() throws InterruptedException {
		  ob.createnewissue();
	  }
	  @Test(priority=10)
	  public void clickonnewissue1()throws InterruptedException  {
		  ob.clickonnewissue1();
	  }
	  @Test(priority=11)
	  public void createnewissue1() throws InterruptedException {
		  ob.createnewissue1();
	  }
	  
	  @Test(priority=12)
	  public void Addcomments() throws InterruptedException {
		  ob.Addcomments();
	  }
	  @Test(priority=13)
	  public void verifynewlink() throws InterruptedException {
	    	ob.verifynewlink();
	    }
	  
	  @Test(priority=14)
	  public void clickonsetting() {
	    	ob.clickonsetting();
	    }
	  @Test(priority=15)
	  public void clickondeleterepo() throws InterruptedException {
	    	ob.clickondeleterepo();
	    }
	  @Test(priority=16)
	  public void clickondeleterepobutton() throws InterruptedException {
	    	ob.clickondeleterepobutton();
	    }
	  @Test(priority=17)
	  public void getsuccesfullmsg(){
	    	ob.getsuccesfullmsg();
	    }
	  @Test(priority=18)
	  public void clickonHomebutton() throws InterruptedException{
	    	ob.clickonHomebutton();
	    }
	  @Test(priority=20)
	  public void GetverifyRepo(){
	    	ob.GetverifyRepo();
	    }
	  @AfterTest
	   public void teardown() {
			  driver.quit();
		  }
}
