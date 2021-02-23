package org.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locatorss extends BaseClass {
	public Locatorss(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement login;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement room_type;
	@FindBy(id="room_nos")
	private WebElement room_nos;
	@FindBy(id="adult_room")
	private WebElement adult_room;
	@FindBy(id="child_room")
	private WebElement child_room;
	@FindBy(id="Submit")
	private WebElement Submit;
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton_0;
	@FindBy(id="continue")
	private WebElement continu;
	@FindBy(id="first_name")
	private WebElement first_name;
	@FindBy(id="last_name")
	private WebElement last_name;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cc_num;
	@FindBy(id="cc_type")
	private WebElement cc_type;
	@FindBy(id="cc_exp_month")
	private WebElement cc_exp_month;
	@FindBy(id="cc_exp_year")
	private WebElement cc_exp_year;
	@FindBy(id="cc_cvv")
	private WebElement cc_cvv;
	@FindBy(id="book_now")
	private WebElement book_now;
	@FindBy(id="order_no")
	private WebElement order_no;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * @return the username
	 */
	public WebElement getUsername() {
		return username;
	}
	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return password;
	}
	/**
	 * @return the login
	 */
	public WebElement getLogin() {
		return login;
	}
	/**
	 * @return the location
	 */
	public WebElement getLocation() {
		return location;
	}
	/**
	 * @return the hotels
	 */
	public WebElement getHotels() {
		return hotels;
	}
	/**
	 * @return the room_type
	 */
	public WebElement getRoom_type() {
		return room_type;
	}
	/**
	 * @return the room_nos
	 */
	public WebElement getRoom_nos() {
		return room_nos;
	}
	/**
	 * @return the adult_room
	 */
	public WebElement getAdult_room() {
		return adult_room;
	}
	/**
	 * @return the child_room
	 */
	public WebElement getChild_room() {
		return child_room;
	}
	/**
	 * @return the submit
	 */
	public WebElement getSubmit() {
		return Submit;
	}
	/**
	 * @return the radiobutton_0
	 */
	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}
	/**
	 * @return the continu
	 */
	public WebElement getContinu() {
		return continu;
	}
	/**
	 * @return the first_name
	 */
	public WebElement getFirst_name() {
		return first_name;
	}
	/**
	 * @return the last_name
	 */
	public WebElement getLast_name() {
		return last_name;
	}
	/**
	 * @return the address
	 */
	public WebElement getAddress() {
		return address;
	}
	/**
	 * @return the cc_num
	 */
	public WebElement getCc_num() {
		return cc_num;
	}
	/**
	 * @return the cc_type
	 */
	public WebElement getCc_type() {
		return cc_type;
	}
	/**
	 * @return the cc_exp_month
	 */
	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}
	/**
	 * @return the cc_exp_year
	 */
	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}
	/**
	 * @return the cc_cvv
	 */
	public WebElement getCc_cvv() {
		return cc_cvv;
	}
	/**
	 * @return the book_now
	 */
	public WebElement getBook_now() {
		return book_now;
	}
	/**
	 * @return the order_no
	 */
	public WebElement getOrder_no() {
		return order_no;
	}
	

}
