package com.rohan.processor.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("VideoDAO")
public class VideoDAO implements ProcessorDAO{

	Logger logger = LoggerFactory.getLogger(VideoDAO.class);
	
	@Override
	public boolean validate(String content) {
		logger.info("SAVE video validation Status:"+content);
		return true;
	}

	@Override
	public void persist(String content) {
		logger.info("SAVE video :"+content);
	}

}
