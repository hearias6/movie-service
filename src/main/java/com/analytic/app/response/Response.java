package com.analytic.app.response;

public class Response {
	
	private int status;
	private Object message;
	
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Response(int status, Object message) {
		super();
		this.status = status;
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Object getMessage() {
		return message;
	}

	public void setMessage(Object message) {
		this.message = message;
	}
	

}
