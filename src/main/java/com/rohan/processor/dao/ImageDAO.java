package com.rohan.processor.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("ImageDAO")
public class ImageDAO implements ProcessorDAO{

	Logger logger = LoggerFactory.getLogger(ImageDAO.class);
	
	@Override
	public boolean validate(String content) {
		logger.info("SAVE image validation status:"+content);
		return true;
	}

	@Override
	public void persist(String content) {
		logger.info("SAVE image :"+content);
	}

}
