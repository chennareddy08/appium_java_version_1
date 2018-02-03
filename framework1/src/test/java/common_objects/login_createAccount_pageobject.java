package common_objects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class login_createAccount_pageobject {
	WebDriver driver;
	//WebDriverWait wait = new WebDriverWait(driver, 5);
	
	public login_createAccount_pageobject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, 5, TimeUnit.SECONDS), this);
	}
	
//-------------------List of Webelements--------------------------------------------------------------------	

	
	
	//By ok_button = By.id("OK");
//	By cancel_button = By.id("Cancel");
//  OR
	
	@iOSFindBy(id = "OK") WebElement ok_button;
	@iOSFindBy(id = "Cancel") WebElement cancel_button;
	@iOSFindBy(id = "SKIP") WebElement skip_button;
	@iOSFindBy(id = "YOUR WORKOUTS ON DEMAND") WebElement start_screen;
	@iOSFindBy(id = "Have an account? Log in.") WebElement login_link;
	@iOSFindBy(id = "Get Started") WebElement create_account_link;
	@iOSFindBy(xpath ="//XCUIElementTypeTextField[@value = 'Email']") WebElement email_field;
	@iOSFindBy(xpath = "//XCUIElementTypeSecureTextField[@value = 'Password']") WebElement password_field;
	@iOSFindBy(id = "Log In") WebElement login_button;
	@iOSFindBy(id = "Done") WebElement done_keyBoardButton;
	@iOSFindBy(id = "Welcome back, Appium") WebElement welcome_msg;
	@iOSFindBy(id = "Log Out" ) WebElement logout_option;
	@iOSFindBy(id = "hamburgerIcon" ) WebElement hamburger_menuIcon;
	@iOSFindBy(id = "Are you sure want to Logout?" ) WebElement logout_confirmation_msg;
	@iOSFindBy(id = "Logout" ) WebElement logout_button_confirmation;
	@iOSFindBy(id ="* Please enter Email") WebElement email_ErrorMSG;
	@iOSFindBy(id ="*") WebElement error_field;
	@iOSFindBy(id = "* Please enter Password") WebElement passwd_ErrorMSG;
	@iOSFindBy(id = "* Password does not match")WebElement passwd_MatchErrorMSG;
	@iOSFindBy(id = "backArrow") WebElement back_navigation_arrow;
	@iOSFindBy(id = "Log in to your account") WebElement logintitle;
	
	// forgot password-------------------------------------
	
	@iOSFindBy(id ="Forgot Password?") WebElement forgot_password_option;
	@iOSFindBy(id = "Don’t have an account? Sign up now.") WebElement signup_login_link;
	@iOSFindBy(id ="Enter your email address") WebElement forgotpasword_msg1;
	@iOSFindBy(id= "We’ll text you a verification code.") WebElement forgotpasword_msg2;
	@iOSFindBy(id = "Send My Code") WebElement  sendMyCode_button;	
	@iOSFindBy(id = "Enter your verification code") WebElement forgotpassword_verification_codeMSG;
	@iOSFindBy(xpath = "//XCUIElementTypeTextField[@value='Your Code']") WebElement yourcode_field_forgotPSW;
	@iOSFindBy(id ="Verify") WebElement verify_button_forgotPSW;
	@iOSFindBy(id ="* Email does not exists.") WebElement emailNotExist_ErrorMSG;
	@iOSFindBy(id ="* Please enter verification code") WebElement verification_ErrorMSG;
	@iOSFindBy(id ="* Invalid Pin") WebElement invalidpin_ErrorMSG;
	@iOSFindBy(id ="Reset your password") WebElement resetpasswordtitle;
	@iOSFindBy(xpath ="//XCUIElementTypeSecureTextField[@value ='Enter New Password']") WebElement password_field_forgot;
	@iOSFindBy(xpath ="//XCUIElementTypeSecureTextField[@value ='Re-enter New Password']") WebElement confirm_password_field_forgot;
	@iOSFindBy(id ="Save") WebElement save_button_forgotPSWscreen;

	
	//Create account objects
	
	@iOSFindBy(xpath ="//XCUIElementTypeTextField[@value = 'Your Phone Number']") WebElement phone_field;
	@iOSFindBy(id = "Complete") WebElement complete_button;
	@iOSFindBy(id = "Send Code") WebElement sendCode_button;
	@iOSFindBy(xpath ="//XCUIElementTypeTextField[@value = 'Enter Code']") WebElement enterCode_field;
	@iOSFindBy(id = "Confirm") WebElement confirm_button;
	@iOSFindBy(xpath ="//XCUIElementTypeTextField[@value = 'First Name']") WebElement firstNameField;
	@iOSFindBy(xpath ="//XCUIElementTypeTextField[@value = 'Last Name']") WebElement lastNameField;
	@iOSFindBy(xpath ="//XCUIElementTypeTextField[@value = 'Your Email']") WebElement yourEmailField;
	@iOSFindBy(xpath ="//XCUIElementTypeTextField[@value = 'Your Phone Number']") WebElement yourPhoneField;
	@iOSFindBy(xpath ="//XCUIElementTypeTextField[@value = 'Create Password']") WebElement createPasswordField;
	@iOSFindBy(xpath ="//XCUIElementTypeButton[@label = 'Have an account? Log in.']") WebElement loginLink_createAccount;
	@iOSFindBy(xpath ="//XCUIElementTypeStaticText[@label = 'Create Account']") WebElement createAccountTitle;
	@iOSFindBy(xpath ="//XCUIElementTypeButton[@label = 'Complete']") WebElement completeButton;
	@iOSFindBy(xpath ="//XCUIElementTypeStaticText[@label = 'Terms and Conditions']") WebElement termsConditionsLink;
	@iOSFindBy(xpath ="//XCUIElementTypeStaticText[@label = 'Privacy Policy']") WebElement privacyPolicyLink;
	@iOSFindBy(xpath ="//XCUIElementTypeButton[@label = 'backArrow']") WebElement backNavigation_CA;
	@iOSFindBy(xpath ="//XCUIElementTypeStaticText[@label = '* Please enter First Name']") WebElement firstnameError;
	@iOSFindBy(xpath ="//XCUIElementTypeStaticText[@label = '* Please enter Last Name']") WebElement lastnameError;
	@iOSFindBy(xpath ="//XCUIElementTypeStaticText[@label = '* Please enter Email']") WebElement emailError;
	@iOSFindBy(xpath ="//XCUIElementTypeStaticText[@label = '* Please enter valid Phone Number']") WebElement phoneError;
	
	
	
	
	public WebElement backNavigatioArrow()  {
		return back_navigation_arrow;
	}
	
	
	
	
	
	public WebElement ok_button()  {
		return ok_button;
	}
	
	
	public WebElement cancel_button() {
		return cancel_button;
    }
	       
	
	
	public WebElement skip_button() {
		return skip_button;
    }


	
	public WebElement start_screen() {
		return start_screen;
    }


    public WebElement login_link() {
	   return login_link;
    }
  
   
    public WebElement email_Error_MSG() {
  	  return email_ErrorMSG;
    }
    
    public WebElement get_started() {
	    return create_account_link;
    }
 
  
    public WebElement email_field() {
        return email_field;
    }

   
    public WebElement password_field() {
	    return password_field;}
 
    
    public WebElement login_button() {
	    return login_button;
    }
 
    
    public WebElement welcome_back() {
	    return welcome_msg;
    }
 
    
    public WebElement done_keyboardbutton() {
	    return done_keyBoardButton;
    }

 
    public WebElement hamburger_menu() {
	    return hamburger_menuIcon;
	}
 
    public WebElement logout_option() {
		return logout_option;
	}


    public WebElement logout_confirmation_msg() {
    	    return logout_confirmation_msg;
    }
    
    public WebElement logout_button_confirmation(){
    	return logout_button_confirmation;    
    	
    }

  public WebElement signup_login_link() {
	  return signup_login_link;
  }
  
  public WebElement error_field_point() {
	  return error_field;
  }
  
  public WebElement passwd_Error_MSG() {
	  return passwd_ErrorMSG;
  }
  
  public WebElement passwd_MatchError_MSG() {
	  return passwd_MatchErrorMSG;
  }

  public WebElement logintitle() {
	  return logintitle;
  }
  
  public WebElement forgot_password_option() {
	  return forgot_password_option;
  }
  
 public WebElement forgotpasword_msg1() {
	  return forgotpasword_msg1;
  }
 
 public WebElement forgotpasword_msg2() {
	  return forgotpasword_msg2;
 }

 public WebElement  sendMyCode_button() {
	  return  sendMyCode_button;
}
 
 public WebElement  forgotpassword_verification_codeMSG() {
	  return  forgotpassword_verification_codeMSG;
}
 
public WebElement   yourcode_field_forgotPSW() {
	  return   yourcode_field_forgotPSW;
}


public WebElement   emailNotExist_Error_MSG() {
	  return   emailNotExist_ErrorMSG;
}

public WebElement   verification_ErrorMSG() {
	  return   verification_ErrorMSG;
}

public WebElement   invalidpin_ErrorMSG() {
	  return   invalidpin_ErrorMSG;
}

//Create account 

public  WebElement phoneField() {
	return phone_field;
}

public  WebElement completeButton() {
	return complete_button;
}

public  WebElement sendCodeButton() {
	return sendCode_button;
}

public  WebElement enterCodeField() {
	return enterCode_field;
}
public  WebElement confirm_Button() {
	return confirm_button;
}

public  WebElement first_name_field() {
	return firstNameField;
}

public  WebElement last_name_field() {
	return lastNameField;
}

public  WebElement your_email_field() {
	return yourEmailField;
}

public  WebElement your_phone_field() {
	return yourPhoneField;
}

public  WebElement create_password_field() {
	return createPasswordField;
}

public  WebElement login_link_CreateAccount() {
	return loginLink_createAccount;
}

public  WebElement create_account_title() {
	return createAccountTitle;
}

public  WebElement complete_button() {
	return completeButton;
}

public  WebElement terms_conditions_link() {
	return termsConditionsLink;
}

public  WebElement privacy_policy_link() {
	return privacyPolicyLink;
}

public  WebElement back_navigation_CA() {
	return backNavigation_CA;
}

public  WebElement firstname_error() {
	return firstnameError;
}

public  WebElement lastname_error() {
	return lastnameError;
}

public  WebElement email_error() {
	return emailError;
}


public  WebElement phone_error() {
	return phoneError;
}



}