package com.ags.VisualizzDomandeConcorso.view.bean;

public class RequestBean {
	private Long eduSelectedId;
	private Long qualSelectedId;

	public Long getEduSelectedId() {
		return this.eduSelectedId;
	}

	public void setEduId(Long eduSelectedEduId) {
		this.eduSelectedId = eduSelectedEduId;
	}

	public Long getQualSelectedId() {
		return qualSelectedId;
	}

	public void setQualSelectedId(Long qualSelectedId) {
		this.qualSelectedId = qualSelectedId;
	}
}
