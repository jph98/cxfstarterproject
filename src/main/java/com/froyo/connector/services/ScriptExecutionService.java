package com.froyo.connector.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.froyo.connector.domain.Message;

@Path("/scriptexecution")
@Consumes("application/xml")
@Produces("application/xml")
public interface ScriptExecutionService {
	
	@GET	
	Message execute();
}