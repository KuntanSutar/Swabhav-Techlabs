package com.org.ste.beans;

import org.springframework.web.multipart.MultipartFile;

public class ProposalFormBean {
	
	private MultipartFile file;

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

}
