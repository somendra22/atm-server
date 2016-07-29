package com.principle.design.service.impl;

import com.principle.design.beans.Card;
import com.principle.design.service.ValidationService;

public class CardValidation implements ValidationService {

	@Override
	public Boolean verify(Card card) {

		if (card.getCardNumber().charAt(2) == card.getPin().charAt(0)) {
			return true;
		} else {
			System.out.println("Pin is wrong.Please re-enter details");
			return false;
		}
	}

}
