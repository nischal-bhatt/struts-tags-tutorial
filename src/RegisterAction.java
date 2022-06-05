import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{

	String firstName;
	String lastName;
	String gender;
	Integer age;
	String email;
	String address;
	String selectedColor;
	List<String> colors;
	Boolean subscription;
	List<String> hobbies;
	String selectedHobbies;
	List<Product> products;
	
	public String initializeFormFields()
	{
		this.initializeColors();
		this.initializeHobbies();
		this.initializeProducts();
		return "input";
	}
	
	public void initializeProducts()
	{
		products = new ArrayList<Product>();
		products.add(new Product(1,"ob",2));
		products.add(new Product(2,"ak",5));
	}
	
	public void initializeHobbies()
	{
		this.hobbies = new ArrayList<String>();
		this.hobbies.add("programming");
		this.hobbies.add("teaching");
	}
	
	public void initializeColors()
	{
		colors = new ArrayList<String>();
		colors.add("orange");
		colors.add("amara");
		
		
	}
	
	public String execute()
	{
		//validation of the request fields
		// are cross cutting tasks and cannot be put here
		System.out.println("execute() method called");
		
		if (this.subscription == true)
		{
			System.out.println("you're a subscriuber");
		}else
		{
			System.out.println("youre not a subscriber");
		}
		
		return "success";
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSelectedColor() {
		return selectedColor;
	}

	public void setSelectedColor(String selectedColor) {
		this.selectedColor = selectedColor;
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
	}

	public Boolean getSubscription() {
		return subscription;
	}

	public void setSubscription(Boolean subscription) {
		this.subscription = subscription;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public String getSelectedHobbies() {
		return selectedHobbies;
	}

	public void setSelectedHobbies(String selectedHobbies) {
		this.selectedHobbies = selectedHobbies;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
	/*
	public void validate()
	{
		if (firstName.equals(""))
		{
			addFieldError("firstName","first name required");
		}
		
		if (lastName.equals(""))
		{
			addFieldError("lastName","last  name required");
			
		}
		
		if (gender == null)
		{
			addFieldError("gender"," gender is required");
		}
		
		if (age == null)
		{
			addFieldError("age", "age is required");
		}else if (age <= 18)
		{
			addFieldError("age", "age should be above 18");
		}
		
		if (email.equals(""))
		{
			addFieldError("email", "email is required");
		}

		
	}
	*/
	
	
}
