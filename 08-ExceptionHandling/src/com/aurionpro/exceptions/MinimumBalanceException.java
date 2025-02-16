package com.aurionpro.exceptions;

import com.aurionpro.model.*;

public class MinimumBalanceException extends RuntimeException {
	
	public String getMessage(){
		return "Minimum balance must be above" + Account.getMinBalance();
	}
}
