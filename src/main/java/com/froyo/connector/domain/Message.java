package com.froyo.connector.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "message")
public class Message {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}