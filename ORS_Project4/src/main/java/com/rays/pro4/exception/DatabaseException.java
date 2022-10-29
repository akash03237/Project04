package com.rays.pro4.exception;

/**
 * DatabaseException is propogated by DAO classes when an unhandled Database
 * exception occurred.
 * 
 * @author Akash Soni
 */

public class DatabaseException extends Exception {

	public DatabaseException(String msg){
		super(msg);
	}
	
}
