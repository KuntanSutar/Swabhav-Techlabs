package com.techlab.action;

import com.opensymphony.xwork2.Action;

public class WelcomeAction implements Action {

	private String developerName;
	private String result;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getDeveloperName() {
		return developerName;
	}

	public void setDeveloperName(String developerName) {
		this.developerName = developerName;
	}

	@Override
	public String execute() throws Exception {
		if (developerName.length()==0) {
			result = "Welcome to Struts";
		} else {
			result = "Welcome " + developerName;
		}
		return this.SUCCESS;
	}

}
