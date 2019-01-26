package com.kisita.utafitiSurveyDesign;

import java.io.Serializable;
import java.util.ArrayList;

public class Question implements Serializable, Cloneable {
	
	private String              question;
	private boolean             required;
	private QuestionType        type;
	
	private ArrayList<String>   choices;
	private ArrayList<Question> subquestions;
	private int id;
	

	public Question() {
		// TODO Auto-generated constructor stub
	}
	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public boolean isRequired() {
		return required;
	}


	public void setRequired(boolean required) {
		this.required = required;
	}


	public QuestionType getType() {
		return type;
	}


	public void setType(QuestionType type) {
		this.type = type;
	}


	public ArrayList<Question> getSubquestions() {
		return subquestions;
	}


	public void setSubquestions(ArrayList<Question> subquestions) {
		this.subquestions = subquestions;
	}
	public ArrayList<String> getChoices() {
		return choices;
	}
	public void setChoices(ArrayList<String> choices) {
		this.choices = choices;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
