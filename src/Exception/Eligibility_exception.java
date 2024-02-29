package Exception;

import com.tech.customizedException.NotEligibleException;

public class Eligibility_exception {
	public static void main(String[] args) {
		int age=17;
		if(age>=18)
		{
			System.out.println("You are eligible for voting");
		}
		else
		{
			throw new NotEligibleException("You are not eligible for voting because your age is lesss than 18");
		}
	}

}
