package com.principle.design.service.impl;

import java.util.Scanner;

import com.principle.design.service.NumericKeyPadService;

public class NumericKeypadServiceImpl implements NumericKeyPadService{

	@Override
	public String getCardPin(Scanner inputScanner) {
		FileLoggingServiceImpl.logger.info("Reading card pin");
		return inputScanner.nextLine();
	}

	@Override
	public String getAmountToWithdraw(Scanner inputScanner) {
		FileLoggingServiceImpl.logger.info("Reading amount to be withdrawn");
		return inputScanner.nextLine();
	}

}
