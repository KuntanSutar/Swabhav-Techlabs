package com.techlab.singleton.test;

import com.techlab.singleton.SingleObjectProducer;

public class TestSingleObjectProducer {

	public static void main(String[] args) {
		
		SingleObjectProducer singleObjectProducer = SingleObjectProducer.getInstance();
		singleObjectProducer.produceOnlySingleObject();
	}

}
