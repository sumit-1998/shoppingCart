package userModel;

public class User 
{
	int userId;
	String firstName;
	String lastName;
	String emailId;
	String dob;
	String phoneNo;
	String password;
	String forgetPasswordQuestion;
	String forgetPasswordAnswer;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getForgetPasswordQuestion() {
		return forgetPasswordQuestion;
	}
	public void setForgetPasswordQuestion(String forgetPasswordQuestion) {
		this.forgetPasswordQuestion = forgetPasswordQuestion;
	}
	public String getForgetPasswordAnswer() {
		return forgetPasswordAnswer;
	}
	public void setForgetPasswordAnswer(String forgetPasswordAnswer) {
		this.forgetPasswordAnswer = forgetPasswordAnswer;
	}
	
}
