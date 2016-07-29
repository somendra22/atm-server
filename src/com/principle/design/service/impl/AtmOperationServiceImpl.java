package com.principle.design.service.impl;

import com.principle.design.beans.Atm;
import com.principle.design.beans.Card;
import com.principle.design.service.AtmOperationService;
import com.principle.design.service.ScreenDisplayService;

public class AtmOperationServiceImpl implements AtmOperationService {

	@Override
	public void withdrawAmount(ScreenDisplayService screen, Atm atm, Card card, String withdrawAmount) {

		if (atm.getBalanceAmount() < Integer.valueOf(withdrawAmount)) {
			// atm doesnot have enough cash , notify bank
			FileLoggingServiceImpl.logger.info("Atm is out of cash. Current balance :" + atm.getBalanceAmount());
			screen.display("Atm doest not have enough cash.");
		} else {
			atm.updateBalance(atm.getBalanceAmount() - Integer.valueOf(withdrawAmount));
			screen.display("Thanks for using our atm.");
			FileLoggingServiceImpl.logger.info("Atm amount withdraw :" + withdrawAmount);
		}
	}

	@Override
	public void depositAmountToAtm(Atm atm, String amount) {
		FileLoggingServiceImpl.logger.info("Atm deposited with  :" + amount);
		atm.updateBalance(atm.getBalanceAmount() + Integer.valueOf(amount));

	}

}
