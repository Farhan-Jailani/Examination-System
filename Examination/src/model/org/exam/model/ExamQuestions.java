package org.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "exm_examquestions")
public class ExamQuestions {
	public ExamQuestions() {
		super();
	}

	@Column(name = "examid")
	private int examId;

	@Column(name = "questionid")
	private int questionId;

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

}
