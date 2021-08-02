package com.revature.Logapp;

import org.apache.log4j.Logger;

public class App 
{
	static Logger logger = Logger.getLogger("App.class");
    public static void main( String[] args )
    {   //System.out.println("in main ...");
    	logger.info("in main...");
    	for(int i=0;i<5;i++)
    		System.out.println(i);
        LogService l=new LogService();
        l.connectToDb();
        //
        // kjkdhfds
    }
}
