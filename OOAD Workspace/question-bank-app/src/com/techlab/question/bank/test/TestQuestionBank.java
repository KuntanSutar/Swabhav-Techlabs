package com.techlab.question.bank.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

import com.techlab.question.bank.Option;
import com.techlab.question.bank.Question;
import com.techlab.question.bank.QuestionBank;

public class TestQuestionBank {

	public static void main(String[] args) {

		int correctAnswerCount = 0;
		Scanner sc = new Scanner(System.in);
		QuestionBank questionBank = new QuestionBank();
		questionBank.initQuestions();
		List<Question> questionList = questionBank.getQuestionList();

		/*
		 * for (Question question : questionList) {
		 * System.out.println(question.getQuestion()); List<Option> optionList =
		 * question.getOptionList(); for (Option option : optionList) {
		 * System.out.println(option.getOption()); } System.out.println();
		 * System.out.print("Enter answer option : "); int answerIndex = sc.nextInt();
		 * if (answerIndex - 1 == question.getAnswerOptionIndex()) {
		 * correctAnswerCount++; } } System.out.println("Correct answers : " +
		 * correctAnswerCount); System.out.println(questionList.get(0).getUUId());
		 */

		int demandedCorrectOption=0;
		List<Question> demandedQuestions = questionBank.getRandomQuestionsAsPerDemand(2);
		for (Question question : demandedQuestions) {
			System.out.println(question.getQuestion());
			List<Option> optionList = question.getOptionList();
			for (Option option : optionList) {
				System.out.println(option.getOption());
			}
			System.out.println();
			System.out.print("Enter answer option : ");
			int answerIndex = sc.nextInt();
			if (answerIndex - 1 == question.getAnswerOptionIndex()) {
				demandedCorrectOption++;
			}
		}

		UUID sampleUID = questionList.get(1).getUUId();
		Question sampleQuestion = questionBank.getQuestionByUUID(sampleUID);
		System.out.println("Get question by UUID : "+sampleQuestion.getQuestion());
	}

}
