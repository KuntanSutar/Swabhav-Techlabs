package com.org.ste.beans;

import org.springframework.web.multipart.MultipartFile;

public class BranchAddressUpdateBean {
	
	private MultipartFile branchAddressfile;

	public MultipartFile getBranchAddressfile() {
		return branchAddressfile;
	}

	public void setBranchAddressfile(MultipartFile branchAddressfile) {
		this.branchAddressfile = branchAddressfile;
	}

	

}
