package com.principle.design;

import java.util.Arrays;
import java.util.Scanner;

import com.principle.design.beans.Atm;
import com.principle.design.beans.Bank;
import com.principle.design.beans.BankBranch;
import com.principle.design.beans.Card;
import com.principle.design.service.AtmOperationService;
import com.principle.design.service.CardReaderService;
import com.principle.design.service.NumericKeyPadService;
import com.principle.design.service.ScreenDisplayService;
import com.principle.design.service.ValidationService;
import com.principle.design.service.impl.AtmOperationServiceImpl;
import com.principle.design.service.impl.CardReaderServiceImpl;
import com.principle.design.service.impl.CardValidation;
import com.principle.design.service.impl.NumericKeypadServiceImpl;
import com.principle.design.service.impl.ScreenDisplayServiceImpl;

public class AtmServer {

	public static void main(String[] args) {

		ScreenDisplayService screen = new ScreenDisplayServiceImpl();
		Scanner input = new Scanner(System.in);
		screen.display("Enter bank name : ");
		String bankName = input.nextLine();
		screen.display("Enter branch  name : ");
		String branchName = input.nextLine();

		ValidationService validator = new CardValidation();
		CardReaderService cardReader = new CardReaderServiceImpl();
		NumericKeyPadService keypad = new NumericKeypadServiceImpl();
		AtmOperationService atmOperationService = new AtmOperationServiceImpl();
		Atm atm = new Atm(1, 2, 5000);
		BankBranch branch = new BankBranch(branchName, Arrays.asList(atm));
		Bank bank = new Bank(bankName, branch);
		while (true) {
			screen.display("******Welcome to "+bank.getName()+ " ATM; " +bank.getBranch()+ " branch******");
			screen.display("1.Withdraw ");
			screen.display("2.Deposit ");
			String option = input.nextLine();

			if (option.equals("1")) {
				Card card;
				String cardNumber, pin, amount;
				do {
					screen.display("1.Enter Card Number");
					cardNumber = cardReader.readCard(input);
					screen.display("2.Enter pin number");
					pin = keypad.getCardPin(input);
					card = new Card(cardNumber, pin);
				} while (!validator.verify(card));
				screen.display("3.Enter amount");
				amount = keypad.getAmountToWithdraw(input);

				atmOperationService.withdrawAmount(screen, atm, card, amount);

			} else {

				System.out.println("Enter amount to deposit in atm");
				String amount = input.nextLine();
				atmOperationService.depositAmountToAtm(atm, amount);
				System.out.println("Atm new balance : " + atm.getBalanceAmount());
			}

		}

	}
}
