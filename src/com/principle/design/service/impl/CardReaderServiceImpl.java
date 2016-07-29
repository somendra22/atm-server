package com.principle.design.service.impl;

import java.util.Scanner;

import com.principle.design.service.CardReaderService;

public class CardReaderServiceImpl implements CardReaderService {

	@Override
	public String readCard(Scanner inputScanner) {

		FileLoggingServiceImpl.logger.info("Reading card number");
		return inputScanner.nextLine();
	}

}
