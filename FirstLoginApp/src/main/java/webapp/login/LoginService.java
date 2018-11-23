package webapp.login;

public class LoginService{
	
	public boolean isUserValid(String user, String pass) {		
		return user.equalsIgnoreCase("rodrigo.avila") && pass.equals("Password123") ? true : false;		
	}
}