package com.revature.Logapp;

import org.apache.log4j.Logger;

public class Db {
	static Logger logger = Logger.getLogger("Db.class");
	  
	
	public void connection () {
		//System.out.println("connected....");
		logger.info("connected...");
	}

}
