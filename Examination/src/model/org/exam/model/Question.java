package org.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exm_question")
public class Question {
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "questionid")
	private int questionId;

	@Column(name = "materialid")
	private int materialId;

	@Column(name = "question")
	private String question;

	@Column(name = "category")
	private String category;

	@Column(name = "answerchoiceid")
	private int answerChoiceId;

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getMaterialId() {
		return materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}

	public int getAnswerChoiceId() {
		return answerChoiceId;
	}

	public void setAnswerChoiceId(int answerChoiceId) {
		this.answerChoiceId = answerChoiceId;
	}

	public String getQuestion() {
		return question;
	}

}
