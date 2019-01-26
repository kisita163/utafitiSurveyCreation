package com.kisita.utafitiSurveyDesign;

import java.util.ArrayList;

public class Survey {
	
	private ArrayList<Question> questions;
	
	private String              name;      

	public Survey() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
