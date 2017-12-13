package org.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exm_choices")
public class QuestionChoices {
	public QuestionChoices() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "choiceid")
	private int choiceId;

	@Column(name = "questionid")
	private int questionId;

	@Column(name = "choice")
	private String choice;

	public int getChoiceId() {
		return choiceId;
	}

	public void setChoiceId(int choiceId) {
		this.choiceId = choiceId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

}
