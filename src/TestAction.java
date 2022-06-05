import com.opensymphony.xwork2.Action;

//ActionSupport class implements Action interface
public class TestAction implements Action{

	String message;
	String firstName;
	
	//implements
	public String execute()
	{
		System.out.println("execute() method called");
		message = "SUCCESS Message";
		System.out.println("Name: "+firstName);
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
}
