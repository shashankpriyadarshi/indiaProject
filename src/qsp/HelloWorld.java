package qsp;

public class HelloWorld {

	private String emailAddress;

	public String getEmailAddress() {
		return emailAddress;

	}

	public void setEmailAddress(String email) {
		if(email.indexOf("@")!=-1) {
		System.out.println(this.emailAddress=email);	
		}else {
			throw  new IllegalStateException ("this is invALID EMAILADDRESS");
		}
		
	}

}
