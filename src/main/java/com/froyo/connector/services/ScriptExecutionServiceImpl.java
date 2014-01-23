package com.froyo.connector.services;

import com.froyo.connector.domain.Message;

/**
 * Example CXF REST endpoint. 
 */
public class ScriptExecutionServiceImpl implements ScriptExecutionService {
	
	
	public Message execute() {		
		
		Message msg = new Message();
		msg.setName("exampleresponse");		
		return msg;
	}

}