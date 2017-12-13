package org.exam.model;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "exm_questionanswers")
public class QuestionAnswers {
	@Column(name = "questionid")
	private int questionId;

	@Column(name = "choiceid")
	private int choiceId;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getChoiceId() {
		return choiceId;
	}

	public void setChoiceId(int choiceId) {
		this.choiceId = choiceId;
	}

	public QuestionAnswers() {
		super();
	}

}
