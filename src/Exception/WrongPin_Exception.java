package Exception;

import com.tech.customizedException.WrongPinException;

public class WrongPin_Exception {
	public static void main(String[] args) throws WrongPinException {
		String pin="1234";
		if(pin=="123@A")
		{
			System.out.println("Pin has been matched");
		}
		else
		{
			throw new WrongPinException("You enter wrong pin beacusse you entered only numbers");
		}
		
	}

}
