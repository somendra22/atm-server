package com.principle.design.service.impl;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.principle.design.beans.AbstractLogger;
import com.principle.design.service.LoggingService;

public class FileLoggingServiceImpl extends AbstractLogger implements LoggingService  {

	public static Logger logger;
	private static FileHandler fh;

	static {
		logger = Logger.getLogger("AtmLogger");
		logger.setUseParentHandlers(false);
		try {
			fh = new FileHandler("logs/atm.log");
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
