package JUnitTest;

public class JUnitExample {

	public boolean validateUsername(String username) {
		System.out.println(username);
		if (username.length() < 5 || username.length() > 20) {
			return false;
		}
		
		for(int i = 0; i < username.length();i++) {
			if(Character.isDigit(username.charAt(i))) {
				return false;
			}
			if(Character.isUpperCase(username.charAt(i))) {
				return false;
			}
		}
		return true;	
	}
}
	