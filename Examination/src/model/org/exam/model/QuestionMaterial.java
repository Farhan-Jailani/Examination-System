package org.exam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "material")
public class QuestionMaterial {
	public QuestionMaterial() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "materialid")
	private int materialId;

	@Column(name = "text")
	private String text;

	public int getMaterialId() {
		return materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
