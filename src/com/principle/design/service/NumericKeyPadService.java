package com.principle.design.service;

import java.util.Scanner;

public interface NumericKeyPadService {

	String getCardPin(Scanner inputSvanner);

	String getAmountToWithdraw(Scanner inputSvanner);
}
