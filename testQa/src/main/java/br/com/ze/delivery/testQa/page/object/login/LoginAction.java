package br.com.ze.delivery.testQa.page.object.login;

import static br.com.ze.delivery.testQa.core.setup.DriverFactory.getDriver;

import br.com.ze.delivery.testQa.page.factory.login.LoginFactory;

public class LoginAction {
	
	LoginFactory loginFactory = new LoginFactory(getDriver());

	public void insertEmail(String mail) {
		loginFactory.field_email.sendKeys(mail);
	}
	
	public void inserPassword(String password) {
		loginFactory.field_password.sendKeys(password);
	}
	
	public void clickLoginMail() {
		loginFactory.btn_mail.click();
	}
	
	public void clickLoginFaceBook() {
		loginFactory.btn_facebook.click();
	}
	
	public void clickPasswordForgot() {
		loginFactory.link_forgot.click();
	}
	
	public void clickAccount() {
		loginFactory.link_account.click();
	}
}
