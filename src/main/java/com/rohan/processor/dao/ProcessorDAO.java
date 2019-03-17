package com.rohan.processor.dao;

public interface ProcessorDAO {
	
	public boolean validate(String content);
	
	public void persist(String content);
	
}
