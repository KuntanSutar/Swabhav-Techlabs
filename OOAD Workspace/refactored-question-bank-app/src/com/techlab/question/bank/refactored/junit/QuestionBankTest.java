package com.techlab.question.bank.refactored.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import com.techlab.question.bank.refactored.Question;
import com.techlab.question.bank.refactored.QuestionBank;

class QuestionBankTest {

	@Test
	void testForGetQuestionByUUID() {
		QuestionBank questionBank = new QuestionBank();
		questionBank.initQuestions();
		List<Question> questionList = questionBank.getQuestionList();
		Question question = questionList.get(0);
		UUID expectedUUID=question.getUUId();
		assertEquals(expectedUUID, questionList.get(0).getUUId());
	}

}
