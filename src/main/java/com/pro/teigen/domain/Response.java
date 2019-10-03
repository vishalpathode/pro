package com.pro.teigen.domain;

import java.io.Serializable;

public class Response implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -942141428228473433L;
	
	private String message;
	private String status;
	
	public Response(String message, String error) {
		super();
		this.message = message;
		this.status = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
