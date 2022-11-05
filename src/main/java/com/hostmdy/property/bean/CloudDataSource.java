package com.hostmdy.property.bean;

public class CloudDataSource {
	
	private String service;
	private String authentication;
	private String cached;
	
	
	public CloudDataSource() {}
	
	public CloudDataSource(String service, String authentication, String cached) {
		super();
		this.service = service;
		this.authentication = authentication;
		this.cached = cached;
	}


	public String getService() {
		return service;
	}


	public void setService(String service) {
		this.service = service;
	}


	public String getAuthentication() {
		return authentication;
	}


	public void setAuthentication(String authentication) {
		this.authentication = authentication;
	}


	public String getCached() {
		return cached;
	}


	public void setCached(String cached) {
		this.cached = cached;
	}
	
	
	
	

}
