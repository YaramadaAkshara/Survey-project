package com.example.demo.survey;



public interface Answerservice  {

	public Answers getAnswerDetails(String email) throws Exception ;
	public Answers getfilledDetails(String email) throws Exception ;
	
	
}
