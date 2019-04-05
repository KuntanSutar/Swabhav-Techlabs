package com.techlab.question.bank.refactored;

import java.util.List;
import java.util.UUID;

public class Question {

	private UUID id;
	private String question;
	private List<Option> optionList;
	private int answerOptionIndex;
	
	public Question(String question, List<Option> newOptionList, int answerOptionIndex) {
		
		this.id=UUID.randomUUID();
		this.question = question;
		this.optionList = newOptionList;
		this.answerOptionIndex=answerOptionIndex;
	}

	public UUID getUUId() {
		return id;
	}

	public String getQuestion() {
		return question;
	}

	public List<Option> getOptionList() {
		return optionList;
	}

	public int getAnswerOptionIndex() {
		return answerOptionIndex;
	}
}
