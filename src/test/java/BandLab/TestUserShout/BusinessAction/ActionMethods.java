package BandLab.TestUserShout.BusinessAction;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import BandLab.TestUserShout.BaseFramework.BaseMethods;

public class ActionMethods extends BaseMethods{

	public void navigateHomePage() throws Exception {
		try {
			super.startChromeDriver();
			driver.get("http://www.bandlab.com/");
			assertTrue(driver.getTitle().contains("BandLab: Music Starts Here"));
		}catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}

	public void clickOnsignup() throws Exception {
		try {
			waitForElementToBeAppear(By.xpath("//a[text()='Sign Up']"));
			driver.findElement(By.xpath("//a[text()='Sign Up']")).click();
		}catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}
	public void fillSignUpDetails(String username , String email , String password) throws Exception {
		try {
			waitForElementToBeAppear(By.xpath("//input[@ng-model='credentials.name']"));
			waitForElementToBeAppear(By.xpath("//input[@ng-model='credentials.email']"));
			waitForElementToBeAppear(By.xpath("//input[@ng-model='credentials.password']"));
			driver.findElement(By.xpath("//input[@ng-model='credentials.name']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@ng-model='credentials.email']")).sendKeys(email);
			driver.findElement(By.xpath("//input[@ng-model='credentials.password']")).sendKeys(password);
		}catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}

	public void SignUp() throws Exception {
		try {
			submitSignUp();			
		}
		catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}

	public void submitSignUp() throws Exception {
		try {
			waitForElementToBeAppear(By.xpath("//button[@ng-disabled='waitingForAuth || !signUpForm.$valid || signUpForm.$submitted || signUpForm.$pristine']"));
			waitForElementToBeClickable(By.xpath("//button[@ng-disabled='waitingForAuth || !signUpForm.$valid || signUpForm.$submitted || signUpForm.$pristine']"));
			driver.findElement(By.xpath("//button[@ng-disabled='waitingForAuth || !signUpForm.$valid || signUpForm.$submitted || signUpForm.$pristine']")).click();
			waitForElementToBeAppear(By.xpath("//h2[text()='Let’s Set up Your Profile']"));
			if(driver.findElement(By.xpath("//h2[text()='Let’s Set up Your Profile']")).isDisplayed())
			{
				String userdetail = driver.findElement(By.xpath("//input[@ng-model='user.username']")).getText();
				driver.get("https://www.bandlab.com/"+userdetail+"");
			}
			staticWait();
		}catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}

	public void update_username_of_created_user(String username) throws Exception {
		try {
			waitForElementToBeAppear(By.xpath("(//a[@ui-sref='user.feed(::{ username: vm.user.username })'])[1]"));
			waitForElementToBeClickable(By.xpath("(//a[@ui-sref='user.feed(::{ username: vm.user.username })'])[1]"));
			driver.findElement(By.xpath("(//a[@ui-sref='user.feed(::{ username: vm.user.username })'])[1]")).click();
			waitForElementToBeAppear(By.xpath("//a[text()=' Update Profile ']"));
			waitForElementToBeClickable(By.xpath("//a[text()=' Update Profile ']"));
			driver.findElement(By.xpath("//a[text()=' Update Profile ']")).click();
			waitForElementToBeAppear(By.xpath("//a[@href='/settings/account']"));
			driver.findElement(By.xpath("//a[@href='/settings/account']")).click();
			waitForElementToBeAppear(By.xpath("//input[@ng-model='user.username']"));
			driver.findElement(By.xpath("//input[@ng-model='user.username']")).clear();
			driver.findElement(By.xpath("//input[@ng-model='user.username']")).sendKeys(username);
			waitForElementToBeAppear(By.xpath("//input[@ng-disabled='!accountForm.$valid || accountForm.$pristine' and @value='Update']"));
			waitForElementToBeClickable(By.xpath("//input[@ng-disabled='!accountForm.$valid || accountForm.$pristine' and @value='Update']"));
			driver.findElement(By.xpath("//input[@ng-disabled='!accountForm.$valid || accountForm.$pristine' and @value='Update']")).click();
			staticWait();
		}catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}

	public void navigateToLogIn() throws Exception {

		try {
			waitForElementToBeAppear(By.xpath("(//a[@href='/login'])[1]"));
			driver.findElement(By.xpath("(//a[@href='/login'])[1]")).click();
		}catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}

	public void enterLoginDetails(String email,String password) throws Exception {
		try {
			waitForElementToBeAppear(By.xpath("//h1[@class='auth-title' and text()='Log In']"));
			assertTrue(driver.findElement(By.xpath("//h1[@class='auth-title' and text()='Log In']")).isDisplayed());
			waitForElementToBeAppear(By.xpath("//input[@aria-label='Username or Email']"));
			driver.findElement(By.xpath("//input[@aria-label='Username or Email']")).sendKeys(email);
			waitForElementToBeAppear(By.xpath("//input[@aria-label='Password']"));
			driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);
		}catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}

	public void sugmitSignIn() throws Exception {
		try {
			waitForElementToBeAppear(By.xpath("//button[text()='Log In']"));
			driver.findElement(By.xpath("//button[text()='Log In']")).click();
			staticWait();
		}catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}
	public void createShout() throws Exception {
		try {
			waitForElementToBeAppear(By.xpath("//a[@class='button cta single last button-create']/span[text()='Create']"));
			waitForElementToBeClickable(By.xpath("//a[@class='button cta single last button-create']/span[text()='Create']"));
			driver.findElement(By.xpath("//a[@class='button cta single last button-create']/span[text()='Create']")).click();
			waitForElementToBeAppear(By.xpath("//div[@class='mega-dropdown-nav-item-label' and text()=' Create Shout ']"));
			driver.findElement(By.xpath("//div[@class='mega-dropdown-nav-item-label' and text()=' Create Shout ']")).click();
			staticWait();			
			waitForElementToBeAppear(By.xpath("//div[@class='photo-booth-round-button photo-booth-snapshot-button']"));
			driver.findElement(By.xpath("//div[@class='photo-booth-round-button photo-booth-snapshot-button']")).click();
			waitForElementToBeAppear(By.xpath("//span[text()='Publish']"));
			driver.findElement(By.xpath("//span[text()='Publish']")).click(); 
			staticWait(); // wait till post got uploaded successfully 
		}catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}

	public void followUser(String username) throws Exception {
		try {
			if(driver.findElement(By.xpath("//h2[text()='Let’s Set up Your Profile']")).isDisplayed())
			{
				String userdetail = driver.findElement(By.xpath("//input[@ng-model='user.username']")).getText();
				driver.get("https://www.bandlab.com/"+userdetail+"");
			}
			driver.get("https://www.bandlab.com/"+username+"");
			waitForElementToBeAppear(By.xpath("//button[@ng-show='!vm.user.isBlockingMe && !vm.user.isBlocked && !vm.user.isFollower']"));
			driver.findElement(By.xpath("//button[@ng-show='!vm.user.isBlockingMe && !vm.user.isBlocked && !vm.user.isFollower']")).click();
			waitForElementToBeAppear(By.xpath("//span[@ng-show='vm.user.isFollower && !vm.isOwnProfile' and text()=' Following ']"));
			}
		catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}

	public void verifyUserShoutAvailableInFeed(String username) throws Exception {
		try {			
			waitForElementToBeAppear(By.xpath("//a[@href='/feed']"));
			driver.findElement(By.xpath("//a[@href='/feed']")).click();
			driver.get(driver.getCurrentUrl());
			staticWait();
			waitForElementToBeAppear(By.xpath("//a[@href='/"+username+"']/ancestor::div[@class='post-card-header-title']/span[text()='  posted a photo ']"));
			driver.findElement(By.xpath("//a[@href='/"+username+"']/ancestor::div[@class='post-card-header-title']/span[text()='  posted a photo ']")).isDisplayed();
		}catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}
		
	@SuppressWarnings("unused")
	public void closeBrowser() throws Exception {
		tearDown();
	}

	public void userLogOut() throws Exception {
		try {
			driver.findElement(By.xpath("//a[@href='/feed']")).click();
			waitForElementToBeAppear(By.xpath("//div[@class='top-bar-profile-picture']"));
			waitForElementToBeClickable(By.xpath("//div[@class='top-bar-profile-picture']"));
			driver.findElement(By.xpath("//div[@class='top-bar-profile-picture']")).click();
			waitForElementToBeAppear(By.xpath("//a[text()=' Log out ']"));
			waitForElementToBeClickable(By.xpath("//a[text()=' Log out ']"));
			driver.findElement(By.xpath("//a[text()=' Log out ']")).click();
		}catch(Exception exception) { 
			exception.printStackTrace();
			tearDown();
		}
	}

}
