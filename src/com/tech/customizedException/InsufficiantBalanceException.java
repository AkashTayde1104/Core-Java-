package com.tech.customizedException;

public class InsufficiantBalanceException extends RuntimeException
{
	public InsufficiantBalanceException(String s)
	{
		super(s);
	}

}
