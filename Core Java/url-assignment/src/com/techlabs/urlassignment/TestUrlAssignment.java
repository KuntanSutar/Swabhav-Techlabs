package com.techlabs.urlassignment;

public class TestUrlAssignment {

	public static void main(String[] args) {
		String url = "http://www.swabhavtechlabs.com?developer=Kuntan&client=Aurionpro";
		String domain;
		String developer = "";
		String client = "";

		String[] urlSplitAtQuestionMark = url.split("\\?");

		String[] urlSplitAtDot = urlSplitAtQuestionMark[0].split("\\.");

		System.out.println("Domain : " + urlSplitAtDot[1]);

		if (urlSplitAtQuestionMark.length > 1) {
			String[] urlSplitAtAndSymbol = urlSplitAtQuestionMark[1].split("&");
			for (String element : urlSplitAtAndSymbol) {
				if (element.startsWith("developer")) {
					developer = element.substring(10);
				}
				if (element.startsWith("client")) {
					client = element.substring(7);
				}
			}
		}
		System.out.println("Developer : " + developer);
		System.out.println("Client : " + client);
	}

}
