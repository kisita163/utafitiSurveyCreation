package com.kisita.utafitiSurveyDesign;

public class Choice {
	
	private String value;
	private int       id;

	public Choice(String choice ) {
		this.value = choice;
		this.id    = this.hashCode();
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getId() {
		return id;
	}
}
