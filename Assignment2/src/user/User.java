package user;


public class User {

	private long membershipId;
	private String firstName;
	private String lastName;
	private String emailId;
    private String username;
	private String password;
	
	//java.util.ArrayList<Transactions>  transactions= new java.util.ArrayList<Transactions>();//SNEHAL
	
	public User(long membershipId, String firstName, String lastName, String emailId,String username, String password)
	{
		this.membershipId = membershipId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
        this.username = username;
		this.password = password;
		
	}
	
	public User(){
		
	}
	
	public long getMembershipId() {
		return membershipId;
	}
	public void setMembershipId(long membershipId) {
		this.membershipId = membershipId;
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
        public String getUsername()  {
                return username;
        }
        public void setUsername(String username) {
                this.username = username;
        }
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	
		
}
