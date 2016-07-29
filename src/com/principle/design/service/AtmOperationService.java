package com.principle.design.service;

import com.principle.design.beans.Atm;
import com.principle.design.beans.Card;

public interface AtmOperationService {

	void withdrawAmount(ScreenDisplayService screen, Atm atm, Card card, String amount);
	
	void depositAmountToAtm(Atm atm , String amount);

}
