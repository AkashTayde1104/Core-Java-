package Exception;

import com.tech.customizedException.InvalidPasswordException;

public class Password_exception {
	public static void main(String[] args) throws InvalidPasswordException {
		int x=223;
		if(x==123)
		{
			System.out.println("Password is matched");
		}
		else
		{
			throw new InvalidPasswordException("Invalid Password");
		}
	}

}
