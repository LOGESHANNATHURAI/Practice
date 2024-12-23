package stepdefenitionfile;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	
	@Given("verify the user is able to login the application")
	public void userShouldNavigate() {
		System.out.println("hai i am here");
	} 
	@Given("navigate to the bookcart demo application")
	public void navigateToTheBookcartDemoApplication() {
	    
	}

	@Given("click on login button")
	public void clickOnLoginLink() {
	    
	}

	@Given("enter the valid username as logesh{int} in username textfield")
	public void enterTheValidUsernameAsLogeshInUsernameTextfield(Integer int1) {
	   
	}

	@Given("enter the valid password as Logesh@{int} in the password textfield")
	public void enterTheValidPasswordAsLogeshInThePasswordTextfield(Integer int1) {
	
	}

	@When("click on login button")
	public void clickOnLoginButton() {
	    
	}

	@Then("home page should be displayed")
	public void homePageShouldBeDisplayed() {
	    
	
	

}
}