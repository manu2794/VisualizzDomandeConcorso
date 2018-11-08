package com.ags.VisualizzDomandeConcorso.view.bean;

public class RequestBean {
	private Long eduSelectedId;
	private Long qualSelectedId;
	private Long classSelectedId;
	
	private String ok;

	public Long getEduSelectedId() {
		return this.eduSelectedId;
	}

	public void setEduSelectedId(Long eduSelectedEduId) {
		this.eduSelectedId = eduSelectedEduId;
	}

	public Long getQualSelectedId() {
		return qualSelectedId;
	}

	public void setQualSelectedId(Long qualSelectedId) {
		this.qualSelectedId = qualSelectedId;
	}

	public Long getClassSelectedId() {
		return classSelectedId;
	}

	public void setClassSelectedId(Long classSelectedId) {
		this.classSelectedId = classSelectedId;
	}

	public String getOk() {
		return ok;
	}

	public void setOk(String ok) {
		this.ok = ok;
	}
}
