package JUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.JUnit4;

public class ConcateTest {

	@Test
	public void testUsernameValidation() {
		JUnitExample test = new JUnitExample();
		
		String username = "";
		
		//the user introduces a username without numbers, with all their characters lowercase and within 5-20 character length
		
		//1.- username with length of 20 must be accepted
		username = "abcdefghijklmnopqrst";
		assertEquals(true, test.validateUsername(username));
		
		//2.- username with length of 5 must be accepted
		username = "abcde";
		assertEquals(true, test.validateUsername(username));
		
		//3.- username with length of 0 must be rejected
		username = "";
		assertEquals(false, test.validateUsername(username));
		
		//4.- username with length of 25 must be rejected
		username = "abcdefghijklmnopqrstuvwxy";
		assertEquals(false, test.validateUsername(username));
		
		//5.- username with length of 10 must be accepted
		username = "abcdefghij";
		assertEquals(true, test.validateUsername(username));
		
		//6.- username with one number at the last position must be rejected
		username = "abcdefghi1";
		assertEquals(false, test.validateUsername(username));
		
		//7.- username with one number at the first position must be rejected
		username = "1bcdefghi";
		assertEquals(false, test.validateUsername(username));
		
		//8.- username with uppercase letters must be rejected
		username = "1bcA";
		assertEquals(false, test.validateUsername(username));
	}
}
