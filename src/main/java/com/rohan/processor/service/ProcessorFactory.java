package com.rohan.processor.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rohan.processor.dao.ProcessorDAO;

@Service
public class ProcessorFactory {

	Logger logger = LoggerFactory.getLogger(ProcessorFactory.class);

	@Qualifier("ImageDAO")
	@Autowired
	ProcessorDAO imgProcessorDAO;

	@Qualifier("VideoDAO")
	@Autowired
	ProcessorDAO vidProcessorDAO;

	public ProcessorDAO getProcessorDAO(String whichOne) {
		if (whichOne.equalsIgnoreCase("I")) {
			logger.info("returning image DAO");
			return imgProcessorDAO;
		} else if (whichOne.equalsIgnoreCase("V")) {
			logger.info("returning video DAO");
			return vidProcessorDAO;
		} else
			return null;
	}
}
