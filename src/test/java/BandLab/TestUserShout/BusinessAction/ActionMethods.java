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
			setUpNewUserProfileWithDeaultDetail();
			staticWait();
			userLogOut();
		}
		catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}

	public void submitSignUp() throws Exception {
		try {
			
			waitForElementToBeClickable(By.xpath("//button[@ng-disabled='waitingForAuth || !signUpForm.$valid || signUpForm.$submitted || signUpForm.$pristine']"));
			driver.findElement(By.xpath("//button[@ng-disabled='waitingForAuth || !signUpForm.$valid || signUpForm.$submitted || signUpForm.$pristine']")).click();
		}catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}

	public void setUpNewUserProfileWithDeaultDetail() throws Exception {
		try {
			staticWait();
			driver.findElement(By.xpath("//button[text()=' Continue ' and @class='scs xl expand' and @ng-disabled='!completeProfileForm.$valid']")).click();
			staticWait();
			driver.findElement(By.xpath("(//button[text()=' Continue ' and @class='scs xl expand' and @ng-click='nextStep()'])[1]")).click();
			staticWait();
			driver.findElement(By.xpath("//label[@for='skill-other']/span[text()='Other']")).click();
			staticWait();
			driver.findElement(By.xpath("//button[text()=' Continue ' and @class='scs xl expand' and @ng-disabled='!hasSelectedTags(skills)']")).click();
			staticWait();
			driver.findElement(By.xpath("//label[@for='genre-other']/span[text()='Other']")).click();
			staticWait();
			driver.findElement(By.xpath("//button[@ng-disabled='!hasSelectedTags(genres) || completeProfileForm.$submitted']")).click();
			staticWait();
			driver.findElement(By.xpath("//a[@ng-class='{ highlight : videoState.seconds > 33.6 && videoState.seconds < 37.6 }']")).click();
			staticWait();
		}catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}

	public void navigateToLogIn() throws Exception {

		try {
			driver.findElement(By.xpath("(//a[@href='/login'])[1]")).click();
			staticWait();
		}catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}

	public void enterLoginDetails(String email,String password) throws Exception {
		try {
			assertTrue(driver.findElement(By.xpath("//h1[@class='auth-title' and text()='Log In']")).isDisplayed());
			driver.findElement(By.xpath("//input[@aria-label='Username or Email']")).sendKeys(email);
			driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys(password);
		}catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}

	public void sugmitSignIn() throws Exception {
		try {
			driver.findElement(By.xpath("//button[text()='Log In']")).click();
		}catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}
	public void createShout() throws Exception {
		try {
			staticWait();
			waitForElementToBeClickable(By.xpath("//a[@class='button cta single last button-create']/span[text()='Create']"));
			driver.findElement(By.xpath("//a[@class='button cta single last button-create']/span[text()='Create']")).click();
			driver.findElement(By.xpath("//div[@class='mega-dropdown-nav-item-label' and text()=' Create Shout ']")).click();
			staticWait();			
			driver.findElement(By.xpath("//div[@class='photo-booth-round-button photo-booth-snapshot-button']")).click();
			driver.findElement(By.xpath("//span[text()='Publish']")).click(); 
			staticWait(); // wait till post got uploaded successfully 
		}catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}

	public void followUser(String username) throws Exception {
		try {
			staticWait();
			if(driver.findElement(By.xpath("//h2[text()='Let’s Set up Your Profile']")).isDisplayed())
			{
				String userdetail = driver.findElement(By.xpath("//input[@ng-model='user.username']")).getText();
				driver.get("https://www.bandlab.com/"+userdetail+"");
			}
			staticWait();
			driver.findElement(By.xpath("//input[@placeholder='Search BandLab']")).sendKeys(username);
			driver.findElement(By.xpath("//button[@ng-disabled='!searchForm.$valid']")).click();
			staticWait();
			driver.findElement(By.xpath("//a/span[text()='Users']")).click();
			staticWait();
			driver.findElement(By.xpath("//div[@class='profile-tile-title']/a[@href='/"+username+"'] /ancestor::div[@class='profile-tile-body']//..//button[@class='follow follow-text hollow']")).click();
		}catch(Exception exception) {
			exception.printStackTrace();
			tearDown();
		}
	}

	public void verifyUserShoutAvailableInFeed(String username) throws Exception {
		try {
			staticWait();
			driver.findElement(By.xpath("//a[@href='/feed']")).click();
			staticWait();
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
			waitForElementToBeClickable(By.xpath("//div[@class='top-bar-profile-picture']"));
			driver.findElement(By.xpath("//div[@class='top-bar-profile-picture']")).click();
			driver.findElement(By.xpath("//a[text()=' Log out ']")).click();
			staticWait();
		}catch(Exception exception) { 
			exception.printStackTrace();
			tearDown();
		}
	}

}
