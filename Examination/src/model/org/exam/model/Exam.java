package org.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exm_examdetials")
public class Exam {
	public Exam() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "examid")
	private int examId;

	@Column(name = "name")
	private String name;

	@Column(name = "passmark")
	private int passMark;

	@Column(name = "startdate")
	private String startDate;

	@Column(name = "enddate")
	private String endDate;

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPassMark() {
		return passMark;
	}

	public void setPassMark(int passMark) {
		this.passMark = passMark;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startTime) {
		this.startDate = startTime;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endTime) {
		this.endDate = endTime;
	}

}
