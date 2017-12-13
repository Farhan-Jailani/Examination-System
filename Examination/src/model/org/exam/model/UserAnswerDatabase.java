package org.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "exm_answerdatabase")
public class UserAnswerDatabase {
	public UserAnswerDatabase() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Column(name = "examid")
	private int examId;

	@Column(name = "questionid")
	private int questionId;

	@Column(name = "userid")
	private int userId;

	@Column(name = "useranswer")
	private int userAnswer;

	@Column(name = "answer")
	private int answer;

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getUserAnswer() {
		return userAnswer;
	}

	public void setUserAnswer(int userAnswer) {
		this.userAnswer = userAnswer;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

}
