package com.techlab.question.bank.refactored.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.techlab.question.bank.refactored.Option;
import com.techlab.question.bank.refactored.Question;
import com.techlab.question.bank.refactored.QuestionBank;

public class TestQuestionBank {

	public static void main(String[] args) throws IOException {

		QuestionBank questionBank = new QuestionBank();
		List<Question> questionList = questionBank.getQuestionList();
		//questionBank.appearForMCQTest(questionList);
		
		List<Question> onDemandQuestionList = questionBank.getRandomQuestionsAsPerDemand(2);
		List<Option> optionList = new ArrayList();
		Question newQuestion = new Question("What is capital of UK?", optionList, 0);
		optionList.add(new Option("1. London"));
		optionList.add(new Option("2. Nagpur"));
		optionList.add(new Option("3. Kolhapur"));
		optionList.add(new Option("4. Bhopal"));
		onDemandQuestionList.add(newQuestion);
		questionBank.addQuestionsFromCSV(onDemandQuestionList);
		questionBank.appearForMCQTest(onDemandQuestionList);
		
		UUID sampleUID = questionList.get(1).getUUId();
		Question sampleQuestion = questionBank.getQuestionByUUID(sampleUID);
		System.out.println("Get question by UUID : " + sampleQuestion.getQuestion());
	}

}
