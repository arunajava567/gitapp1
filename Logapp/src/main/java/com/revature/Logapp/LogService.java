package com.revature.Logapp;

import org.apache.log4j.Logger;

public class LogService {
	static Logger logger = Logger.getLogger("LogService.class");
	  
	void connectToDb() {
		
	//	System.out.println(" in service...");
		logger.info("in service...");
		
		Db d=new Db();
		logger.warn("this is simple warning...");
		d.connection();
		
		logger.fatal("error");
		
	}

}
